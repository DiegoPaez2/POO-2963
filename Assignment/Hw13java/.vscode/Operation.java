import javax.swing.JOptionPane;

public class Operation {
    
    int num1;
    int num2;
    int sum;
    int subtraction;
    int multiplication;
    int division;

    public void readnumbers(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
    }

    public void Add (){
        sum = num1+num2;
        System.out.println("La suma es:"+sum);
        
    }

    public void subtract(){
        subtraction = num1-num2;
        System.out.println("La resta es:"+subtraction);
    }
    
    public void multiply(){
        multiplication = num1*num2;
        System.out.println("La multiplicacion es:"+multiplication);
    }

    public void divide(){
        division = num1/num2;
        System.out.println("La division es:"+division); 
    }

}