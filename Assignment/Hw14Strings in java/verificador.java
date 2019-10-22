import java.util.ArrayList;
import java.util.Scanner;

import jdk.nashorn.internal.ir.ReturnNode;
public class verificador{
  
  private int ope1;
  private int ope2;
  private int ope3;
  private int ope4;
  private int ope5; 
  private int ope6; 
  private int ope7; 
  private int ope8;
  private int ope9;
  
  int suma=0;
  int respuesta =0;
  int contador=0;
  boolean aux = false;

  public String leer () {
    System.out.println("Ingrese la cedula");
    Scanner entrada = new Scanner(System.in);
    String cadena = entrada.nextLine();
    int numero = cadena.length();
    String[] vector = cadena.split("");
    int dig1 = Integer.parseInt(vector[0]);
    int dig2 = Integer.parseInt(vector[1]);
    int dig3 = Integer.parseInt(vector[2]);
    int dig4 = Integer.parseInt(vector[3]);
    int dig5 = Integer.parseInt(vector[4]);
    int dig6 = Integer.parseInt(vector[5]);
    int dig7 = Integer.parseInt(vector[6]);
    int dig8 = Integer.parseInt(vector[7]);
    int dig9 = Integer.parseInt(vector[8]);
    int digverificador = Integer.parseInt(vector[9]);
    
    
    
      
          ope1 = dig1 *2;
          if (ope1 >= 10){
            ope1 = ope1 - 9; 
          }
          ope2 = dig2*1;
          if (ope2 >= 9){
            ope2 = ope2-9;
          }
          ope3 = dig3*2;
          if (ope3 >= 9){
            ope3 = ope3-9;
          }
          ope4 = dig4*1;
          if (ope4 >= 9){
            ope4 = ope4-9;  
          }
          ope5 = dig5*2;
          if (ope5 >= 9){
            ope5 = ope5-9;
          }
          ope6 = dig6*1;
          if (ope2 >= 9){
            ope6 = ope6-9;
          }
          ope7 = dig7*2;
          if (ope7 >= 9){
            ope7 = ope7-9;
          }
          ope8 = dig8*1;
          if (ope2 >= 9){
            ope8 = ope8-9;
          }
          ope9 = dig9*2;
          if (ope9 >= 9){
            ope9 = ope9-9;
          }
          if( numero == 10){
            suma = ope1 + ope2 + ope3 + ope4 + ope5 + ope6 + ope7 + ope8 + ope9;
            respuesta = suma%10;
            
            
            if  ((respuesta == digverificador) || (digverificador == 10 - respuesta)){
              System.out.println("cedula correcta");
              aux = true;
            }else{
              System.out.println("cedula incorrecta");
            }

          }else{
              System.out.println("cedula incorrecta");
    }
     return cadena;
  } 
}
  


   