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
        System.out.print("How many acres of land do you wish to buy? ");

        // Get the user’s input and save it.
        int toBuy;
        toBuy = keyboard.nextInt();
        // Call the buyLand() method in the control layer to buy the land
        CropControl.buyLand(toBuy, price, cropData);
    }
    
    public static void sellLandView() {
        // get the cost of land for this round
        int price = CropControl.calcLandCost();
        
        // Prompt user to enter the number of acres to sell
        System.out.format("You can sell land for %d bushels per acre.%n",price);
        System.out.print("How many acres of land do you wish to sell? ");
        
        // Get the user’s input and save it.
        int toSell;
        toSell = keyboard.nextInt();
        
        // Call the sellLand() method in the control layer to sell the land
        CropControl.sellLand(price, toSell, cropData);
    }
    
    public static void feedPeopleView() {
        // Prompt user to enter how many bushels of grain to give to the people
        System.out.format("How many bushels of grain do you want to give to the people? ");
        
        // Get the user's input and save it.
        int bushels = keyboard.nextInt();
        
        // Call the feedPeople() method in the control layer 
        CropControl.feedPeople(bushels, cropData);
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
