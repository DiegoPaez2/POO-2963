/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ManagementSystem.model;

/**
 *
 * @author ASUS
 */
public class PasswordCriteria{
   private String includeUpperCase;
   private int includeNumbers;
   private String specialCharsToInclude;
   private String CharsToExclude;
   private String mustStartWithLetter;
   private String passwordUniquenessPeriod;
   private String passwordUniquenessCount;
   private String usePasswordFragrments;
   
   
   public boolean valide(String password){
       
       
       return false;
   }
   
           
}