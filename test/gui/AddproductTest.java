/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package gui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aathif
 */
public class AddproductTest {
    
    public AddproductTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of time method, of class Addproduct.
     */
    @Test
    public void testTime() {
        System.out.println("time");
        Addproduct instance = new Addproduct();
        instance.time();
     
    }

    /**
     * Test of date method, of class Addproduct.
     */
    @Test
    public void testDate() {
        System.out.println("date");
        Addproduct instance = new Addproduct();
        instance.date();
  
    }

    /**
     * Test of main method, of class Addproduct.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Addproduct.main(args);
    
    }
    
}
