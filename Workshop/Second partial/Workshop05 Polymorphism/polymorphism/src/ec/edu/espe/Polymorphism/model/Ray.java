/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Polymorphism.model;

/**
 *
 * @author ASUS
 */
public class Ray extends Fish{
     
    private String typeHabitat; 

    public Ray(String typeHabitat, boolean scales, int gills, int id, String name, String gender, float weight, Cage cage) {
        super(scales, gills, id, name, gender, weight, cage);
        this.typeHabitat = typeHabitat;
    }

    @Override
    public String toString() {
        return "Ray{" + "typeHabitat=" + typeHabitat + '}';
    }

    /**
     * @return the typeHabitat
     */
    public String getTypeHabitat() {
        return typeHabitat;
    }

    /**
     * @param typeHabitat the typeHabitat to set
     */
    public void setTypeHabitat(String typeHabitat) {
        this.typeHabitat = typeHabitat;
    }
    
}
