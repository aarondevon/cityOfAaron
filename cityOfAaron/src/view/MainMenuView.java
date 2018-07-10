// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Aaron Sawyer, Carly Kjelstrom
// Date last modified: May 2018
//-------------------------------------------------------------
package view;

import java.util.Scanner;
//import cityofaaron.CityOfAaron;
import model.*;
//import view.*;
import control.*;

/**
 *
 * @author aaron and carly
 */
public class MainMenuView extends MenuView {
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
        super("\n" +
            "**********************************\n" +
            "* CITY OF AARON: MAIN GAME MENU *\n" +
            "**********************************\n" +
            " 1 - Start new game\n" +
            " 2 - Get and start a saved game\n" +
            " 3 - Get help on playing the game\n" +
            " 4 - Save game\n" +
            " 5 - Quit\n",
        5);
        }
        
        /**
        *The doAction method
        * Purpose: performs the selected action
        * Parameters: none
        * Returns: none
        */
        // =================================== 
       @Override public void doAction(int option) {
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
            // Show banner page
            System.out.println(
            "********************************************************\n" +
            "* Welcome to the City of Aaron. You have been summoned *\n" +
            "* by the High Priest to assume your role as ruler of *\n" +
            "* the city. Your responsibility is to buy land, sell *\n" +
            "* land, determine how much wheat to plant each year, *\n" +
            "* and how much to set aside to feed the people. You *\n" +
            "* will also be required to pay an annual tithe on the *\n" +
            "* that is harvested. If you fail to provide *\n" +
            "* enough wheat for the people to eat, people will die *\n" +
            "* and your workforce will be diminished. Plan very *\n" +
            "* carefully or you may find yourself in trouble with *\n" +
            "* the people. And oh, watch out for plagues and rats! *\n" +
            "********************************************************\n");
            // Create a new Player object
            Player thePlayer = new Player();
            // Prompt for and get the user’s name.
            String name;
            System.out.println("Please type in your first name: ");
            name = keyboard.next();
            // Display a welcome message
            System.out.println("Welcome " + name + " have fun.");
            // Display the Game menu
            GameControl.createNewGame(name);
            GameMenuView gmv = new GameMenuView();
            gmv.displayMenu();
        }
        
        /**
        * The startSavedGame method
        * Purpose: creates game object and starts a saved game
        * Parameters: none
        * Returns: none
        */
        // ===================================
        public void startSavedGame() {
//          System.out.println("Start saved game option selected.");
            // get rid of \n character left in the stream
            keyboard.nextLine();
            // prompt user and get a file path
            System.out.println("Please enter the file path to load the game.");
            String filePath = keyboard.nextLine();
            // call the getSavedGame( ) method in the GameControl class to load the game
            GameControl theGame = new GameControl();
            theGame.getSavedGame(filePath);
            // display the game menu for the loaded game
            GameMenuView gmv = new GameMenuView();
            gmv.displayMenu();
        }
        
        /**
        * The displayHelpMenu method
        * Purpose: display the help menu
        * Parameters: none
        * Returns: none
        */
        // ===================================
        public void displayHelpMenuView() {
            HelpMenuView hmv = new HelpMenuView();
            hmv.displayMenu();
        }
        
        /**
        * The displaySavedGameMenu method
        * Purpose: display save game view
        * Parameters: none
        * Returns: none
        */
        // ===================================
        public void displaySaveGameView() {
        // System.out.println("display save game view.");
        // get rid of \n character left in the stream
        keyboard.nextLine();
        // prompt user and get a file path
        System.out.println("Please enter the file path to save the game.");
        String filePath = keyboard.nextLine();
        // call the getSavedGame( ) method in the GameControl class to load the game
        GameControl theGame = new GameControl();
        theGame.setSavedGame(filePath);
        // display the game menu for the loaded game
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();
        }
}
