/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Observer.view;

import ec.edu.espe.Observer.model.ConcreteObserver;
import ec.edu.espe.Observer.model.ConcreteSubject;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        
        // Instance the object that will be observed
        ConcreteSubject objObservado = new ConcreteSubject();
        
        // Instance and register an Observer
        ConcreteObserver objObserverPepe = new ConcreteObserver("Pepe");
        objObservado.addObserver(objObserverPepe);

        // Instance and register another Observer
        ConcreteObserver objObserverJuan = new ConcreteObserver("Juan");
        objObservado.addObserver(objObserverJuan);

        // Instance and register another Observer
        ConcreteObserver objObserverMarta = new ConcreteObserver("Marta");
        objObservado.addObserver(objObserverMarta);
    }
}
