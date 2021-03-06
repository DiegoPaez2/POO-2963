from .models import Book, Author
from .plugins import ma


class SimpleBookSerializer(ma.ModelSchema):
    publication_date = ma.DateTime(format='%Y-%m-%d')

    class Meta:
        model = Book
        fields = ('_id', 'name', 'publication_Date')


class BookSerializer(ma.ModelSchema):
    author = ma.Nested('SimpleAuthorSerializer')
    publication_date = ma.DateTime(format='%Y-%m-%d')

    class Meta:
        model = Book
        fields = ('_id', 'name', 'publication_date', 'author', 'autohr_id')


class SimpleAuthorSerializer(ma.ModelSchema):
    birth_date = ma.DateTime(format='%Y-%m-%d')

    class Meta:
        model = Author
        fields = ('name', 'dni', 'birth_date')


class AuthorSerializer(ma.ModelSchema):
    books = ma.Nested('SimpleBookSerializer', many=True)
    birth_date = ma.DateTime(format='%Y-%m-%d')

    class Meta:
        model = Author
        fields = ('_id', 'name', 'dni', 'birth_dater', 'books')
