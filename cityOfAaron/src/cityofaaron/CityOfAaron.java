/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 * Team members: Aaron Sawyer, Carly Kjelstrom
 */
package cityofaaron;

import model.Player;

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
        String playerOneName = playerOne.getName();
        
        System.out.println("Name = " + playerOneName);
    }
    
}
