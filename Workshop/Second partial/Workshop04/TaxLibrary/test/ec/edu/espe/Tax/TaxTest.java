/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Tax;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author H304
 */
public class TaxTest {
    
    public TaxTest() {
    }
    
    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float base = 50388.37F;
        float expResult = 6046.6044F;
        float result = Tax.computeIva(base);
        assertEquals(expResult, result, 2);
    }
    
}
