/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chickenfarmers.mode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
public class ChickenTest {
    
    public ChickenTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of doStuff method, of class Chicken.
     */
    @Test
    public void testDoStuff() {
        System.out.println("doStuff");
        int forTime = 0;
        Chicken instance = new Chicken();
        instance.doStuff(forTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Chicken.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Chicken instance = new Chicken();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Chicken.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Chicken instance = new Chicken();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Chicken.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Chicken instance = new Chicken();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Chicken.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Chicken instance = new Chicken();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Chicken.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Chicken instance = new Chicken();
        String expResult = "";
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Chicken.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        Chicken instance = new Chicken();
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Chicken.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Chicken instance = new Chicken();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Chicken.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Chicken instance = new Chicken();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsmolting method, of class Chicken.
     */
    @Test
    public void testIsIsmolting() {
        System.out.println("isIsmolting");
        Chicken instance = new Chicken();
        boolean expResult = false;
        boolean result = instance.isIsmolting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsmolting method, of class Chicken.
     */
    @Test
    public void testSetIsmolting() {
        System.out.println("setIsmolting");
        boolean ismolting = false;
        Chicken instance = new Chicken();
        instance.setIsmolting(ismolting);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
