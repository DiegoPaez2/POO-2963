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
public class SystemAdministrator extends User{

    public SystemAdministrator(String userName, String password, String fullName, String emailAddress, boolean isActive) {
        super(userName, password, fullName, emailAddress, isActive);
    }
    
    public boolean addUser(String name, String password){
        return false;
    }
    
    public boolean editUser(String name, String password){
        return false;    
    }
    
    public void archiveUser (){
        
    }
    
    public boolean deleteUser(String name, String password){
        return false;
    }
}
