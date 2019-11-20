package ec.edu.espe.SystemStudent.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import ec.edu.espe.SystemStudent.controller.Student;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author G403
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner scn = new Scanner(System.in);

        boolean exit = false;
        int op;
        float nota1;
        float nota2;
        float nota3;
        while (!exit) {
            System.out.println("---System Student ---"
                    + "\n 1) Enter student data"
                    + "\n 2) Enter notes"
                    + "\n 3) Show student data"
                    + "\n 4) Exit"
                    + "\n Input an option");
            Student student = new Student();
            op = scn.nextInt();
            switch (op) {
                case 1:

                    student.dataEntry();
                    studentList.add(student);
                    break;
                case 2:
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInformation();
                    }

                    break;
                case 3:

                    System.out.println("Input notes");
                    nota1 = scn.nextFloat();
                    nota2 = scn.nextFloat();
                    nota3 = scn.nextFloat();
                    if (student.aprovate(nota1, nota2, nota3) == true) {
                        System.out.println("Aprovado");
                    } else {
                        System.out.println("No aprovado");
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("\topcion invalida ");
            }
        }

    }

}
