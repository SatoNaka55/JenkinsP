/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adam.jenkinsproject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class SuperficieCarreTest {
    
    public SuperficieCarreTest() {
    }
    


    /**
     * Test of calculerSuperficie method, of class SuperficieCarre.
     */
    @org.junit.Test
    public void testCalculerSuperficie() {
        System.out.println("calculerSuperficie");
        double cote = 4.0;
        double expResult = 12.0;
        double result = SuperficieCarre.calculerSuperficie(cote);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
