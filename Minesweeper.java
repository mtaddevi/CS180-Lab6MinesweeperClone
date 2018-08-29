

import java.util.Random;
 
public class Minesweeper {
 
    /*
     * Declare the four fields here. Make sure to prefix them with "public final".
     *
     */
    // INSERT CODE HERE
  public final int rows;
  public final int cols;
  public final int numMines;
  public final boolean[][] mineField;
    /*
     * The Class Constructor.
     * 
     * Here you should initialize the four fields you declared above. Do so by
     * using the three parameters passed in this method and by calling the 
     * generateMineField() method.
     *
     * @param int rows    Number of rows of the mineField
     * @param int cols    Number of columns of the mineField
     * @param int numMines Number of mines to be placed on the mineField
     * 
     */
    Minesweeper(int rows, int cols, int numMines) {
        // INSERT CODE HERE
      this.rows = rows;
      this.cols = cols;
      this.numMines = numMines;
      this.mineField = generateMineField();
    }
 
    /*
     * Generates the mineField.
     * 
     * - Create a new boolean two dimensional array with dimensions according the 
     *   rows and columns fields.
     * - Choose a random location in this array and set the value of that location 
     *   to true, indicating that that location holds a mine. Repeat the same thing 
     *   several times until you have placed enough mines (based on the numMines 
     *   field).
     * - Before setting a location to true you should check whether it is already
     *   set to true, to avoid placing a second mine in the same location.
     * - Don't forget to return your two dimensional boolean array at the end.
     *
     * @return boolean[][]         The mineField matrix
     */
    public boolean[][] generateMineField() {
        // INSERT CODE HERE
      boolean[][] theField  = new boolean[rows][cols];
      Random r = new Random();
      
      for(int g = 0; g <numMines; g++){
       int v =  r.nextInt(rows);
       int w = r.nextInt(cols);
        if(theField[v][w]== true){
          g--;
        }
        if(theField[v][w] == false){
      theField[v][w] = true;
        }
        
      }
      
      
 
        return theField; // CHANGE THIS TO RETURN YOUR OWN ARRAY.
    }
 
    /*
     * Counts the number of adjacent mines to a given cell position.
     *
     * - The parameters r and c indicate the location of mineField we care about.
     * - Examine all the adjacent cells surrounding this location and count how
     *   many of those cells correspond to a mine (i.e the value of mineFiled is 
     *   set to true).
     * - Keep in mind that the cells on the edges of mineField (e.g when r=0)have 
     *   less than eight cells surrounding them. 
     * - Don't forget to return the count at the end.
     *
     * @param int r row position
     * @param int c column position
     * @return int number of mines in the surrounding cells
     */
    public int countMines(int r, int c) {
        int count = 0;
        r = rows;
        c = cols;
     
        // INSERT CODE HERE
        for(int j = 0; j < r; j++){
          for(int k = 0; k < c; k++){
            if(theField[r][c] == true){
              count++;
            }
          if(r - 1 >= 0){
            count++;
          }
          if(r+1 >= 0){
            count++;
          }
          if( r >= 0){
            count++;
          }
          if(c - 1 >= 0){
            count++;
          }
          if(c+1 >= 0){
            count++;
          }
          if( c >= 0){
            count++;
          }
          else
            continue;
        }
        
        }
 
        return count;
    }
 
    /*
     * Generates the game clues.
     * 
     * - Create a new int two dimensional array with dimensions according to the 
     *   rows and columns fields.
     * - Fill all the locations of this array with numbers, according to the 
     *   value of the corresponding location in your mineField. If the value of 
     *   mineField on that location is true then set the value of your two    
     *   dimensional array on that location to -1. If the value of mineField on 
     *   that location is false then set the value of your two dimensional array 
     *   on that location by calling the countMines method.
     * - Don't forget to return your two dimensional int array at the end.
     * 
     * 
     * @return int[][]         The mineField with cell values computed
     */
    public int[][] generateClues() {     
        // INSERT CODE HERE
      int[][]newArray = new int[rows][cols];
 
 
        return null; // CHANGE THIS TO RETURN YOUR OWN ARRAY.
    }
 
    /* THIS IS AN OPTIONAL METHOD THAT CAN HELP YOU MAKE SURE YOUR PROGRAM
     * WORKS AS IT SHOULD BE
     *
     * Prints the game clues
     *
     * - Print "* " if a cell corresponds to a mine (i.e the value of clues is -1).
     *   Otherwise print the clue followed by a single space.
     * 
     * @param int[][] clues The clues for the game.
     */
    public static void printClues(int[][] clues) { 
        // INSERT CODE HERE
    }
 
}

