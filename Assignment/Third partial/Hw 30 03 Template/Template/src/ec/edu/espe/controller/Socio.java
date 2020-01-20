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
public class Socio extends Persona{
    private int numeroSocio;
    
    public  Socio(int numeroSocio){
        setNumeroSocio(numeroSocio);
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    @Override
    protected String getIdent() {
        return String.valueOf(numeroSocio);
    }

    @Override
    protected String getTipoId() {
        return "numero de socio";
    }
    
}
