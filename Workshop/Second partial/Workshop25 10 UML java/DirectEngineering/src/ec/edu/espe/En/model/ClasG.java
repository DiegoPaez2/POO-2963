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
public class ClasG extends ClasC{
    private ClasI i;

    public ClasG(ClasI i, ClasD d, ClasE e) {
        super(d, e);
        this.i = i;
    }
  

    @Override
    public String toString() {
        return "ClasG{" + "i=" + i + '}';
    }

    
    public void print() {
        System.out.println("I am clas G");
    }
    
    
}
