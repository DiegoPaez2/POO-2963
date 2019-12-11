/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.En.model;

import java.util.ArrayList;

/**
 *
 * @author Labs-DCCO
 */
public class ClasA {
     
    private ClasB[] bArray  = new ClasB[3];
    private ArrayList<ClasF> fList = new ArrayList<ClasF>();
    private ArrayList<ClasG> gList = new ArrayList<ClasG>();
    private ArrayList<ClasH> hList = new ArrayList<ClasH>();

    public ClasA() {
        this.bArray = bArray;
        this.fList = fList;
        this.gList = gList;
        this.hList = hList;
    }

    
    @Override
    public String toString() {
        return "ClasA{" + "bArray=" + bArray + ", fList=" + fList + ", gList=" + gList + ", hList=" + hList + '}';
    }

   

   
    
    
}
