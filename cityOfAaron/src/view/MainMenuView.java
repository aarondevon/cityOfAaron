// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Aaron Sawyer, Carly Kjelstrom
// Date last modified: May 2018
//-------------------------------------------------------------
package view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.*;

/**
 *
 * @author aaron and carly
 */
public class MainMenuView {
    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;
    
    /**
        * The MainMenuView constructor
        * Purpose: Initialize the menu data
        * Parameters: none
        * Returns: none
        */
        // ===================================
        public MainMenuView() {
        theMenu = "\n" +
            "**********************************\n" +
            "* CITY OF AARON: MAIN GAME MENU *\n" +
            "**********************************\n" +
            " 1 - Start new game\n" +
            " 2 - Get and start a saved game\n" +
            " 3 - Get help on playing the game\n" +
            " 4 - Save game\n" +
            " 5 - Quit\n";
        max = 5;
        }
    
    /**
    * The displayMenuView method
    * Purpose: displays the menu, gets the user's input, and does the
    * selected action
    * Parameters: none
    * Returns: none
    */
    // =========================================================
        public void displayMenuView() {
            int menuOption;
            do {
            // Display the menu
            System.out.println(theMenu);
            
            // Prompt the user and get the user’s input
            menuOption = getMenuOption();
            
            // Perform the desired action
            doAction(menuOption);
            
            // Determine and display the next view
            } while (menuOption != max);
        }
        
        /**
        * The getMenuOption method
        * Purpose: gets the user's input
        * Parameters: none
        * Returns: integer - the option selected
        */
        // ===================================
        public int getMenuOption() {
            // declare a variable to hold user’s input
            int userInput;
        
            // begin loop
            do {
                // get user input from the keyboard
                userInput = keyboard.nextInt();
                // if it is not a valid value, output an error message
                if (userInput < 1 || userInput > max) {
                    System.out.println("Option must be between 1 and " + max);
                }
            // go back to the top of the loop if input was not valid
            } while (userInput < 1 || userInput > max);
            
            // return the value input by the user
            return userInput;
        } 
        
        /**
        *The doAction method
        * Purpose: performs the selected action
        * Parameters: none
        * Returns: none
        */
        // =================================== 
        public void doAction(int option) {
            switch (option) {
                case 1: // if the option is 1, call startNewGame( )
                    startNewGame();
                    break;
                case 2: // if the option is 2, call startExistingGame( )
                    startSavedGame();
                    break;
                case 3: // if the option is 3, call displayHelpMenu( )
                    displayHelpMenuView();
                    break;
                case 4: // if the option is 4, call displaySaveGame( )
                    displaySaveGameView();
                    break;
                case 5:
                    System.out.println("Thanks for playing ... goodbye.");
                // if the option is 5, display a goodbye message
            }
        }
        
        /**
        * The startNewGame method
        * Purpose: creates game object and starts the game
        * Parameters: none
        * Returns: none
        */
        // ===================================
        public void startNewGame() {
            // Create a CropData object,
            CropData cropData = new CropData();
            // initialize it
            cropData.setYear(0);
            cropData.setPopulation(100);
            cropData.setNewPeople(5);
            cropData.setCropYield(3);
            cropData.setNumberWhoDied(0);
            cropData.setOffering(10);
            cropData.setWheatInStore(2700);
            cropData.setAcresOwned(1000);
            cropData.setAcresPlanted(1000);
            cropData.setHarvest(3000);
            cropData.setOfferingBushels(300);
            cropData.setAcresPlanted(1000);
            
            //Create a new Game object.
            Game theGame = new Game();
            // Save a reference to it in the GameProject class.
            CityOfAaron.setTheGame(theGame);
            // Display the Banner Page.
            System.out.println("Welcome to the city of Aaron.");
            // Create a new Player object
            Player thePlayer = new Player();
            // Prompt for and get the user’s name.
            String name;
            System.out.println("Please type in your first name: ");
            name = keyboard.next();
            // Save the user’s name in the Player object
            thePlayer.setName(name);
            // Save a reference to the player object in the Game object
            theGame.setThePlayer(thePlayer);
            // Display a welcome message
            System.out.println("Welcome " + name + " have fun.");
            // Display the Game menu
            
            // save a reference to it in the Game
            theGame.setCropData(cropData);
        }
        
        /**
        * The startSavedGame method
        * Purpose: creates game object and starts a saved game
        * Parameters: none
        * Returns: none
        */
        // ===================================
        public void startSavedGame() {
        System.out.println("Start saved game option selected.");
        }
        
        /**
        * The displayHelpMenu method
        * Purpose: display the help menu
        * Parameters: none
        * Returns: none
        */
        // ===================================
        public void displayHelpMenuView() {
        System.out.println("Displaying help menu.");
        }
        
        /**
        * The displaySavedGameMenu method
        * Purpose: display save game view
        * Parameters: none
        * Returns: none
        */
        // ===================================
        public void displaySaveGameView() {
        System.out.println("display save game view.");
        }
}
