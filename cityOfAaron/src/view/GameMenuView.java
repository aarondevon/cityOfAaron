/*
 * 
 */
package view;
import view.*;
/**
 *
 * @author carly and aaron
 */
public class GameMenuView extends MenuView {
   public GameMenuView() {
        super("\n" +
            "**********************************\n" +
            "* CITY OF AARON: NEW GAME MENU *\n" +
            "**********************************\n" +
            " 1 - View the map\n" +
            " 2 - View/Print a list\n" +
            " 3 - Move to a new location\n" +
            " 4 - Manage the Crops\n" +
            " 5 - Return to the Main Menu\n",
        5);
        }
   
   @Override public void doAction(int option) {
        switch (option) {
        case 1: // if the option is 1, call startNewGame( )
            viewMap();
            break;
        case 2: // if the option is 2, call startExistingGame( )
            viewList();
            break;
        case 3: // if the option is 3, call displayHelpMenu( )
            moveToNewLocation();
            break;
        case 4: // if the option is 4, call displaySaveGame( )
            manageCrops();
            break;
        case 5:
            MainMenuView mmv = new MainMenuView();
            mmv.displayMenu();
            }
        }
   
    public void viewMap() {
        System.out.println("viewMap");
    }
    
    public void viewList() {
        System.out.println("viewList");
    }
    
    public void moveToNewLocation() {
        System.out.println("moveToNewLocation");
    }
    
    public void manageCrops() {
        System.out.println("manageCrops");
    }
}
