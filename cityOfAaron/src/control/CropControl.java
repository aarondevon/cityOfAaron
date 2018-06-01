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
    
    public static int buyLand(int landPrice, int acresToBuy, CropData cropData) {
        if (acresToBuy < 0) {
            return -1;
        }
        if (cropData.getWheatInStore() < acresToBuy * landPrice) {
            return -1;
        }
        if (acresToBuy + cropData.getAcresOwned() > cropData.getPopulation() * 10) {
            return -1;
        }
       
        cropData.setWheatInStore(cropData.getWheatInStore() - (acresToBuy * landPrice));
        cropData.setAcresOwned(cropData.getAcresOwned() + acresToBuy);
       
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
   
   public static int plantCrops(int acresToPlant, CropData cropData) {
    if (acresToPlant < 0) {
        return -1;
    }
    if (cropData.getAcresOwned() < acresToPlant) {
        return -1;
    }
    if (cropData.getWheatInStore() < acresToPlant / 2) {
        return -1;
    }
    
    cropData.setWheatInStore(cropData.getWheatInStore() - acresToPlant / 2);
    return cropData.getWheatInStore();
   }
   
   public static int setOffering(int offering, CropData cropData) {
       if(offering < 0) {
           return -1;
       }
       if(offering > 100) {
           return -1;
       }
       cropData.setOffering(offering);
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
