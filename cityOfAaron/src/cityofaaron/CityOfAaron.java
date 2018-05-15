/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 * Team members: Aaron Sawyer, Carly Kjelstrom
 */
package cityofaaron;

import model.Player;
import model.TeamMember;
import model.Location;
import model.ListItem;
import model.CropData;

/**
 *
 * @author awesome
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        
        playerOne.setName("Carly");
        
        System.out.println("Name = " + playerOne.getName());
        
        System.out.println("Name: " +TeamMember.Sister.getName() + "\nTitle: " + TeamMember.Sister.getTitle());
    
        Location locationOne = new Location();
        
        locationOne.setSymbol("Star");
        
        System.out.println("Symbol = " + locationOne.getSymbol());
        
        ListItem listItemOne = new ListItem();
        
        listItemOne.setName("Aaron");
        
        System.out.println("Name = " + listItemOne.getName());
        
        CropData cropDataOne = new CropData();
        
        cropDataOne.setAcresOwned(10000);
        System.out.println("You own " + cropDataOne.getAcresOwned() + " acres!");
    }
    
}
