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
public class Cliente extends Persona{
    private  int numeroCliente;
    
    public Cliente(int numeroCliente){
        setNumeroCliente(numeroCliente);
    }

    @Override
    protected String getIdent() {
        return String.valueOf(numeroCliente);
    }

    @Override
    protected String getTipoId() {
        return "numero de cliente";
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    
    
}
