/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Systemwood.controller;

/**
 *
 * @author ASUS
 */
public class TipodeMadera {
    public enum TipoDeMadera {

    ROBLE ("Castaño verdoso", 800), 
    CAOBA ("Marrón oscuro", 770),
    NOGAL("Marrón rojizo", 820),
    CEREZO ("Marrón cereza", 790),
    BOJ ("Marrón negruzco", 675);  

    private final String color; 
    private final int pesoEspecifico; 

    TipoDeMadera (String color, int pesoEspecifico) { 
        this.color = color;
        this.pesoEspecifico = pesoEspecifico;

    } 

    public String getColor() { return color; }
    public int getPesoEspecifico() { return pesoEspecifico; }

} 
    
}
