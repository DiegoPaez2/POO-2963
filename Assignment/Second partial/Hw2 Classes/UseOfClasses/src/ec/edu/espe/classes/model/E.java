/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.classes.model;

import java.util.ArrayList;


/**
 *
 * @author ASUS
 */
public class E {
    private ArrayList<B> bs = new ArrayList<>(5);
    
    
    public void m (D d){
        System.out.println("en la clase E,habra el parametro D"+ D.class.getName);
    }
    
}
