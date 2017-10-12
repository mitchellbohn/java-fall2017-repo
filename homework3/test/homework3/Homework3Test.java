/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.ArrayList;
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
public class Homework3Test {
    
    public Homework3Test() {
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
     * Test of sortandmodlist method, of class Homework3.
     */
    @Test
    public void testSortandmodlist() {
        System.out.println("sortandmodlist");
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(1);
        Homework3 instance = new Homework3();
        ArrayList expResult = new ArrayList();
        expResult.add(1);
        expResult.add(3);
        expResult.add(5);
        expResult.add(7);
        expResult.add(7);
        expResult.add(8);
        ArrayList result = instance.sortandmodlist(list);
        assertEquals(expResult, result);
    }
    
}
