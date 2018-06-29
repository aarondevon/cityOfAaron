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
                " 3 - View the porvisions in the storehouse\n" +
                " 4 - View authors of this game\n" +
                " 5 - Back to the Game Menu?\n",
            5);
    }
    
    @Override public void doAction(int option) {
            switch (option) {
                case 1: // if the option is 1, call startNewGame( )
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
        GameControl theGameControl = new GameControl();
        
        theGameControl.displayAnimalList();
        
    }
    
    public void listTools() {
        GameControl theGameControl = new GameControl();
        
        theGameControl.displayToolList();
    }
    
    public void listProvisions() {
        GameControl theGameControl = new GameControl();
        
        theGameControl.displayProvisionList();
    }
    
    public void listTeam() {
        GameControl theGameControl = new GameControl();
        
        theGameControl.displayTeamList();
    }
}
