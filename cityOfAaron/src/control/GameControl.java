/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import model.*;
/**
 *
 * @author awesome
 */
public class GameControl {
    // size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 8;
    // reference to a Game object
    private static Game theGame;
    
    public static void createNewGame(String name) {
    // Created the game object. Save it in the main driver file
    theGame = new Game();
    CityOfAaron.setTheGame(theGame);
    // create the player object. Save it in the game object
    Player thePlayer = new Player();
    thePlayer.setName(name);
    theGame.setThePlayer(thePlayer);
    createCropDataObject();
    createMap();
    createAnimalList();
    createToolList();
    createProvisionList();
    
    
    // create the list of animals
    // create the list of tools
    //create the list of provisions
    // create the Locations and the Map object
    }
    
    // create the CropData object
    public static void createCropDataObject(){
        CropData theCrops = new CropData();
        theCrops.setYear(0);
        theCrops.setPopulation(100);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumberWhoDied(0);
        theCrops.setOffering(10);
        theCrops.setWheatInStore(2700);
        theCrops.setAcresOwned(1000);
        theCrops.setAcresPlanted(1000);
        theCrops.setHarvest(3000);
        theCrops.setOfferingBushels(300);
        theCrops.setAcresPlanted(1000);
        // Save the cropData in the Game object
        
        theGame.setCropData(theCrops);
    }
    
    /**
    * The createMap method
    * Purpose: creates the location objects and the map
    * Parameters: none
    * Returns: none
    */
    public static void createMap() {
        // create the Map object,
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
        
        
        
        
        
        // define the string for the Ruler's Court location
        String court = "";
        // set a court location with a hint
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // define the string for the Ruler's Court location
            loc.setDescription(court + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("$$$");
            theMap.setLocation(i, 2, loc);
        }
        
        // define the string for the City's Granary location
        String granary = "";
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a granary location with a hint
            loc.setDescription(granary + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("###");
            theMap.setLocation(i, 3, loc);
        }
        
        // define the string for a farm land location
        String farmland = "You are on the fertile banks of the River.\n" +
        "In the spring, this low farmland floods and is covered with rich\n" +
        "new soil. Wheat is planted as far as you can see.";
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a farmland location with a hint
            loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("!!!");
            theMap.setLocation(i, 6, loc);
        }
        
        // define the string for the Undeveloped Land location
        String undeveloped = "";
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a undeveloped location with a hint
            loc.setDescription(undeveloped + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("???");
            theMap.setLocation(i, 5, loc);
        }
        
        // define the string for the Desert location
        String desert = "";
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a desert location with a hint
            loc.setDescription(desert + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("===");
            theMap.setLocation(i, 1, loc);
        }
        
        // define the string for the Village location
        String village = "";
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a village location with a hint
            loc.setDescription(village + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("^^^");
            theMap.setLocation(i, 4, loc);
        }
        
        // create a string that will go in the Location objects
        // that contain the river
        String river = "You are on the River. The river is the source\n" +
        "of life for our city. The river marks the eastern\n " +
        "boundary of the city - it is wilderness to the East.\n";
        
        // set this location object in each cell of the array in column 4
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // use setters in the Location class to set the description and symbol
            loc.setDescription(river);
            loc.setSymbol("~~~");
            theMap.setLocation(i, 7, loc);
        }
        
        // define the string for the Lamanite border location
        String lamaniteBorder = "";
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a lamaniteBorder location with a hint
            loc.setDescription(lamaniteBorder + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("|||");
            theMap.setLocation(i, 0, loc);
        }
        //Game theGame = CityOfAaron.getTheGame();
        theGame.setMap(theMap);
    }
    
    public void displayMap() {
//        Game game = CityOfAaron.getTheGame();
        Map theMap = theGame.getMap();
        // System.out.println("Hi, I am the Map");
        // System.out.println(theMap.getLocation(0, 2).getSymbol());
        //array = [
        // [1,2,3,4,5,6,7,8],
        // [1,2,3,4,5,6,7,8],
        // [1,2,3,4,5,6,7,8],
        // [1,2,3,4,5,6,7,8],
        // [1,2,3,4,5,6,7,8],
        // ];
        
//        String[][] symbolLocations = {
//            {"|||", "===", "$$$", "###", "^^^", "???", "!!!", "~~~"},
//            {"|||", "===", "$$$", "###", "^^^", "???", "!!!", "~~~"},
//            {"|||", "===", "$$$", "###", "^^^", "???", "!!!", "~~~"},
//            {"|||", "===", "$$$", "###", "^^^", "???", "!!!", "~~~"},
//            {"|||", "===", "$$$", "###", "^^^", "???", "!!!", "~~~"}
//        };
            
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.print(theMap.getLocation(i, j).getSymbol() + " ");
            }
            System.out.println();
        }   
    }
    
    public static void createAnimalList() {
        ArrayList<ListItem> animals = new ArrayList<ListItem>();
        animals.add(new ListItem("dolphins", 30));
        animals.add(new ListItem("alicorn", 5));
        animals.add(new ListItem("cows", 12));
        animals.add(new ListItem("horses", 3));
        animals.add(new ListItem("pigs", 7));
        animals.add(new ListItem("goats", 4));
        // Save the animals in the game
//        Game theGame = CityOfAaron.getTheGame();
        theGame.setAnimals(animals);
    }
    
    public void displayAnimalList() {
        for (int i = 0; i < theGame.getAnimals().size(); i++) {
            System.out.println(theGame.getAnimals().get(i).getName() + ": " +theGame.getAnimals().get(i).getNumber());
        }  
    }
    
    public static void createToolList() {
        ArrayList<ListItem> tools = new ArrayList<ListItem>();
        tools.add(new ListItem("hoes", 500));
        tools.add(new ListItem("rakes", 200));
        tools.add(new ListItem("pitchforks", 150));
        tools.add(new ListItem("scythe", 50));
        tools.add(new ListItem("sickle", 100));
        tools.add(new ListItem("subsoil plow", 75));
        
        theGame.setTools(tools);
    }
    
    public void displayToolList() {
        for (int i = 0; i < theGame.getTools().size(); i++) {
            System.out.println(theGame.getTools().get(i).getName() + ": " +theGame.getTools().get(i).getNumber());
        }  
    }
    
    public static void createProvisionList() {
        ArrayList<ListItem> provisions = new ArrayList<ListItem>();
        provisions.add(new ListItem("dried beef", 75));
        provisions.add(new ListItem("salted pork", 100));
        provisions.add(new ListItem("wheat", theGame.getCropData().getWheatInStore()));
        provisions.add(new ListItem("butter", 40));
        provisions.add(new ListItem("cheese", 30));
        provisions.add(new ListItem("bacon", 50));
        
        theGame.setProvisions(provisions);
    }
    
    public void displayProvisionList() {
        for (int i = 0; i < theGame.getProvisions().size(); i++) {
            if (theGame.getProvisions().get(i).getName() == "wheat") {
                System.out.println(theGame.getProvisions().get(i).getName() + ": " +theGame.getProvisions().get(i).getNumber() + " bushels");
            } else {
                System.out.println(theGame.getProvisions().get(i).getName() + ": " +theGame.getProvisions().get(i).getNumber() + " lbs");
            }   
        }  
    }

    
}
