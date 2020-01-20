/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Composite.controller;

/**
 *
 * @author ASUS
 */
public abstract class Component {
    
    public static final int ARCHIVE = 1;
    public static final int BINDER = 2;
    protected String name = "";
    protected int typeComponent;

    
    public abstract void show();
    
    
    
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getTypeComponent() {
        return this.typeComponent;
    }

    public void setTypeComponent(int typeComponent) {
        this.typeComponent = typeComponent;
    }

    
}
