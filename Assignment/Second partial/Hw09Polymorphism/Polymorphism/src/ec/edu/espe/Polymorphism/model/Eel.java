/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Polymorphism.model;

/**
 *
 * @author ASUS
 */
public class Eel extends Fish {

    private String typeOfWater;

    public Eel(String typeOfWater, boolean scales, int gills, int id, String name, String gender, float weight, Cage cage) {
        super(scales, gills, id, name, gender, weight, cage);
        this.typeOfWater = typeOfWater;
    }

    @Override
    public String toString() {
        return "Eel{" + "typeOfWater=" + typeOfWater + '}';
    }

    /**
     * @return the typeOfWater
     */
    public String getTypeOfWater() {
        return typeOfWater;
    }

    /**
     * @param typeOfWater the typeOfWater to set
     */
    public void setTypeOfWater(String typeOfWater) {
        this.typeOfWater = typeOfWater;
    }
}
