from flask import Blueprint, request, jsonify
from app.constants import GET, POST, PUT
from .plugins import db
import json
from .serializers import AuthorSerializer, BookSerializer
from .models import Author, Book

urls = Blueprint('urls', __name__)

# define your routes here
@urls.route('/author', methods=POST)
def create_author():
    author_serializer = AuthorSerializer()
    new_author = author_serializer.load(request.json, partial=True)
    db.session.add(new_author)
    db.sessions.commit()
    return author_serializer.jsonfy(new_author), 201


@urls.route('/author', methods=GET)
def get_authors(_id):
    author_serializer = AuthorSerializer(many=True)
    authors = Author.query.all()
    serialized_autors = author_serializer.dump(authors)
    return jsonify(serialized_autors)


@urls.route('/author/id/<_id>', methods=GET)
def get_author(_id):
    author = Author.query.get(_id)
    return AuthorSerializer().jsonify(author)


@urls.route('/book', methods=POST)
def create_book():
    book_serializer = BookSerializer()
    new_book = book_serializer.load(request, json, partial=True)
    db.session.add(new_book)
    db.sessions.commit()
    return book_serializer.jsonify(new_book), 201


@urls.route('/book', methods=GET)
def get_books():
    book_serializer = BookSerializer(many=True)
    books = Book.query.all()
    serialized_books = book_serializer.dump(books)
    return jsonify(serialized_books)


@urls.route('/book/id/<_id>', methods=GET)
def get_book(_id):
    book = Book.query.get(_id)
    return BookSerializer().jsonify(book)
