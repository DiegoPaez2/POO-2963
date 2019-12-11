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
public class ClasH extends ClasC {

    private ClasJ j;

    public ClasH(ClasJ j, ClasD d, ClasE e) {
        super(d, e);
        this.j = j;
    }

    

    
    
    @Override
    public String toString() {
        return "ClasH{" + "j=" + j + '}';
    }

    public void print() {
        System.out.println("imprimienton desde h");
    }

}
