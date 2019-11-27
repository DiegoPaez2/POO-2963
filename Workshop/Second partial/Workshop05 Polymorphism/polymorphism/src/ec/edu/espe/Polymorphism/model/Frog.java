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
public class Frog extends Amphibian {

    private boolean typeBreath;

    public Frog(boolean typeBreath, boolean metamorphosis, int id, String name, String gender, float weight, Cage cage) {
        super(metamorphosis, id, name, gender, weight, cage);
        this.typeBreath = typeBreath;
    }

    @Override
    public String toString() {
        return "Frog{" + "typeBreath=" + typeBreath + '}';
    }

    /**
     * @return the typeBreath
     */
    public boolean isTypeBreath() {
        return typeBreath;
    }

    /**
     * @param typeBreath the typeBreath to set
     */
    public void setTypeBreath(boolean typeBreath) {
        this.typeBreath = typeBreath;
    }

}
