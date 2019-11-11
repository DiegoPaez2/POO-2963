package ec.edu.espe.createbook.model;

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

    public void addBook(ArrayList<Book> listBook){
        String fileTheBooks= "Books.csv";
        File file = new File (fileTheBooks);
        if(file.exists())file.delete();
        try  {
            CsvWriter writer = new CsvWriter(new FileWriter(fileTheBooks,true),';');
            for(Book newBook : listBook){
                writer.write(newBook.getTitle());
                writer.write(newBook.getAuthor());
                writer.write(newBook.getEditorial());
                writer.write(Integer.toString(newBook.getYear()));
                writer.endRecord();
            }writer.close();
        }catch(IOException e){
        }
    }
    
    
    
    public ArrayList<Book> readBooks(){
        ArrayList<Book> listBook = new ArrayList<Book>();      
        try{
            String fileTheBooks= "Book.csv";
            File fileBook = new File(fileTheBooks);
            if(fileBook .exists()){
                FileReader fr = new FileReader(fileBook );
                BufferedReader br = new BufferedReader(fr);
                String line;
                while((line = br.readLine())!=null){
                    Book book = new Book();
                    String[] contact = line.split(";");
                    book.setTitle(contact[0]);
                    book.setAuthor(contact[1]);
                    book.setEditorial(contact[2]);
                    book.setYear(Integer.parseInt(contact[3]));
                    listBook.add(book);
                }br.close();
            }
        }catch(Exception e){
            System.out.println(e);
        }return listBook; 
    }
    
    
    public void showForEditorial(String editorial){
        System.out.println("The books by editorial are: ");
        System.out.println(editorial);
        ArrayList<Book> listBook = new ArrayList<Book>();
        listBook = readBooks();
        for (int i = 0; i < listBook.size(); i++) {
            Book book = new Book();
            book = listBook.get(i);
            if (book.getEditorial().equals(editorial)) {
                book.showBook();
            }
        }
    }
    
    public void showBookYear(int year){
        System.out.println("Books of ");
        System.out.println(year);
        ArrayList<Book> listBook = new ArrayList<Book>();
        listBook = readBooks();
        for (int i = 0; i < listBook.size(); i++) {
            Book book = new Book();
            book = listBook.get(i);
            if (book.getYear()==year) {
                book.showBook();
            }
        }
    }
    
    
    
    
    public void booksOfEditorial(String editorial){
        int accountant = 0;
        ArrayList<Book> listBook = new ArrayList<Book>();
        listBook = readBooks();      
        for (int i = 0; i < listBook.size(); i++) {
            Book book = new Book();
            book = listBook.get(i);
            if (book.getEditorial().equals(editorial)) {
                accountant++;
            }
        }System.out.println("The Editorial "+editorial+" have "+accountant+" Books");
    }
}
