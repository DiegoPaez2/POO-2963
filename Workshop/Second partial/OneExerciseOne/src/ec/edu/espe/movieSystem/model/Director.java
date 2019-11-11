package ec.edu.espe.movieSystem.model;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Director {
    private String name;
    private String lastName;
    private String country;

    public Director() {
    }
    
    public void dataOfDirector(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter information abaot the director ");
        try{
            System.out.println("Name: ");
            this.name = scn.nextLine(); 
            System.out.println("Last Name: ");
            this.lastName = scn.nextLine();
            System.out.println("Country : ");
            this.country = scn.nextLine();
        }
        catch(Exception e){
            System.out.println("Invalid format");
        }
    }
    
    public void showDirector(){
        System.out.println("Director");
        System.out.println("Name:"+this.name);
        System.out.println("Last Name:"+this.lastName);
        System.out.println("Country:"+this.country);
    }
}


