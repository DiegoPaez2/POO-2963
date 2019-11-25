    import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        Scanner scn = new Scanner(System.in);

        ArrayList<Person> list = new ArrayList<Person>();

        while (true) {
            System.out.println("Ingrese el nombre, edad y cedula:  ");
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
            int age = Integer.parseInt(vector[1]);
            int idn = Integer.parseInt(vector[2]);

            // int age = Integer.parseInt(scn.nextLine());
            Person person = new Person(name, age, idn);

            list.add(person);

        }

        System.out.println("\n\nImpresion con for normal: ");
        
        System.out.println("\n\nImpresion con for each: ");
        for (Person aux : list) {
            System.out.println(aux.getName() + " - " + aux.getIdn() +" - " + aux.getIdn());
        }
    }

}