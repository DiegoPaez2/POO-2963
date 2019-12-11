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
public class ClasF extends ClasC {

    private ClasK k;

    public ClasF(ClasK k, ClasD d, ClasE e) {
        super(d, e);
        this.k = k;
    }

    

    @Override
    public String toString() {
        return "ClasF{" + "k=" + k + '}';
    }

    public void print() {
        System.out.println("I am clas f");
    }

}
