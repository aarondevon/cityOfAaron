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
        // System.out.println("buyLand");
        // int landPrice = 0;
        // int acresToBuy = 0;
        // CropData cropData = null;
        // int expResult = 0;
        // int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        System.out.println("\tbuyLand Test case 1 - Valid");
        CropData cropData = new CropData();
        cropData.setPopulation(200);
        cropData.setAcresOwned(1000);
        cropData.setWheatInStore(2700);
        int landPrice = 20;
        int acresToBuy = 50;
        CropControl instance = new CropControl();
        int expResult = 1050;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("\tbuyLand Test case 2 - Invalid");
        cropData.setPopulation(200);
        cropData.setAcresOwned(1000);
        cropData.setWheatInStore(2700);
        landPrice = 20;
        acresToBuy = -5;
        expResult = -1;
        result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("\tbuyLand Test case 3 - Invalid");
        cropData.setPopulation(100);
        cropData.setAcresOwned(1000);
        cropData.setWheatInStore(2700);
        landPrice = 20;
        acresToBuy = 5;
        expResult = -1;
        result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("\tbuyLand Test case 4 - Invalid");
        cropData.setPopulation(200);
        cropData.setAcresOwned(1000);
        cropData.setWheatInStore(2700);
        landPrice = 20;
        acresToBuy = 150;
        expResult = -1;
        result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("\tbuyLand Test case 5 - Boundary");
        cropData.setPopulation(200);
        cropData.setAcresOwned(1000);
        cropData.setWheatInStore(2700);
        landPrice = 20;
        acresToBuy = 0;
        expResult = 1000;
        result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("\tbuyLand Test case 6 - Boundary");
        cropData.setPopulation(200);
        cropData.setAcresOwned(1000);
        cropData.setWheatInStore(2700);
        landPrice = 20;
        acresToBuy = 135;
        expResult = 1135;
        result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() {
        // System.out.println("sellLand");
        // int landPrice = 0;
        // int acresToSell = 0;
        // CropData cropData = null;
        // int expResult = 0;
        // int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        System.out.println("\tsellLand Test case 1 - Valid");
        CropData cropData = new CropData();
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2800);
        int landPrice = 15;
        int acresToSell = 10;
        int expResult = 2790;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tsellLand Test case 2 - Invalid");
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2800);
        landPrice = 20;
        acresToSell = -5;
        expResult = -1;
        result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tsellLand Test case 3 - Invalid");
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2800);
        landPrice = 20;
        acresToSell = 3000;
        expResult = -1;
        result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tsellLand Test case 4 - Boundary");
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2000);
        landPrice = 10;
        acresToSell = 2000;
        expResult = 0;
        result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tsellLand Test case 5 - Boundary");
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2000);
        landPrice = 10;
        acresToSell = 0;
        expResult = 2000;
        result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);   
    }

    /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops() {
        // System.out.println("plantCrops");
        // int acresToPlant = 0;
        // CropData cropData = null;
        // int expResult = 0;
        // int result = CropControl.plantCrops(acresToPlant, cropData);
        // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        System.out.println("\tplantCrops Test case 1 - Valid");
        CropData cropData = new CropData();
        cropData.setAcresOwned(650);
        cropData.setWheatInStore(750);
        int acresToPlant = 500;
        int expResult = 500;
        int result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tplantCrops Test case 2 - Invalid");
        cropData.setAcresOwned(650);
        cropData.setWheatInStore(150);
        acresToPlant = 500;
        expResult = -1;
        result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tplantCrops Test case 3 - Invalid");
        cropData.setAcresOwned(650);
        cropData.setWheatInStore(750);
        acresToPlant = -50;
        expResult = -1;
        result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tplantCrops Test case 4 - Invalid");
        cropData.setAcresOwned(650);
        cropData.setWheatInStore(750);
        acresToPlant = 750;
        expResult = -1;
        result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tplantCrops Test case 5 - Boundary");
        cropData.setAcresOwned(650);
        cropData.setWheatInStore(750);
        acresToPlant = 0;
        expResult = 750;
        result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tplantCrops Test case 6 - Boundary");
        cropData.setAcresOwned(650);
        cropData.setWheatInStore(325);
        acresToPlant = 650;
        expResult = 0;
        result = CropControl.plantCrops(acresToPlant, cropData);
        assertEquals(expResult, result);
    }

    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test

    public void testSetOffering() {
        // System.out.println("setOffering");
        // int offering = 0;
        // CropData cropData = null;
        // int expResult = 0;
        // int result = CropControl.setOffering(offering, cropData);
        // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        System.out.println("\tsetOffering Test case 1 - Valid");
        CropData cropData = new CropData();
        int offering = 100;
        int expResult = 100;
        int result = CropControl.setOffering(offering, cropData);
        assertEquals(expResult, result);
        
         System.out.println("\tsetOffering Test case 2 - Invalid");
        //CropData cropData = new CropData();
        offering = -3;
        expResult = -1;
        result = CropControl.setOffering(offering, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tsetOffering Test case 3 - Invalid");
        //CropData cropData = new CropData();
        offering = 121;
        expResult = -1;
        result = CropControl.setOffering(offering, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tsetOffering Test case 4 - Boundary");
        //CropData cropData = new CropData();
        offering = 0;
        expResult = 0;
        result = CropControl.setOffering(offering, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tsetOffering Test case 5 - Boundary");
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
        // System.out.println("feedPeople");
        // int wheatInStore = 0;
        // int bushelsGiven = 0;
        // CropData cropData = new CropData();
        // int expResult = 0;
        // int result = CropControl.feedPeople(wheatInStore, bushelsGiven, cropData);
        // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
        System.out.println("\tfeedPeople Test case 1 - Valid");
        CropData cropData = new CropData();
        cropData.setWheatInStore(500);
        int bushelsGiven = 155;
        int expResult = 345;
        int result = CropControl.feedPeople(bushelsGiven, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tfeedPeople Test case 2 - Invalid");
        cropData.setWheatInStore(500);
        bushelsGiven = -50;
        expResult = -1;
        result = CropControl.feedPeople(bushelsGiven, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tfeedPeople Test case 3 - Invalid");
        cropData.setWheatInStore(500);
        bushelsGiven = 550;
        expResult = -1;
        result = CropControl.feedPeople(bushelsGiven, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tfeedPeople Test case 4 - Boundary");
        cropData.setWheatInStore(500);
        bushelsGiven = 500;
        expResult = 0;
        result = CropControl.feedPeople(bushelsGiven, cropData);
        assertEquals(expResult, result);
        
        System.out.println("\tfeedPeople Test case 5 - Boundary");
        cropData.setWheatInStore(500);
        bushelsGiven = 0;
        expResult = 500;
        result = CropControl.feedPeople(bushelsGiven, cropData);
        assertEquals(expResult, result);
    }
}
