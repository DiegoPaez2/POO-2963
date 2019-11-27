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
public class Snake extends Reptile{
     private boolean  poisonous; 

    public Snake(boolean poisonous, float limbSizes, int id, String name, String gender, float weight, Cage cage) {
        super(limbSizes, id, name, gender, weight, cage);
        this.poisonous = poisonous;
    }

    @Override
    public String toString() {
        return "Snake{" + "poisonous=" + poisonous + '}';
    }

    /**
     * @return the poisonous
     */
    public boolean isPoisonous() {
        return poisonous;
    }

    /**
     * @param poisonous the poisonous to set
     */
    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }
}
