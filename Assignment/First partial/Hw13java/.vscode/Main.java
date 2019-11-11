import javax.swing.JOptionPane;
public class Main{
    
    public static void main(String[] args){

        Operation op = new Operation();
        
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("1.sumar  2.restar  3. multiplicar 4.dividir "));
        op.readnumbers(); 
        switch (num){
            case 1:
                op.Add();
                break;
            case 2:
                op.subtract();
                break;
            case 3:
                op.multiply();
                break;
            case 4:
                op.divide();
                break;
            default :
                System.out.println("No as elegido una obcion del menu");
                break;
        }
    }
}