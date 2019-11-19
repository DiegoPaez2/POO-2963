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
public class User {

    protected String userName;
    protected String password;
    protected String fullName;
    protected String emailAddress;
    protected boolean isActive;

    public User(String userName, String password, String fullName, String emailAddress, boolean isActive) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.isActive = isActive;
    }
    

    public boolean checkPassword(String password, String userName) {
        return true;
    }

    public void getTrustFriendsGroups() {

    }

    public void modifyOwnUserProfile() {

    }

    public void logOff() {

    }
}
