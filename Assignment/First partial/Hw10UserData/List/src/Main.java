import java.io.File;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        Scanner read = new Scanner(System.in);
        int option;
        
        System.out.println("*********Menu de opciones*******");
        System.out.println("1.- Ingresar");
        System.out.println("2.- Mostrar");
        System.out.println("3.- Salir");
        
        option = read.nextInt();
        switch(option){
            case 1: 
                try {
                File estudiante = new File ("Estudiante.csv");
                PrintWrite estudiante = new  
                }
            
        }
        
        
        
        
        
        Scanner scn = new Scanner(System.in);
        Student s = new Student();
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("Ingrese el nombre, nota1, nota2, nota3, father_num:  ");
            String aux = scn.nextLine();
            // aux = "Dennis 20"
            String[] vector = aux.split(" ");
            // vector[0] = "Dennis"
            // vector[1] = "22"
            // vector[2] = "Sangolqui"
            if (aux.equals("")) {
                break;
            }
            String name = vector[0];
            int nota1 = Integer.parseInt(vector[1]);
            int nota2 = Integer.parseInt(vector[2]);
            int nota3 = Integer.parseInt(vector[3]);
            int father_num = Integer.parseInt(vector[4]);
            s.average(nota1, nota2, nota3);
            // int age = Integer.parseInt(scn.nextLine());
            Student student = new Student(name, nota1, nota2, nota3, father_num);
            list.add(student);
        }
        System.out.println("\n\nImpresion con for normal: ");
        for (int i = 0; i < list.size(); i++) {
            Student aux = list.get(i);
            System.out.println(aux.getName() + "," + aux.getNota1() +"," + aux.getNota2()+"," + aux.getNota3()+"," + aux.getFather_num());
        }
    }
}