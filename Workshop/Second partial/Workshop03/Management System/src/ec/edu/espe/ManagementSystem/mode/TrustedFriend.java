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
public class TrustedFriend extends User {

    private ArrayList<TrustFriendsGroup> trustFriendsGroup;

    public TrustedFriend(String userName, String password, String fullName, String emailAddress, boolean isActive) {
        super(userName, password, fullName, emailAddress, isActive);
    }
    public void viewSharedAccountInformation(){
        
    }
    public void browseListOfAccounts (){
        
    }
}
