/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ManagementSystem.view;

import ec.edu.espe.ManagementSystem.model.TrustFriendsGroup;
import ec.edu.espe.ManagementSystem.model.TrustedFriend;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scn = new Scanner(System.in);
        String user;
        int password;
        
        boolean exit = false;
        while (!exit){
        System.out.println("Enter user");
        user = scn.nextLine();
        System.out.println("Enter password");
        password = Integer.parseInt(scn.nextLine());
        if ("dapaez2".equals(user) && password == 246813579){
            System.out.println("\tYou accessed");
            TrustFriendsGroup group = new TrustFriendsGroup();
            group.viewAccountOrNote();
            TrustedFriend trustFriend = new TrustedFriend(); 
            trustFriend.viewTrustFrinds();
        
       } else {
            System.out.println("Incorrect user or password");
        }
        }
           
       
            
    }
}
