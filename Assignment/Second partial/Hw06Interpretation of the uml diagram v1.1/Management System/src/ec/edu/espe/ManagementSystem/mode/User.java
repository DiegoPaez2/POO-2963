/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ManagementSystem.mode;

import java.util.ArrayList;

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

    User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public boolean checkPassword(String password) {
        boolean checkPassword = false;
        if (this.password.equals(password)){
            checkPassword = true;
        }  
        return checkPassword;
    }

    public ArrayList<TrustFriendsGroup>  getTrustFriendsGroups() {
        ArrayList<TrustFriendsGroup> friendsGrups = new ArrayList<>();
        //TrustFriendsGroup = new TrustFriendsGroup();
        //friendsGrups.add(TrustFriendsGroup);
        return friendsGrups;
    }

    public void modifyOwnUserProfile() {

    }

    public void logOff() {

    }
}
