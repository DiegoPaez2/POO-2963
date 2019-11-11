package ec.edu.espe.movieSystem.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Movie> movieList = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int op;
        boolean exit = true;
        while (exit) {
            System.out.println("Movie System");
            System.out.println("1) For add Movie");
            System.out.println("2) For show Movies");;
            System.out.println("3) For Exit");
            System.out.println("Choose an option: ");
            op = scn.nextInt();
            switch (op) {
                case 1:
                    Movie movie = new Movie();
                    movie.enterData();
                    movieList.add(movie);
                    break;
                case 2:
                    for (int i = 0; i < movieList.size(); i++) {
                        movieList.get(i).showMovie();
                    }
                    break;
                case 3:
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid option choose again please");
            }
        }
    }
}
