/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.Persona;

/**
 *
 * @author Angel castillo
 */
public class Empleado extends Persona{
    private String legajo;
    
    public Empleado(String legajo){
        setLegajo(legajo);
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    protected String getIdent() {
        return legajo;
    }

    @Override
    protected String getTipoId() {
        return "numero de legajo";
    }
    
}
