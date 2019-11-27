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
public class Salamander extends Amphibian {

    private boolean flexible;

    public Salamander(boolean flexible, boolean metamorphosis, int id, String name, String gender, float weight, Cage cage) {
        super(metamorphosis, id, name, gender, weight, cage);
        this.flexible = flexible;
    }

    @Override
    public String toString() {
        return "Salamander{" + "flexible=" + flexible + '}';
    }

    /**
     * @return the flexible
     */
    public boolean isFlexible() {
        return flexible;
    }

    /**
     * @param flexible the flexible to set
     */
    public void setFlexible(boolean flexible) {
        this.flexible = flexible;
    }

}
