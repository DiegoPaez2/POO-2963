package ec.edu.espe.userdata;
import java.io.File;
import java.io.IOException;
import java.io.*;


public class UserData {
    
    public static void main(String[] args) {
        File file;
        file = new File("Data.txt");
        FileWriter write;
        String name="",email="";
        int id;
        PrintWrite line;  
        if (!file.exists()){
            try{
                file.createNewFile();
                System.out.println(file + "created");
            }
            catch(IOException e){
            }
        }else{
            try{
                name = JOptionPane.showInputDialog(null,"enter name"+
                    "solicitando datos"+3);
                email=JOptionPane.showInputDialog(null,"enter email"+
                    "solicitando datos"+3);
                id=JOptionPane.showInputDialog(null,"enter id"+
                     "solicitando datos"+3);  
            }
            catch (Exception e){
                e.printStackTrace();
            }       
        }
        System.out.println("Name_" +file.getName());
        System.out.println("Read_" +file.canRead());
        System.out.println("Write_" +file.canWrite());
        System.out.println("Run_" +file.canExecute());
    }
    
}
    
