import java.io.File;
import java.io.FileWriter;

import java.io.IOException;
import javax.swing.JOptionPane;


public class NewClass {
    public static void main(String[] args){
        File file;
        file = new File("Data.txt");
        FileWriter write;
        String name = "", nota1,nota2,nota3;
        nota1 = "";
        nota2 = "";
        nota3="";
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(file + "created");
            } catch (IOException e) {
            }
        } else {
            try {
                name = JOptionPane.showInputDialog(null, "enter name"
                        + "solicitando datos" + 3);
                nota1= JOptionPane.showInputDialog(null, "enter email"
                        + "solicitando datos" + 3);
                nota2= JOptionPane.showInputDialog(null, "enter email"
                        + "solicitando datos" + 3);
                String nota = JOptionPane.showInputDialog(null, "enter email"
                        + "solicitando datos" + 3);
                String numberFather = JOptionPane.showInputDialog(null, "enter id"
                        + "solicitando datos" + 3);
                write = new FileWrite(file, true);
                line = new PrintWriter(file);
                line.println(name);
                line.println(nota1);
                line.println(nota2);
                line.println(nota3);
                line.println(numberFather);
                linea.close();
                write.close();
            } catch (Exception e) {
                e.printStackTrace();
        }
    }
        System.out.println("Name_" + file.getName());
        System.out.println("Read_" + file.canRead());
        System.out.println("Write_" + file.canWrite());
        System.out.println("Run_" + file.canExecute());
    
}
