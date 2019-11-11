
package ec.edu.espe.createbook.model;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Book {
    private String title;
    private String author;
    private String editorial;
    private int year;

    public Book() {
    }

    public Book(String title, String author, String editorial, int year) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.year = year;
    }
    
    public void showBook(){
        System.out.println("Title");
        System.out.println(this.getTitle());
        System.out.println("Author");
        System.out.println(this.getAuthor());
        System.out.println("Editorial");
        System.out.println(this.getEditorial());
        System.out.println("Year");
        System.out.println(this.getYear());
    }
    public void enterData(){
        Scanner scn = new Scanner(System.in);
        System.out.println("information about the book");
        try{
            System.out.println("Title ");
            this.title=(scn.nextLine()); 
            System.out.println("Author ");
            this.author=(scn.nextLine());
            System.out.println("Editorial ");
            this.editorial = scn.nextLine();
            System.out.println("Year");
            this.year = (Integer.parseInt(scn.nextLine()));      
        }
        catch(Exception e){
            System.out.println("Invalid");
            e.printStackTrace();
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }

}
