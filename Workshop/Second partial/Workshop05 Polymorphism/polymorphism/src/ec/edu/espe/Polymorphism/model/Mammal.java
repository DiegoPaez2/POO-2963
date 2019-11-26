/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Polymorphism.model;

/**
 *
 * @author Labs-DCCO
 */
public class Mammal extends Animal {

    private boolean isBreastFeeding;

    public Mammal(boolean isBreastFeeding, int id, String name, String gender, float weight, ec.edu.espe.Polymorphism.model.Cage cage) {

        super(id, name, gender, weight, cage);
        System.out.println("Mammal Constructor");
        this.isBreastFeeding = isBreastFeeding;
    }

    @Override
    public String toString() {
        String mammal;
        mammal="Mammal{" + "isBreastFeeding=" + isBreastFeeding + '}';
        return mammal;
    }
    
    /**
     * @return the isBreastFeeding
     */
    public boolean isIsBreastFeeding() {
        return isBreastFeeding;
    }

    /**
     * @param isBreastFeeding the isBreastFeeding to set
     */
    public void setIsBreastFeeding(boolean isBreastFeeding) {
        this.isBreastFeeding = isBreastFeeding;
    }

}
