/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

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
public class Homework4Test {
    
    public Homework4Test() {
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
     * Test of createDatabase method, of class Homework4.
     */
    @Test
    public void testCreateDatabase() {
        System.out.println("createDatabase");
        String file = "";
        Homework4.createDatabase(file);
    }

    /**
     * Test of createTable method, of class Homework4.
     */
    @Test
    public void testCreateTable() {
        System.out.println("createTable");
        String file = "";
        Homework4.createTable(file);
    }

    /**
     * Test of main method, of class Homework4.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Homework4.main(args);
    }
    
}
