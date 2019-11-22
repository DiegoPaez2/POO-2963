/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ManagementSystem.model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Account {

    private String label;
    private String createdOnDate;
    private String lastModifiedOn;

    private Password[] password;
    private UserName[] userName;
    private Comment[] comment;
    
    private ArrayList<Reminder> reminder;
    private ArrayList<Property> property;
}
