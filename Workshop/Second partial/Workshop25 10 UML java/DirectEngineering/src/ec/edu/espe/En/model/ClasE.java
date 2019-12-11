/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.En.model;

/**
 *
 * @author Labs-DCCO
 */
public class ClasE {
    
    private float b;
    ClasI i = new ClasI();
    ClasG g = new ClasG(i);

    @Override
    public String toString() {
        return "ClasE{" + "b=" + b + ", i=" + i + ", g=" + g + '}';
    }
    
    private float getB(){
        return b;
    }
}
