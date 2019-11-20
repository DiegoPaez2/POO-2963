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
public class TrustFriendsGroup{
   protected String label;
   private ArrayList<Account> account;
   private ArrayList<Account> friends;
   
        
   
   public void viewAccountOrNote (){
       String[] group1 = new String[5];
       String[] group2 = new String[5];
       
       group1[0]="Alex";
       group1[1]="Nicole";
       group1[2]="Kevin";
       group1[3]="Alexander";
       group1[4]="Belen";
       group2[0]="Alexandra";
       group2[1]="Carlos";
       group2[2]="Brayan";
       group2[3]="Alenader";
       group2[4]="Brayan";
       System.out.println("\ttrust friend in group1");
        for(int i=0; i<5; i++){
            System.out.println(group1[i]);
        }
        System.out.println("\ttrust friend in group2");
        for(int i=0; i<5; i++){
            System.out.println(group2[i]);
        }
   }
}