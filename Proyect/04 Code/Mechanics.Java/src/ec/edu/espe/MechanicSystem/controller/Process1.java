/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.MechanicSystem.controller;

import ec.edu.espe.MechanicSystem.model.Auto;
import java.util.ArrayList;

/**
 *
 * @author Inforlan
 */
public class Process1 {
    private ArrayList<Object> a =new ArrayList<Object>();
    
    public Process1(){}
    
    public Process1(ArrayList<Object> a){
    this.a =a;
    }
    public void agregarRegistro(Auto auto){
        this.a.add(auto);
    }
    public void modificarRegistro(int i,Auto auto){
        this.a.set(i,auto);
    }
    public void eliminarRegistro(int i){
        this.a.remove(i);
    }
    public Auto obtenerRegistro(int i){
        return(Auto)a.get(i);
    }
    public int cantidadRegistro(){
        return this.a.size();
    }
    public int buscaPlaca(int placa){
        for(int i = 0; i < cantidadRegistro();i++){
            if(placa==obtenerRegistro(i).getPlaca())return i;
        } return -1;
    }
    
}
