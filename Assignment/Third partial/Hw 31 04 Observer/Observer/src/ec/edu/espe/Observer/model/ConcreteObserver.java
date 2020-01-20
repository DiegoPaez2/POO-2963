/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Observer.model;

/**
 *
 * @author ASUS
 */
public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.setName(name);
        System.out.println("Observer [" + this.name + "] created");
    }

    @Override
    public void updatedObserver() {
        System.out.println("Observer [" + this.getName() + "] You've got a message");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
