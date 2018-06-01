/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.CropData;
 
/**
 *
 * @author awesome
 */
public class CropControl {
    
    // Purpose: buy land
    // Parameters: the price of land, number of acres to buy, a reference to CropData object
    // Pre-conditions: enough wheat to buy land (wheat must be equal to or more than amount 
    // of land to buy multiplied by price per bushel [w >= b * p]), enough citizens to farm 
    // land (acres must be equal to or less than number of citizens multiplied by 10 [a <= c * 10]),
    // number entered by user must be 0 or positive integer [b >= 0]
    // Returns: amount of land after purchase

    public static int buyLand(int landPrice, int acresToBuy, CropData cropData) {
        // IF acresToBuy < 0, return -1
        if (acresToBuy < 0) {
            return -1;
        }
        // IF wheatInStore < acresToBuy x landPrice, return -1
        if (cropData.getWheatInStore() < acresToBuy * landPrice) {
            return -1;
        }
        // IF acresToBuy + acresOwned > population x 10, return -1
        if (acresToBuy + cropData.getAcresOwned() > cropData.getPopulation() * 10) {
            return -1;
        }
       
        // wheatInStore = wheatInStore – (acresToBuy x landPrice
        cropData.setWheatInStore(cropData.getWheatInStore() - (acresToBuy * landPrice));
        // acresOwned = acresOwned + acresToBuy
        cropData.setAcresOwned(cropData.getAcresOwned() + acresToBuy);
       
        // return acresOwned
        return cropData.getAcresOwned();
   }
    
    // sellLandmethod
    // Purpose: Sell land -subtracts from the acres owned
    // Parameters: the price of land, the number of acres to sell, and
    // a reference to a CropDataobject
    // Pre-conditions: acresToSell>= 0 and acresToSell<= acresOwned
    // Returns: the number of acres owned after the sale
    public static int sellLand(int landPrice, int acresToSell, CropData cropData) {
        int acresOwned = cropData.getAcresOwned();
        int wheatInStore = cropData.getWheatInStore();

        //if acresToSell< 0, return -1
        if(acresToSell < 0) {
            return -1;
        }
        //if acresToSell> acresOwned, return -1
        if(acresToSell > acresOwned) {
            return -1;
        }

        //acresOwned= acresOwned-acresToSell
        acresOwned -= acresToSell;
        cropData.setAcresOwned(acresOwned);

        //wheatInStore= wheatInStore+ acresToSell* landPrice
        wheatInStore -= acresToSell * landPrice;
        cropData.setWheatInStore(wheatInStore);

        //return acresOwned
        return acresOwned;
    }
    
    // Purpose: Plant crops
    // Parameters: number of acres to plant, a reference to CropData object
    // Pre-conditions: number entered by user must be 0 or positive integer [b >= 0], 
    // acres owned must be greater or equal to acres planted [a <= p], wheat in storage 
    // must be greater or equal to wheat in storage minus acres planted divided by 2 
    // [w >= w – (p / 2)]
    // Return: wheat in storage

    public static int plantCrops(int acresToPlant, CropData cropData) {
        // IF acresToPlant < 0, return -1
        if (acresToPlant < 0) {
            return -1;
        }
        // IF acresOwned < acresToPlant, return -1
        if (cropData.getAcresOwned() < acresToPlant) {
            return -1;
        }
        // IF wheatInStore < acresToPlant / 2, return -1
        if (cropData.getWheatInStore() < acresToPlant / 2) {
            return -1;
        }
        
        // wheatInStore = wheatInStore – (acresToPlant / 2)
        cropData.setWheatInStore(cropData.getWheatInStore() - acresToPlant / 2);
        // return wheatInStore
        return cropData.getWheatInStore();
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

    public static int feedPeople(int bushelsGiven, CropData cropData) {
        if(bushelsGiven < 0) {
            return -1;
        }
        if(bushelsGiven > cropData.getWheatInStore()) {
            return -1;
        }

        cropData.setWheatInStore(cropData.getWheatInStore() - bushelsGiven);
        return cropData.getWheatInStore();
    }
}
