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
public abstract class ClasC {
    
    private ClasD d;
    private ClasE e;
    
    public abstract void print();

    public ClasC(ClasD d, ClasE e) {
        this.d = d;
        this.e = e;
    }

    @Override
    public String toString() {
        return "ClasC{" + "d=" + d + ", e=" + e + '}';
    }

    
    
    
    public ClasD getD() {
        return d;
    }

    public void setD(ClasD d) {
        this.d = d;
    }

    public ClasE getE() {
        return e;
    }

    public void setE(ClasE e) {
        this.e = e;
    }

}
