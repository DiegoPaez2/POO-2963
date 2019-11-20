package ec.edu.espe.SystemStudent.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author G403
 */
public class Student {

    private String nombre;
    private String lastName;
   
    private int codigo;
    private boolean aprobado;

    public Student() {
    }

    public void dataEntry() {
        Scanner scn = new Scanner(System.in);
        System.out.println("\n\tMovie Information\n");
        try {

            System.out.println("Name: ");
            this.nombre = scn.nextLine();
            System.out.println("Last Name");
            this.lastName = scn.nextLine();
            System.out.println("Codigo");
            this.codigo = scn.nextInt();

        } catch (Exception e) {
            System.out.println("Invalid Infomartion");
        }
    }

    public boolean aprovate(float nota1, float nota2 , float nota3) {
        int nota;
        nota = (int) ((nota2+ nota1+ nota3)/3);
        if (nota >= 14) {
            return true;
        } else {
            return false;
        }

    }

    public void showInformation() {
        System.out.println("\tStudent Information"
                + "\n Name:" + this.nombre
                + "\n Last Name:" + this.lastName
                + "\n Codigo:" + this.codigo);

    }
}
