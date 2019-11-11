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

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(int subtraction) {
        this.subtraction = subtraction;
    }

    public int getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(int multiplication) {
        this.multiplication = multiplication;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

}