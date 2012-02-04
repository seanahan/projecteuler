package net.projecteuler.seanahan;

import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * What is the greatest product of four adjacent numbers in any direction (up, down, left, right, or diagonally) in the 20×20 grid?
 */
public class Problem11 {

  /**
   *  For each cell compute the different products.
   */
  public static void process(List<List<Integer>> grid) {
    int max = 0;
    for(int i = 0; i < grid.size(); i++) {
      for(int j = 0; j < grid.size(); j++) {
        int cellMax = cellMax(i, j, grid);
        if(cellMax > max) {
          max = cellMax;
        }
      }
    }
    System.out.println(max);
  }

  /**
   *  Not really the optimal implemention here.
   */
  public static int cellMax(int i, int j, List<List<Integer>> grid) {
    int max = 0;
    // horizontal
    if(j < grid.size() - 3) {
      int prod = grid.get(i).get(j) *
                 grid.get(i).get(j+1) *
                 grid.get(i).get(j+2) *
                 grid.get(i).get(j+3);
      if(prod > max) {
        max = prod;
      }
    }
    // vertical
    if(i < grid.size() - 3) {
      int prod = grid.get(i).get(j) *
                 grid.get(i+1).get(j) *
                 grid.get(i+2).get(j) *
                 grid.get(i+3).get(j);
      if(prod > max) {
        max = prod;
      }
    }
    // down-right diagonal
    if(i < grid.size() - 3 && j < grid.size() - 3) {
      int prod = grid.get(i).get(j) *
                 grid.get(i+1).get(j+1) *
                 grid.get(i+2).get(j+2) *
                 grid.get(i+3).get(j+3);
      if(prod > max) {
        max = prod;
      }
    }
    // down-left diagonal
    if(i < grid.size() - 3 && j > 2) {
      int prod = grid.get(i).get(j) *
                 grid.get(i+1).get(j-1) *
                 grid.get(i+2).get(j-2) *
                 grid.get(i+3).get(j-3);
      if(prod > max) {
        max = prod;
      }
    }
    return max;
  }

  public static void main(String[] args) throws IOException {
    File f = new File(args[0]);
    BufferedReader br = new BufferedReader(new FileReader(f));
    String line;
    List<List<Integer>> grid = new ArrayList<List<Integer>>();
    while( (line = br.readLine()) != null) {
      String[] split = line.split(" ");
      List<Integer> ints = new ArrayList<Integer>();
      for(int i = 0; i < split.length; i++) {
        ints.add(Integer.valueOf(split[i]));
      }
      grid.add(ints);
    }
    process(grid);
  }

}
