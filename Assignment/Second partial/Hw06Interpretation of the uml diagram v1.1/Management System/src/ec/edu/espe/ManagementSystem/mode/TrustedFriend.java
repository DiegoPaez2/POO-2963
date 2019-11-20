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
    public void viewTrustFrinds(){
        String[] trustFriends = new String[6];
        trustFriends[0]= "Alex";
        trustFriends[1]="Nicole";
        trustFriends[2]="Kevin";
        trustFriends[3]="Alejandra";
        trustFriends[4]="Carlos";
        trustFriends[5]="Brayan";
        System.out.println("\ttrust friend");
        for(int i=0; i<5; i++){
            System.out.println(trustFriends[i]);
        }
    }
    public void viewSharedAccountInformation(){
        
    }
    public void browseListOfAccounts (){
        
    }
}
