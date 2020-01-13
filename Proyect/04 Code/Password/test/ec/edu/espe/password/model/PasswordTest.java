/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.password.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class PasswordTest {
    

    /**
     * Test of Encrypt method, of class Password.
     */
    @Test
    public void testEncrypt() {
        System.out.println("Encrypt");
        String text = "This is a example";
        String expResult = "mhNaHNLWb6Sg3EpggGeNaTWuVYjWlxVb";
        String result = Password.Encrypt(text);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of Decrypted method, of class Password.
     */
    @Test
    public void testDecrypted() throws Exception {
        System.out.println("Decrypted");
        String textEncrypted = "mhNaHNLWb6Sg3EpggGeNaTWuVYjWlxVb";
        String expResult = "This is a example";
        String result = Password.Decrypted(textEncrypted);
        assertEquals(expResult, result);
       
    }
    
}
