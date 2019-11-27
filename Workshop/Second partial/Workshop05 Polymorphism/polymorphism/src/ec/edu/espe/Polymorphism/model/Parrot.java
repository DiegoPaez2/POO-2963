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
public class Parrot extends Bird{
    private boolean talk;

    public Parrot(boolean talk, int wingSize, boolean fly, boolean feathers, int id, String name, String gender, float weight, Cage cage) {
        super(wingSize, fly, feathers, id, name, gender, weight, cage);
        this.talk = talk;
    }

    @Override
    public String toString() {
        return "Parrot{" + "talk=" + talk + '}';
    }

    /**
     * @return the talk
     */
    public boolean isTalk() {
        return talk;
    }

    /**
     * @param talk the talk to set
     */
    public void setTalk(boolean talk) {
        this.talk = talk;
    }
    
}
