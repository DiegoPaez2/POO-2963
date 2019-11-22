
package ec.edu.espe.Date;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class DateTest {
    
    public DateTest() {
    }

   
    

    /**
     * Test of validarFecha method, of class Date.
     */
    @Test
    public void testValidarFecha() {
        System.out.println("validarFecha");
        String fecha = "";
        boolean expResult = false;
        boolean result = Date.validarFecha(fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of insertDate method, of class Date.
     */
    @Test
    public void testInsertDate() {
        System.out.println("insertDate");
        String date = "";
        boolean expResult = false;
        boolean result = Date.insertDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of siAnacido method, of class Date.
     */
    @Test
    public void testSiAnacido() {
        System.out.println("siAnacido");
        String date = "";
        int expResult = 0;
        int result = Date.ifBorn(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of age method, of class Date.
     */
    @Test
    public void testAge() {
        System.out.println("age");
        String date = "";
        Date.age(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
