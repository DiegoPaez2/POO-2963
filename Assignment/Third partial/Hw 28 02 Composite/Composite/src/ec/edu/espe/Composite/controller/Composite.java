/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Composite.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public abstract class Composite extends Component {

    List<Component> components = new ArrayList<Component>();

    public Composite(String name) {
        this.setTypeComponent(Component.BINDER);
        this.setName(name);
    }

    @Override
    public void show() {
        System.out.println("List binder [" + this.getName() + "]");
        for (Component component : components) {
            component.show();
        }
    }

    public void insertComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public List<Component> getComponent() {
        return components;
    }

    public Component getComponent(int position) {
        return components.get(position);
    }
}
