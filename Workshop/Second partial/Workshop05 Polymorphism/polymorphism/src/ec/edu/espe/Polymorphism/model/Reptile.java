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
public class Reptile extends Animal{
    /**
     * In reptiles the size of the limbs are small
     */
    private float limbSizes;

    public Reptile(float limbSizes, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        System.out.println("Reptile constructor");
        this.limbSizes = limbSizes;
    }

    @Override
    public String toString() {
        return "Reptile{" + "limbSizes=" + limbSizes + '}';
    }


    /**
     * @return the limbSizes
     */
    public float getLimbSizes() {
        return limbSizes;
    }

    /**
     * @param limbSizes the limbSizes to set
     */
    public void setLimbSizes(float limbSizes) {
        this.limbSizes = limbSizes;
    }
    
    
}
