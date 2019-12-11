package ec.edu.espe.createbook.mode;

import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Manager {

    public Manager() {
    }

    public void addBook(ArrayList<Book> bookList) {
        String bookFile = "Book.csv";
        File file = new File(bookFile);
        if (file.exists()) {
            file.delete();
        }
        try {
            CsvWriter writer = new CsvWriter(new FileWriter(bookFile, true), ';');
            for (Book newBook : bookList) {
                writer.write(newBook.getTitle());
                writer.write(newBook.getAuthor());
                writer.write(newBook.getEditorial());
                writer.write(Integer.toString(newBook.getYear()));
                writer.endRecord();
            }
            writer.close();
        } catch (IOException e) {
        }
    }

    public ArrayList<Book> readBooks() {
        ArrayList<Book> bookList = new ArrayList<>();

        try {
            String bookFile = "Book.csv";
            File file = new File(bookFile);
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    Book book = new Book();
                    String[] contact = line.split(";");
                    book.setTitle(contact[0]);
                    book.setAuthor(contact[1]);
                    book.setEditorial(contact[2]);
                    book.setYear(Integer.parseInt(contact[3]));
                    bookList.add(book);
                }
                br.close();
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
        return bookList;
    }

    public void showBookByYear(int year) {
        System.out.println("Books of " + year);
        ArrayList<Book> bookList = new ArrayList<>();
        bookList = readBooks();
        for (int i = 0; i < bookList.size(); i++) {
            Book book = new Book();
            book = bookList.get(i);
            if (book.getYear() == year) {
                book.showInformationBook();
            }
        }
    }

    public void booksByEditorial(String editorial) {
        System.out.println("Books of " + editorial);

        ArrayList<Book> bookList = new ArrayList<>();
        bookList = readBooks();
        for (int i = 0; i < bookList.size(); i++) {
            Book book = new Book();
            book = bookList.get(i);
            if (book.getEditorial().equals(editorial)) {
                book.showInformationBook();
            }
        }
    }

    public void numBooksForEditorial(String editorial) {
        int num = 0;
        ArrayList<Book> bookList = new ArrayList<>();
        bookList = readBooks();
        for (int i = 0; i < bookList.size(); i++) {
            Book book = new Book();
            book = bookList.get(i);
            if (book.getEditorial().equals(editorial)) {
                num++;
            }
        }
        System.out.println("The Editorial " + editorial);
        System.out.println(" Have: " + num + " Books");
    }

}
