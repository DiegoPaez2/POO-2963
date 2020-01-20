/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Angel castillo
 */
public abstract class Persona {
    private String nombre;
    private String DNI;
    
    public String identificar(){
        String frase = "Yo soy ";
        frase = frase + getTipoId();
        frase = frase + "El numero es ";
        frase = frase + getIdent();
        return frase;
    }
    
    protected abstract String getIdent();
    
    protected  abstract String getTipoId();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    
    
}
