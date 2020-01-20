/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Composite.view;

import ec.edu.espe.Composite.controller.Composite;
import ec.edu.espe.Composite.controller.Leaf;

/**
 *
 * @author ASUS
 */
public class Client {

    public static void main(String[] args) {

        Composite c1 = new Composite("CARPETA_1") {};
        c1.insertComponent(new Leaf("Archive01"));
        c1.insertComponent(new Leaf("Archive02"));
        c1.insertComponent(new Leaf("Archive03"));
        
        // Create a subfolder and insert files
        Composite c2 = new Composite("CARPETA_2") {};
        c2.insertComponent(new Leaf("Archive04"));
        c2.insertComponent(new Leaf("Archive05"));
        
        // Insert the subfolder into the main
        c1.insertComponent(c2);
        
        // Insert another file into the main folder
        c1.insertComponent(new Leaf ("Archive06"));
        c1.show();
        System.out.println("--------------------");
        
        // We delete the subfolder (along with its content)
        c1.removeComponent(c2);
        c1.show();

    }
}
