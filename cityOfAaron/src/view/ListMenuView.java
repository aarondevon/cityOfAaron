/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import view.*;
import control.*;
import model.*;
import cityofaaron.CityOfAaron;

/**
 *
 * @author awesome
 */
public class ListMenuView extends MenuView {
    ListMenuView() {
        super("\n" +
                "**********************************\n" +
                "* CITY OF AARON: LIST MENU *\n" +
                "**********************************\n" +
                " 1 - View the animals in the storehouse\n" +
                " 2 - View the tools in the storehouse\n" +
                " 3 - View the provisions in the storehouse\n" +
                " 4 - View authors of this game\n" +
                " 5 - Back to the Game Menu?\n",
            5);
    }
    
    @Override public void doAction(int option) {
            switch (option) {
                case 1: // Display listAnimals()
                    listAnimals();
                    break;
                case 2: // if the option is 2, call startExistingGame( )
                    listTools();
                    break;
                case 3: // if the option is 3, call displayHelpMenu( )
                    listProvisions();
                    break;
                case 4: // if the option is 4, call displaySaveGame( )
                    listTeam();
                    break;
                case 5:
                    break;   
            }
        }
    
    public void listAnimals() {
        keyboard.nextLine();
        System.out.println("Would you like to display or save the list");
        System.out.println("Enter 1 to display the list or enter any key to save the list");
        String saveOrDisplay = keyboard.next();
        
        GameControl theGameControl = new GameControl();
        
        if (saveOrDisplay.equals("1")) {
            theGameControl.displayAnimalList();
        } else {
            System.out.println("Please enter the file path.");
            keyboard.nextLine();
            String filePath = keyboard.nextLine();
            theGameControl.saveAnimalList(filePath);
        }
    }
    
    public void listTools() {
        GameControl theGameControl = new GameControl();
        
        keyboard.nextLine();
        System.out.println("Would you like to display or save the list");
        System.out.println("Enter 1 to display the list or enter any key to save the list");
        String saveOrDisplay = keyboard.next();
        
        if (saveOrDisplay.equals("1")) {
            theGameControl.displayToolList();
        } else {
            System.out.println("Please enter the file path.");
            keyboard.nextLine();
            String filePath = keyboard.nextLine();
            theGameControl.saveToolList(filePath);
        }
    }
    
    public void listProvisions() {
        GameControl theGameControl = new GameControl();
        
        keyboard.nextLine();
        System.out.println("Would you like to display or save the list");
        System.out.println("Enter 1 to display the list or enter any key to save the list");
        String saveOrDisplay = keyboard.next();
        
        if (saveOrDisplay.equals("1")) {
            theGameControl.displayProvisionList();
        } else {
            System.out.println("Please enter the file path.");
            keyboard.nextLine();
            String filePath = keyboard.nextLine();
            theGameControl.saveProvisionList(filePath);
        }
    }
    
    public void listTeam() {
        GameControl theGameControl = new GameControl();
        keyboard.nextLine();
        System.out.println("Would you like to display or save the list");
        System.out.println("Enter 1 to display the list or enter any key to save the list");
        String saveOrDisplay = keyboard.next();
        
        if (saveOrDisplay.equals("1")) {
            theGameControl.displayTeamList();
        } else {
            System.out.println("Please enter the file path.");
            keyboard.nextLine();
            String filePath = keyboard.nextLine();
            theGameControl.saveTeamList(filePath);
        }
    }
}
