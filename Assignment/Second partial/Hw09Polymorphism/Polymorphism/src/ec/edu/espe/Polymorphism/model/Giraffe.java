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
public class Giraffe extends Mammal{
    /**
     * The neck size is a m.
     */
    private float neckSize;

    public Giraffe(float neckSize, boolean isBreastFeeding, int id, String name, String gender, float weight, Cage cage) {
        super(isBreastFeeding, id, name, gender, weight, cage);
        this.neckSize = neckSize;
    }

    @Override
    public String toString() {
        return "Giraffe{" + "neckSize=" + neckSize + '}';
    }

    
    /**
     * @return the neckSize
     */
    public float getNeckSize() {
        return neckSize;
    }

    /**
     * @param neckSize the neckSize to set
     */
    public void setNeckSize(float neckSize) {
        this.neckSize = neckSize;
    }
}
