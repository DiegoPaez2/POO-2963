/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe;

import ec.edu.espe.controller.Cliente;
import ec.edu.espe.controller.Empleado;
import ec.edu.espe.controller.Socio;
import ec.edu.espe.model.Persona;

/**
 *
 * @author Angel castillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Cliente(1);
        System.out.println("El cliente dice ");
        System.out.println(persona.identificar());
        
        System.out.println("El empleado dice ");
        persona = new Empleado("QW 1");
        System.out.println(persona.identificar());
        
        System.out.println("El socio dice ");
        persona = new Socio(1);
        System.out.println(persona.identificar());
        
    }
    
}
