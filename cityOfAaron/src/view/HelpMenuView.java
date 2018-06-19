/*
 * 
 */
package view;
import view.*;
/**
 *
 * @author carly and aaron
 */
public class HelpMenuView extends MenuView {
    
    HelpMenuView() {
        super("\n" +
                "**********************************\n" +
                "* CITY OF AARON: HELP MENU *\n" +
                "**********************************\n" +
                " 1 - What are the goals of the game?\n" +
                " 2 - Where is the city of Aaron?\n" +
                " 3 - How do I view the map?\n" +
                " 4 - How do I move to another location?\n" +
                " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
                " 6 - Back to the Main Menu?\n",
            6);
    }
    
    @Override public void doAction(int option) {
            switch (option) {
                case 1: // if the option is 1, call startNewGame( )
                    viewGoals();
                    break;
                case 2: // if the option is 2, call startExistingGame( )
                    viewWhere();
                    break;
                case 3: // if the option is 3, call displayHelpMenu( )
                    viewHowMap();
                    break;
                case 4: // if the option is 4, call displaySaveGame( )
                    viewHowMove();
                    break;
                case 5: // if the option is 4, call displaySaveGame( )
                    viewHowList();
                    break;
                case 6:
                    MainMenuView mmv = new MainMenuView();
                    mmv.displayMenu();
                
            }
        }
    
    public void viewGoals() {
        System.out.println("viewGoals");
    }
    
    public void viewWhere() {
        System.out.println("viewWhere");
    }
    
    public void viewHowMap() {
        System.out.println("viewHowMap");
    }
    
    public void viewHowMove() {
        System.out.println("viewHowMove");
    }
    
    public void viewHowList() {
        System.out.println("viewHowList");
    }
    
    
}
