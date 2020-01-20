/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.view;

import ec.edu.espe.controller.Singleton;

/**
 *
 * @author Angel castillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Singleton nombrePersona = Singleton.getSingletonInstance("Jonathan Castillo");
        Singleton nombrePersona1 = Singleton.getSingletonInstance("Angel Castillo");
        
        System.out.println(nombrePersona.getNombre());
        System.out.println(nombrePersona1.getNombre());   
    }
}
    
