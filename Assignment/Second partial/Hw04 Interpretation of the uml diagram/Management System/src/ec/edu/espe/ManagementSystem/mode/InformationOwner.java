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
public class InformationOwner extends User {

    private ArrayList<TrustFriendsGroup> trustFriendsGroup;
    private ArrayList<AccountOrNote> accountOrNote;

    public InformationOwner(String userName, String password, String fullName, String emailAddress, boolean isActive) {
        super(userName, password, fullName, emailAddress, isActive);
    }

    public void storeInformationAboutAccounts() {

    }
    public void storePersonalnotes(){
        
    }
    public void grantAccess(){
        
    }
    public void storeWebsites(){
        
    }
    public void storeAccountInfomation(){
        
    }
    public void storeLoginInformation(){
        
    }
}
