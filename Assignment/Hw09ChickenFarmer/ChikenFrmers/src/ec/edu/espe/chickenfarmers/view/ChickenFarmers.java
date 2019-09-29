
package ec.edu.espe.chickenfarmers.view;

 
public class ChickenFarmers {

    public static void main(String[] args) {
        // TODO code application logic here
        ChickenFarmer name = new ChickenFarmer();
        name.namefarmer("Diego");     
        Coop coop1 = new Coop();
        coop1.show();
        
        Coop coop2 = new Coop();
        coop2.show1();
        
    }
}
