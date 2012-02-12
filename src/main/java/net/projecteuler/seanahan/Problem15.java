package net.projecteuler.seanahan;

import java.util.*;

/**
 * Starting in the top left corner of a 2×2 grid, there are 6 routes (without backtracking) to the bottom right corner.
 * How many routes are there through a 20×20 grid?
 * 
 * This is a classic dynamic programming question.
 * Note, for a 2x2 grid, you start at 0,0 and end at 2,2.
 */
public class Problem15 {

  public static void main(String[] args) {
    Integer x = 1;
    Integer y = 1;
    if(args.length == 1) {
      x = Integer.valueOf(args[0])+1;
      y = x;
    }
    else if(args.length == 2) {
      x = Integer.valueOf(args[0])+1;
      y = Integer.valueOf(args[1])+1;
    }
    long[][] grid = new long[x][];
    // initialize the grid
    for(int i = 0; i < grid.length; i++) {
      grid[i] = new long[y];
      for(int j = 0; j < y; j++) {
        grid[i][j] = 0L;
      }
    }
    // set this base case to 1
    grid[x-1][y-1] = 1;
    for(int i = x - 1; i >= 0; i--) {
      for(int j = y - 1; j >= 0; j--) {
        if(i < x-1) {
          grid[i][j] += grid[i+1][j];
        }
        if(j < y-1) {
          grid[i][j] += grid[i][j+1];
        }
      }
    }
    // print the grid (debug)
    // for(int i = 0; i < x; i++) {
    //   for(int j = 0; j < y; j++) {
    //     System.out.print(grid[i][j] + "\t");
    //   }
    //   System.out.println();
    // }
    System.out.println(grid[0][0]);
  }

}
