package ec.edu.espe.createbook.mode;

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

    public void dataEntry() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter information about the book");
        try {
            System.out.println("Title: ");
            this.title = (scn.nextLine());
            System.out.println("Author: ");
            this.author = (scn.nextLine());
            System.out.println("Editorial: ");
            this.editorial = scn.nextLine();
            System.out.println("Year: ");
            this.year = (Integer.parseInt(scn.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Invalid information");
        }
    }

    public void showInformationBook() {
        System.out.println("Title:" + this.getTitle());
        System.out.println("Author:" + this.getAuthor());
        System.out.println("Editorial:" + this.getEditorial());
        System.out.println("Year:" + this.getYear());
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
