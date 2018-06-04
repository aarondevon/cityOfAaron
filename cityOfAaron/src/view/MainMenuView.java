// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Aaron Sawyer, Carly Kjelstrom
// Date last modified: May 2018
//-------------------------------------------------------------
package view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.Player;

/**
 *
 * @author aaron and carly
 */
public class MainMenuView {
    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;
    
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
            System.out.println(mainMenu);
            
            // Prompt the user and get the user’s input
            menuOption = getMenuOption();
            
            // Perform the desired action
            doAction(menuOption);
            
            // Determine and display the next view
            } while (menuOption != max);
        }
        
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
        
        // PAGE 48
}
