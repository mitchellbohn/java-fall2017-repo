/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mitchell
 */
public class Homework2Test {
    
    public Homework2Test() {
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
     * Test of available method, of class Homework2.
     */
    @Test
    public void testAvailable() {
        System.out.println("available");
        int x = 5;
        int n = 3;
        int p[] = new int[n] ;
        p[0] = 2;
        p[1] = 2;
        p[2] = 2;
        Homework2 instance = new Homework2();
        int expResult = 14;
        int result = instance.available(x, n, p);
        assertEquals(expResult, result);
    }
    
}
