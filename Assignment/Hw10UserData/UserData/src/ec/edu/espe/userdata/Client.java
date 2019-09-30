package ec.edu.espe.userdata;
import java.util.Scanner;
public class Client {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String name;
        String email;
        int number;
         
        System.out.println("Enter name");
        name = entrada.nexLine();
        System.out.println("Enter email");
        email = entrada.nexInt();
          
    }
    
}
