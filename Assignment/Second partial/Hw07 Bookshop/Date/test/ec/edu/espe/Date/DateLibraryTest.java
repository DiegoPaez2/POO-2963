/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Date;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class DateLibraryTest {

    public DateLibraryTest() {
    }



    /**
     * Test of validateDate method, of class DateLibrary.
   

    /**
     * Test of checkIfBorn method, of class DateLibrary.
     */
    @Test
    public void testCheckIfBorn() {
        System.out.println("checkIfBorn");
        String date;
        date = "09/11/2999";
        boolean expResult = false;
        boolean result = DateLibrary.checkIfBorn(date);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of validateDate method, of class DateLibrary.
     */
    @Test
    public void testValidateDate() {
        System.out.println("validateDate");
        String date = "";
        boolean expResult = false;
        boolean result = DateLibrary.validateDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showYears method, of class DateLibrary.
     */
    @Test
    public void testShowYears() {
        System.out.println("showYears");
        String date = "";
        int expResult = 0;
        int result = DateLibrary.showYears(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDays method, of class DateLibrary.
     */
    @Test
    public void testShowDays() {
        System.out.println("showDays");
        String date = "";
        int expResult = 0;
        String result = DateLibrary.showDays(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMonths method, of class DateLibrary.
     */
    @Test
    public void testShowMonths() {
        System.out.println("showMonths");
        String date = "";
        int expResult = 0;
        int result = DateLibrary.showMonths(date);
        assertEquals(expResult, result);
        
    }

    

}
