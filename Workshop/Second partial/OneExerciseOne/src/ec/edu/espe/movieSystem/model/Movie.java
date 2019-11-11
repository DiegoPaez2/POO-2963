package ec.edu.espe.movieSystem.model;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Movie {

    private String title;
    private String synopsis;
    private int year;
    private String genere;
    private String country;
    private Director director;

    public Movie() {
    }

    public void enterData() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Movie Information");
        try {
            System.out.println("Title: ");
            this.title = scn.nextLine();
            System.out.println("Synopsis: ");
            this.synopsis = scn.nextLine();
            System.out.println("Year: ");
            this.year = Integer.parseInt(scn.nextLine());
            System.out.println("Genere: ");
            this.genere = scn.nextLine();
            System.out.println("Country: ");
            this.country = scn.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Invalid information");
        }
        Director directorOfMovie = new Director();
        directorOfMovie.dataOfDirector();
        this.director = directorOfMovie;
    }

    public void showMovie() {
        System.out.println("Information about movie");
        System.out.println("Title: "+this.title);
        System.out.println("Synopsis:"+this.synopsis);
        System.out.println("Year: "+this.year);
        System.out.println("Genere:"+this.genere);
        System.out.println("Country:"+this.country);
        this.director.showDirector();
    }
}
