/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import exceptions.*;

/**
 *
 * @author awesome
 */
public class CropView {
    // Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);
    
    // Get references to the Game object and the CropData object
    private static Game theGame = CityOfAaron.getTheGame();
    private static CropData cropData = theGame.getCropData();
    
    /**
    * The buyLandView method
    * Purpose: interface with the user input for buying land * Parameters: none
    * Returns: none
    */
    public static void buyLandView() {
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();
        // Prompt the user to enter the number of acres to buy
        System.out.format("You can buy land for %d bushels per acre.%n",price);
        System.out.print("How many acres of new land do you want to buy? ");

        // Get the user’s input and save it.
        int toBuy;

        boolean paramsNotOkay;
        do {
            paramsNotOkay = false;
            System.out.print("\nHow many acres of land do you wish to buy? ");
            toBuy = keyboard.nextInt();
            try {
                // Call the buyLand() method in the control layer to buy the land
                CropControl.buyLand(price, toBuy, cropData);
            } catch(CropException error) {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(error.getMessage());
                paramsNotOkay = true;
            }
        } while(paramsNotOkay);
        
    }
    
    public static void sellLandView() {
        // get the cost of land for this round
        int price = CropControl.calcLandCost();
        
        // Prompt user to enter the number of acres to sell
        
        int toSell;
        boolean paramsNotOkay;
        do {
            paramsNotOkay = false;
            System.out.format("You can sell land for %d bushels per acre.%n",price);
            System.out.print("How many acres of new land do you want to sell? ");
            // Get the user’s input and save it.
            toSell = keyboard.nextInt();
            try {
                // Call the sellLand() method in the control layer to sell the land
                CropControl.sellLand(price, toSell, cropData);
            } catch(CropException error) {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(error.getMessage());
                paramsNotOkay = true;
            }
        } while(paramsNotOkay);   
    }
    
    public static void feedPeopleView() {
                
        int bushels;
        
        boolean paramsNotOkay;
        do {
            paramsNotOkay = false;
            // Prompt user to enter how many bushels of grain to give to the people
            System.out.format("How many bushels of grain do you want to give to the people?%n ");
            // Get the user’s input and save it.
            bushels = keyboard.nextInt();
            try {
                // Call the feedPeople() method in the control layer 
                CropControl.feedPeople(bushels, cropData);
            } catch(CropException error) {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(error.getMessage());
                paramsNotOkay = true;
            }
        } while(paramsNotOkay);
    }
    
    public static void plantCropsView() {
        int plantedCrops;
        
        boolean paramsNotOkay;
        do {
            paramsNotOkay = false;
            // Prompt the user to input how many acres of land to plant
        System.out.format("How many acres of land do you want to plant?%n ");
            // Get the user’s input and save it.
            plantedCrops = keyboard.nextInt();
            try {
                // Call the plantCrops() method in the control layer
                CropControl.plantCrops(plantedCrops, cropData);
            } catch(CropException error) {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(error.getMessage());
                paramsNotOkay = true;
            }
        } while(paramsNotOkay);
    }
    
    public static void setOfferingView() {
        // Prompt the user to input percentage of harvest to pay in offering
        System.out.format("What percentage of your harvest do you want to pay as an offering (0-100)?%n ");
        
        // Get the user's input and save it.
        int offeringPercentage = keyboard.nextInt();
        
        // Call the plantCrops() method in the control layer
        CropControl.setOffering(offeringPercentage, cropData);
    }
    
    /**
    * The runCropsView method()
    * Purpose: runs the CityOfAaron game
    * Parameters: none
    * Returns: none
    */
    public static void runCropsView() {
        // call the buyLandView() method
        buyLandView();
        // add calls to the other crop view methods
        // as they are written
    }
}
