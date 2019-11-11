package ec.edu.espe.createbook.model;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int op;
        Manager manager = new Manager();
        ArrayList<Book> listBook = new ArrayList<>();
        boolean exit = false;
        while (exit){
            
            System.out.println("1 for add a book");
            System.out.println("2 for show all books");
            System.out.println("3 for find  Editorial");
            System.out.println("4 for find  for year");
            System.out.println("5 for num by Editorial");
            System.out.println("6 for Exit");
           
            System.out.println("\nDigite una opcion: ");
            op = Integer.parseInt(scn.nextLine());
           
            if(op == 1){
                Book book = new Book();
                book.enterData();
                listBook = manager.readBooks();
                listBook.add(book);
                manager.addBook(listBook);
                break;
            }if(op == 2){
                listBook=  manager.readBooks();
                    for (int i = 0; i < listBook.size(); i++) {
                        listBook.get(i).showBook();
                    }break;
            }if(op == 3){
                 System.out.println("Input Editorial: ");
                    String editorial;
                    editorial = scn.nextLine();
                    manager.showForEditorial(editorial);
                    break;
            }if(op == 4){
                System.out.println("Input Year: ");
                int year; 
                year = Integer.parseInt(scn.nextLine());
                manager.showBookYear(year);
                break;
            }if(op == 5){
                System.out.println("Input Editorial");
                String num; 
                num  = scn.nextLine();
                manager.readBooks();
                manager.booksOfEditorial(num);
                break;
            }if (op == 6){
                exit = true;
            }
        }
    }
}