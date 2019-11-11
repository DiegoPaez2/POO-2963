
public class Student {

    private String name;
    private int nota1, nota2, nota3;
    private int father_num;
    
    public Student (){
        
    }
    
    public Student(String name, int nota1, int nota2, int nota3, int father_num) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.father_num = father_num;

    }
    public void average(int nota1, int nota2, int nota3){
        float promedio = (nota1 + nota2 + nota3)/3;
        if (promedio >= 14){
            System.out.println("approved");
        }else{
            System.out.println("reprobate");
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getFather_num() {
        return father_num;
    }

    public void setFather_num(int father_num) {
        this.father_num = father_num;
    }

}
