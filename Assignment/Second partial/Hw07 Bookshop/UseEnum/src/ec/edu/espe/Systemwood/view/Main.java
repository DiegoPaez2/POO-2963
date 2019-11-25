/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Systemwood.view;

/**
 *
 * @author ASUS
 */
public class Main {
    
      public static void main (String[ ] Args) {

 

        ec.edu.espe.Systemwood.controller.Wood maderaUsuario1 = ec.edu.espe.Systemwood.controller.Wood.OAK;

       System.out.println ("The wood chosen by the user is " + maderaUsuario1.toString() + 
               "\nwith a color" +maderaUsuario1.getColor() + 
               "\nand with a specific weight of " + maderaUsuario1.getWeight() + " kg/m3");

 

      } 
    
}
