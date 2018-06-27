/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author carlykjelstrom
 */
public class Map {
    private int rowCount;               // stores the number of rows
    private int colCount;               // stores the number of columns
    private Location[] [] locations;    // a reference to a 2-dimensional array of Location objects
    
    public Map(int _rows, int _cols) {
    // Params int _rows, int _cols
     this.rowCount = _rows;
     this.colCount = _cols;
     
     // create the array of location objects
     this.locations = new Location[_rows][_cols];
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }
    
    public Location getLocation(int row, int col) {
        return this.locations[row][col];
    }
    
    /**
    * The setLocation method
    * Purpose: stores a location object at the row and column
    * Parameters: a row and column, and a reference to a location object
    * Returns: void
    */
    public void setLocation(int row, int col, Location _location) {
        this.locations[row][col]= _location;
    }
    
    public void displayMap() {
        //array = [
        // [1,2,3,4,5,6,7,8],
        // [1,2,3,4,5,6,7,8],
        // [1,2,3,4,5,6,7,8],
        // [1,2,3,4,5,6,7,8],
        // [1,2,3,4,5,6,7,8],
        // ];
        
        System.out.println(getLocation(0, 7));
//        for(int i = 0; i < locations.length; i++) {
//            for(int j = 0; j < locations[i].length; j++) {
//                System.out.println(locations[i][j]);
//            }
//        }   
    } 
}
