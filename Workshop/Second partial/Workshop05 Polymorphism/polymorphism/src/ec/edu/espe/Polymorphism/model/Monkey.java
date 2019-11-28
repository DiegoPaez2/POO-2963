/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Polymorphism.model;

/**
 *
 * @author Labs-DCCO
 */
public class Monkey extends Mammal{
     
    private int tailLenght;
   

    public Monkey(int tailLenght, boolean isBreastFeeding, int id, String name, String gender, float weight, Cage cage) {
        
        super(isBreastFeeding, id, name, gender, weight, cage);
        System.out.println("Monkey Construstor");
        this.tailLenght = tailLenght;
    }

    
 

  

    @Override
    public String toString() {
        return "Monkey{" + "tailLenght=" + tailLenght + '}';
    }
    
    /**
     * @return the tailLenght
     */
    public int getTailLenght() {
        return tailLenght;
    }

    /**
     * @param tailLenght the tailLenght to set
     */
    public void setTailLenght(int tailLenght) {
        this.tailLenght = tailLenght;
    }
    
}
