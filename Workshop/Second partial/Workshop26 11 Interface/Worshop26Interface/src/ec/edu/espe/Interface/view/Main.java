/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Interface.view;

import ec.edu.espe.Inteface.controller.Animal;
import ec.edu.espe.Inteface.controller.Monkey;

/**
 *
 * @author ASUS
 */
public class Main {
    
     public static void main(String[] Args) {
         Animal animal;
         animal = new Monkey();
         
        
         System.out.println(animal);
     }
}
