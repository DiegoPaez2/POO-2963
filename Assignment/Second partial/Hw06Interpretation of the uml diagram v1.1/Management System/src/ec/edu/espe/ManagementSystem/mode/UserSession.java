/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ManagementSystem.mode;

/**
 *
 * @author ASUS
 */
public class UserSession {
    private User user;

    public UserSession(User user) {
        this.user = user;
    }
    
   
    
    public void setUser (User user){
        this.user = user;
        
    }
    public void clearUser(){
        user = null;
        user = new User(); 
        
    }
    public User  getCurrentUser(){
        return user;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }
}
