/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import model.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author awesome
 */
public class GameControl {
    Scanner keyboard = new Scanner(System.in);
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
    createTeamList();
    
    
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
        String court = "The seat of your power, here is where you graciously and wisely rule over your people.";
        // set a court location with a hint
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // define the string for the Ruler's Court location
            loc.setDescription(court);
            loc.setSymbol("$$$");
            theMap.setLocation(i, 2, loc);
        }
        
        // define the string for the City's Granary location
        String granary = "A tall silo where all of your wheat is stored";
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a granary location with a hint
            loc.setDescription(granary + "\nIt takes 20 bushels to feed one person");
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
        String undeveloped = "There are sweeping acres of prime undeveloped land";
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a undeveloped location with a hint
            loc.setDescription(undeveloped + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("???");
            theMap.setLocation(i, 5, loc);
        }
        
        // define the string for the Desert location
        String desert = "A burning hot desert seperates us from our foes, the Lamanites";
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a desert location with a hint
            loc.setDescription(desert);
            loc.setSymbol("===");
            theMap.setLocation(i, 1, loc);
        }
        
        // define the string for the Village location
        String village = "Your people live here happily tending the land";
        
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a village location with a hint
            loc.setDescription(village + "\nIt takes 20 bushels to feed one person");
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
        String lamaniteBorder = "Those crazy Lamanites are partying all day and night. It's annoying, get a job!";
        for(int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location loc = new Location();
            // set a lamaniteBorder location with a hint
            loc.setDescription(lamaniteBorder + "\nDo not feed the wild Lamanites, they bite");
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
        for (ListItem animal : theGame.getAnimals()) {
            System.out.println(animal.getName() + ": " + animal.getNumber());
        }   
    }
    
    public void saveAnimalList(String filePath) {
        try (PrintWriter out = new PrintWriter(filePath)) {
                out.println("\n\n Animal List Report");
                out.printf("%n%-20s%10s", "Animal Type", "Quantity");
                out.printf("%n%-20s%10s", "___________", "________");
                
            // Print animal type and quantity    
            for (ListItem animal : theGame.getAnimals()) {
                out.printf("%n%-20s%7d",animal.getName(), animal.getNumber());
        }
            }
            catch(Exception e) {
                System.out.println("There was an error saving the list\n");
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
        for (ListItem tool: theGame.getTools()) {
            System.out.println(tool.getName() + ": " + tool.getNumber());
        }  
    }
    
    public void saveToolList(String filePath) {
        try (PrintWriter out = new PrintWriter(filePath)) {
                out.println("\n\n Tool List Report");
                out.printf("%n%-20s%10s", "Tool Type", "Quantity");
                out.printf("%n%-20s%10s", "___________", "________");
                
            // Print animal type and quantity    
            for (ListItem tool: theGame.getTools()) {
                out.printf("%n%-20s%7d",tool.getName(), tool.getNumber());
        }
            }
            catch(Exception e) {
                System.out.println("There was an error saving the list\n");
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
        for (ListItem provision : theGame.getProvisions()) {
            if (provision.getName() == "wheat") {
                System.out.println(provision.getName() + ": " + provision.getNumber() + " bushels");
            } else {
                System.out.println(provision.getName() + ": " + provision.getNumber() + " lbs");
            }   
        }  
    }

    public static void createTeamList() {
        ArrayList<ListItem> team = new ArrayList<ListItem>();
        team.add(new ListItem("Carly, the dolphin trainer", 1));
        team.add(new ListItem("Aaron, obviously the ruler of the city", 1));
        
        theGame.setTeam(team);
    }
    
    public void displayTeamList() {
        for (ListItem team: theGame.getTeam()) {
            System.out.println(team.getName());
        }  
    }
    
    /**
    * the getSavedGame method
    * Purpose: load a saved game from disk
    * Parameters: the file path
    * Returns: none
    * Side Effect: the game reference in the driver is updated
    */
    public static void getSavedGame(String filePath) {
        // Game theGame = null;
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            theGame = (Game) input.readObject();
            CityOfAaron.setTheGame(theGame);
        }
        catch(Exception e) {
            System.out.println("There was an error reading the saved game file\n");
        }
    }
    
    /**
    * the getSavedGame method
    * Purpose: load a saved game from disk
    * Parameters: the file path
    * Returns: none
    * Side Effect: the game reference in the driver is updated
    */
    public static void setSavedGame(String filePath) {
        // Game theGame = null;
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(theGame);
        }
        catch(Exception e) {
            System.out.println("There was an error saving the game file\n");
            e.printStackTrace();
        }
    }
    
}
