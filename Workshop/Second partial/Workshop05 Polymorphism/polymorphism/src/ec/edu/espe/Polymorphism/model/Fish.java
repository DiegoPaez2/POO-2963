/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Polymorphism.model;

/**
 *
 * @author G403
 */
public class Fish extends Animal{
    private boolean scales;
    private int gills;

    public Fish(boolean scales, int gills, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        System.out.println("Fish Constructor");
        this.scales = scales;
        this.gills = gills;
    }

    @Override
    public String toString() {
        return "Fish{" + "scales=" + scales + ", gills=" + gills + '}';
    }

    /**
     * @return the scales
     */
    public boolean isScales() {
        return scales;
    }

    /**
     * @param scales the scales to set
     */
    public void setScales(boolean scales) {
        this.scales = scales;
    }

    /**
     * @return the gills
     */
    public int getGills() {
        return gills;
    }

    /**
     * @param gills the gills to set
     */
    public void setGills(int gills) {
        this.gills = gills;
    }

    
}
