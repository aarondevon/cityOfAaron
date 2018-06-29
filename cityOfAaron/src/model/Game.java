/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author carlykjelstrom
 */
public class Game implements Serializable {
    private Player thePlayer;
    private CropData cropData = null;
    private Map theMap;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;
    private ArrayList<ListItem> provisions;
    private ArrayList<ListItem> team;

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }
    
    /**
     * the getCrops()method
     * Purpose: get a reference to the crop object
     * Parameters: none
     * Returns: a reference to a crop object
     */
    public CropData getCropData() {
        return cropData;
    }
    /**
     * the setCrops()method
     * Purpose: store a reference to a crop object
     * Parameters: a reference to a crop object
     * Returns: none
     */
    public void setCropData(CropData cropRef) {
        cropData = cropRef;
    }
    
    public Map getMap() {
        return this.theMap;
    }
    
    public void setMap(Map map) {
        this.theMap = map;
    }

    public ArrayList<ListItem> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }

    public ArrayList<ListItem> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }

    public ArrayList<ListItem> getProvisions() {
        return provisions;
    }

    public void setProvisions(ArrayList<ListItem> provisions) {
        this.provisions = provisions;
    }

    public ArrayList<ListItem> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<ListItem> team) {
        this.team = team;
    }
    
    
    
}
