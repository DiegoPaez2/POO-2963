package ec.edu.espe.createbook.mode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean exit = true;
        int option;
        Manager managerBook = new Manager();
        ArrayList<Book> bookList = new ArrayList<>();
        while (exit) {
            System.out.println("Book  System");
            System.out.println("1) Add a book");
            System.out.println("2) Show all books");
            System.out.println("3) Find books for year");
            System.out.println("4) Find books by Editorial");
            System.out.println("5) Count books by Editorial");
            System.out.println("6) Exit");

            System.out.println("Enter a option ");
            option = Integer.parseInt(scn.nextLine());

            switch (option) {
                case 1:
                    Book book = new Book();
                    book.dataEntry();
                    bookList = managerBook.readBooks();
                    bookList.add(book);
                    managerBook.addBook(bookList);
                    break;
                case 2:
                    bookList = managerBook.readBooks();
                    for (int i = 0; i < bookList.size(); i++) {
                        bookList.get(i).showInformationBook();
                    }
                    break;
                case 3:
                    System.out.println("Input Year: ");
                    try {
                        int year = Integer.parseInt(scn.nextLine());
                        managerBook.showBookByYear(year);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid option");
                    }
                    break;
                case 4:
                    System.out.println("Input Editorial: ");
                    String editorial = scn.nextLine();
                    managerBook.booksByEditorial(editorial);
                    break;
                case 5:
                    System.out.println("Input Editorial");
                    String editorialcount = scn.nextLine();
                    managerBook.readBooks();
                    managerBook.numBooksForEditorial(editorialcount);
                    break;
                case 6:
                    exit = false;
                    break;
                default:
                    System.out.println("invalid option");
            }
        }
    }

}
