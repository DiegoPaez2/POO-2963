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
public class Penguin extends Bird {

    private boolean swim;

    public Penguin(boolean swim, int wingSize, boolean fly, boolean feathers, int id, String name, String gender, float weight, Cage cage) {
        super(wingSize, fly, feathers, id, name, gender, weight, cage);
        this.swim = swim;
    }

    @Override
    public String toString() {
        return "Penguin{" + "swim=" + swim + '}';
    }

   

    /**
     * @return the swim
     */
    public boolean isSwim() {
        return swim;
    }

    /**
     * @param swim the swim to set
     */
    public void setSwim(boolean swim) {
        this.swim = swim;
    }

}
