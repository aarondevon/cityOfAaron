/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.Test;
import static org.junit.Assert.*;
import model.CropData;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author awesome
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
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
        
        System.out.println("\tbuyLand Test case 1");
        CropData cropData = new CropData();
        cropData.setPopulation(200);
        cropData.setAcresOwned(1050);
        cropData.setWheatInStore(2000);
        int landPrice = 20;
        int acresToBuy = 50;
        CropControl instance = new CropControl();
        int expResult = 1100;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("\tbuyLand Test case 2");
        // CropData cropData = new CropData();
        cropData.setPopulation(200);
        cropData.setAcresOwned(1000);
        cropData.setWheatInStore(2700);
        landPrice = 20;
        acresToBuy = 50;
        //CropControl instance = new CropControl();
        expResult = 1050;
        result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("\tbuyLand Test case 3");
        //CropData cropData = new CropData();
        cropData.setPopulation(42);
        cropData.setAcresOwned(682);
        cropData.setWheatInStore(3422);
        landPrice = 22;
        acresToBuy = 20;
        //CropControl instance = new CropControl();
        expResult = -1;
        result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops() {
//        System.out.println("plantCrops");
//        int acresToPlant = 0;
//        CropData cropData = null;
//        int expResult = 0;
//        int result = CropControl.plantCrops(acresToPlant, cropData);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        
        System.out.println("\tplantCrops Test case 1");
        CropData cropData = new CropData();
        cropData.setAcresOwned(750);
        cropData.setWheatInStore(500);
        int acresToPlant = 130;
        int expResult = 435;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tplantCrops Test case 2");
        //CropData cropData = new CropData();
        cropData.setAcresOwned(300);
        cropData.setWheatInStore(400);
        acresToPlant = 250;
        expResult = 275;
        result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tplantCrops Test case 3");
        //CropData cropData = new CropData();
        cropData.setAcresOwned(50);
        cropData.setWheatInStore(700);
        acresToPlant = 400;
        expResult = -1;
        result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
//    public void testSetOffering() {
//        System.out.println("setOffering");
//        int offering = 0;
//        CropData cropData = null;
//        int expResult = 0;
//        int result = CropControl.setOffering(offering, cropData);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    public void testSetOffering() {
        System.out.println("\tsetOffering Test case 1");
        CropData cropData = new CropData();
        int offering = 0;
        int expResult = 0;
        int result = CropControl.setOffering(offering, cropData);
        assertEquals(expResult, result);
        
         System.out.println("\tsetOffering Test case 2");
        //CropData cropData = new CropData();
        offering = 100;
        expResult = 100;
        result = CropControl.setOffering(offering, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tsetOffering Test case 3");
        //CropData cropData = new CropData();
        offering = -3;
        expResult = -1;
        result = CropControl.setOffering(offering, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tsetOffering Test case 4");
        //CropData cropData = new CropData();
        offering = 0;
        expResult = 0;
        result = CropControl.setOffering(offering, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tsetOffering Test case 5");
        //CropData cropData = new CropData();
        offering = 99;
        expResult = 99;
        result = CropControl.setOffering(offering, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of feedPeople method, of class CropControl.
     */
    @Test
    public void testFeedPeople() {
//        System.out.println("feedPeople");
//        int wheatInStore = 0;
//        int bushelsGiven = 0;
//        CropData cropData = new CropData();
//        int expResult = 0;
//        int result = CropControl.feedPeople(wheatInStore, bushelsGiven, cropData);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        System.out.println("\tfeedPeople Test case 1");
        CropData cropData = new CropData();
        cropData.setWheatInStore(500);
        int bushelsGiven = 155;
        int expResult = 345;
        int result = CropControl.feedPeople(bushelsGiven, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tfeedPeople Test case 2");
        //CropData cropData = new CropData();
        cropData.setWheatInStore(1000);
        bushelsGiven = 500;
        expResult = 500;
        result = CropControl.feedPeople(bushelsGiven, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tfeedPeople Test case 3");
        //CropData cropData = new CropData();
        cropData.setWheatInStore(4000);
        bushelsGiven = 100;
        expResult = 3900;
        result = CropControl.feedPeople(bushelsGiven, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tfeedPeople Test case 4");
        //CropData cropData = new CropData();
        cropData.setWheatInStore(235);
        bushelsGiven = 400;
        expResult = -1;
        result = CropControl.feedPeople(bushelsGiven, cropData);
        assertEquals(expResult, result);
    }

 
    
}
