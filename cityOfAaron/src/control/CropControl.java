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
   
   public static int plantCrops() {
       
   }
}
