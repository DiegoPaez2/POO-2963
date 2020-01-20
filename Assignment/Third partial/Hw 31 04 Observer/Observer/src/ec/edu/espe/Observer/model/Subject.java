/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Observer.model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

   
    public Subject() {
    }

   
    public void addObserver(Observer o) {
        observers.add(o);
        // According to our example, every time a new observer is added, existing ones will be notified
        notifyObservers();
    }

    
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    
    public void notifyObservers() {
        // Send the notification to each observer through their own method
        for (Observer obj : observers) {
            obj.updatedObserver();
        }
    }
}
