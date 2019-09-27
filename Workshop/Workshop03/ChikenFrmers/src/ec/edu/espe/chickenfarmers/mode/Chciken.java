/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chickenfarmers.mode;

/**
 *
 * @author Labs-DCCO
 */
public class Chciken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean ismolting;

    public void doStuff(int forTime){
        System.out.println("My chicken is doing thingd");
        cluck();
        wander();
        eat();
        drink();
        poop();
        cluck();
        cluck();
        drink();
        
    }
    private void cluck(){
        System.out.println("Cluck cluck cluck");
    }
    private void wander(){
        System.out.println(getName() + "is wondering");
    }
    private void eat(){
        System.out.println(getName() + "is eatng");
    }
    private void drink(){
        System.out.println(getName() + "is drinking");
    }
    private void poop(){
        System.out.println(getName() + "is pooping");
    }
    private Egg layAnEgg(){
        return new Egg();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the ismolting
     */
    public boolean isIsmolting() {
        return ismolting;
    }

    /**
     * @param ismolting the ismolting to set
     */
    public void setIsmolting(boolean ismolting) {
        this.ismolting = ismolting;
    }
}
