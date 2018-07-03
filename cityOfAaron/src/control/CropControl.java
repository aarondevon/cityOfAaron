/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.Random;
import model.CropData;
import exceptions.CropException;
 
/**
 *
 * @author awesome
 */
public class CropControl {
    // constants
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 11;
    
    // random number generator
    private static Random random = new Random();
    
    // Purpose: buy land
    // Parameters: the price of land, number of acres to buy, a reference to CropData object
    // Pre-conditions: enough wheat to buy land (wheat must be equal to or more than amount 
    // of land to buy multiplied by price per bushel [w >= b * p]), enough citizens to farm 
    // land (acres must be equal to or less than number of citizens multiplied by 10 [a <= c * 10]),
    // number entered by user must be 0 or positive integer [b >= 0]
    // Returns: amount of land after purchase

    public static void buyLand(int landPrice, int acresToBuy, CropData cropData) throws CropException {
        // IF acresToBuy < 0, return -1
        if (acresToBuy < 0) {
            throw new CropException("A negative value was input");
        }
        // IF wheatInStore < acresToBuy x landPrice, return -1
        if (cropData.getWheatInStore() < acresToBuy * landPrice) {
            throw new CropException("There is insufficient wheat to buy this much land");
            
        }
        // IF acresToBuy + acresOwned > population x 10, return -1
        if (acresToBuy + cropData.getAcresOwned() > cropData.getPopulation() * 10) {
            throw new CropException("You do not have enough citizens for that much land");
        }
       
        // wheatInStore = wheatInStore – (acresToBuy x landPrice
        cropData.setWheatInStore(cropData.getWheatInStore() - (acresToBuy * landPrice));
        // acresOwned = acresOwned + acresToBuy
        cropData.setAcresOwned(cropData.getAcresOwned() + acresToBuy);
       
        // return acresOwned
//        return cropData.getAcresOwned();
   }
    
    // sellLandmethod
    // Purpose: Sell land -subtracts from the acres owned
    // Parameters: the price of land, the number of acres to sell, and
    // a reference to a CropDataobject
    // Pre-conditions: acresToSell>= 0 and acresToSell<= acresOwned
    // Returns: the number of acres owned after the sale
    public static void sellLand(int landPrice, int acresToSell, CropData cropData) throws CropException{
        int acresOwned = cropData.getAcresOwned();
        int wheatInStore = cropData.getWheatInStore();

        //if acresToSell< 0, return -1
        if(acresToSell < 0) {
            throw new CropException("A negative value was input");
        }
        //if acresToSell> acresOwned, return -1
        if(acresToSell > acresOwned) {
            throw new CropException("You do not have that much land");
        }

        //acresOwned= acresOwned-acresToSell
        acresOwned -= acresToSell;
        cropData.setAcresOwned(acresOwned);

        //wheatInStore= wheatInStore+ acresToSell* landPrice
        wheatInStore -= acresToSell * landPrice;
        cropData.setWheatInStore(wheatInStore);
        
    }
    
    // Purpose: Plant crops
    // Parameters: number of acres to plant, a reference to CropData object
    // Pre-conditions: number entered by user must be 0 or positive integer [b >= 0], 
    // acres owned must be greater or equal to acres planted [a <= p], wheat in storage 
    // must be greater or equal to wheat in storage minus acres planted divided by 2 
    // [w >= w – (p / 2)]
    // Return: wheat in storage

    public static void plantCrops(int acresToPlant, CropData cropData) throws CropException {
        // IF acresToPlant < 0, return -1
        if (acresToPlant < 0) {
            throw new CropException("A negative value was input");
        }
        // IF acresOwned < acresToPlant, return -1
        if (cropData.getAcresOwned() < acresToPlant) {
            throw new CropException("You do not have that much land");
        }
        // IF wheatInStore < acresToPlant / 2, return -1
        if (cropData.getWheatInStore() < acresToPlant / 2) {
            throw new CropException("You do not have enough wheat");
        }
        
        // wheatInStore = wheatInStore – (acresToPlant / 2)
        cropData.setWheatInStore(cropData.getWheatInStore() - acresToPlant / 2);
    }
   
    // Purpose: Obtain what percentage of the harvest the user wants to pay in offerings.
    // Parameters: number entered by user, a reference to CropData object
    // Pre-conditions: number entered by user must be greater than or equal to zero, number enterd by user must not be greater than one hundred. 
    // Returns: number entered by user
    public static int setOffering(int offering, CropData cropData) {
        // IF offering < 0, return -1
        if(offering < 0) {
            return -1;
        }
        // IF offering > 100, return -1
        if(offering > 100) {
            return -1;
        }
        cropData.setOffering(offering);
        // return offering
        return offering;
    }

    //Purpose: Receive input from user on how much wheat to set aside for feeding people
    // Parameters: number of bushels entered by user, reference to CropData object
    // Pre-conditions: number entered must be greater than or equal to zero, number entered must less than wheat in storage
    // Return: wheat left in store
    // Storage: store the number of bushels set aside to feed people
    public static void feedPeople(int bushelsGiven, CropData cropData) throws CropException {
        // IF bushelsGiven < 0, return -1
        if(bushelsGiven < 0) {
            throw new CropException("A negative value was input");
        }
        // IF bushelsGiven > wheatInStore, return -1
        if(bushelsGiven > cropData.getWheatInStore()) {
            throw new CropException("You do not have that many bushels of wheat");
        }
        // store amount of bushels set aside
        cropData.setWheatForPeople(bushelsGiven);
        
        // wheatInStore = wheatInStore - bushelsGiven
        cropData.setWheatInStore(cropData.getWheatInStore() - bushelsGiven);
    }
    
    /**
    * calcLandCost() method
    * Purpose: Calculate a random land cost between 17 and 27 bushels/acre * Parameters: none
    * Returns: the land cost
    */
    public static int calcLandCost() {
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landPrice; 
    }
}
