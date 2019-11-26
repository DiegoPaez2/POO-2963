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
public class Bird {
    /**
     * the wingSize in mm.
     */
    private int wingSize;
    /**
     * True is fly o false does not fly
     */
    private boolean fly;

    public Bird(int wingSize, boolean fly) {
        this.wingSize = wingSize;
        this.fly = fly;
    }

    @Override
    public String toString() {
        return "Bird{" + "wingSize=" + wingSize + ", fly=" + fly + '}';
    }

    /**
     * @return the wingSize
     */
    public int getWingSize() {
        return wingSize;
    }

    /**
     * @param wingSize the wingSize to set
     */
    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    /**
     * @return the fly
     */
    public boolean isFly() {
        return fly;
    }

    /**
     * @param fly the fly to set
     */
    public void setFly(boolean fly) {
        this.fly = fly;
    }
}
