/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.Test;
import static org.junit.Assert.*;
import model.CropData;

/**
 *
 * @author awesome
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand() {
//        System.out.println("buyLand");
//        int landPrice = 0;
//        int acresToBuy = 0;
//        CropData cropData = null;
//        int expResult = 0;
//        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        
        System.out.println("\tTest case 1");
        CropData cropData = new CropData();
        int landPrice = 20;
        int acresToBuy = 50;
        CropControl instance = new CropControl();
        int expResult = 1100;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
