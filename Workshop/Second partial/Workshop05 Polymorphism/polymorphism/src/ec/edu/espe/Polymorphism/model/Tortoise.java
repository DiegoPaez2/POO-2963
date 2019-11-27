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
public class Tortoise extends Reptile{
    private float shellSize;

    public Tortoise(float shellSize, float limbSizes, int id, String name, String gender, float weight, Cage cage) {
        super(limbSizes, id, name, gender, weight, cage);
        this.shellSize = shellSize;
    }

    @Override
    public String toString() {
        return "Tortoise{" + "shellSize=" + shellSize + '}';
    }

    /**
     * @return the shellSize
     */
    public float getShellSize() {
        return shellSize;
    }

    /**
     * @param shellSize the shellSize to set
     */
    public void setShellSize(float shellSize) {
        this.shellSize = shellSize;
    }
    
}
