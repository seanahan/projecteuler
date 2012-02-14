package net.projecteuler.seanahan;

import java.util.*;
import java.io.*;

/**
 *  By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
 * 3
 * 7 4
 * 2 4 6
 * 8 5 9 3
 * That is, 3 + 7 + 4 + 9 = 23.
 * Find the maximum total from top to bottom of the triangle below:
 * 
 * NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot be solved by brute force, and requires a clever method! ;o)
 */
public class Problem18 {

  public static List<List<Integer>> loadTriangle(File f) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(f));
    String line = null;
    List<List<Integer>> triangle = new ArrayList<List<Integer>>();
    int counter = 1;
    while( (line = br.readLine()) != null) {
      String[] split = line.split(" ");
      assert(split.length == counter);
      counter++;
      List<Integer> row = new ArrayList<Integer>();
      for(String s : split) {
        row.add(Integer.valueOf(s));
      }
      triangle.add(row);
    }
    return triangle;
  }

  public static int solveTriangle(List<List<Integer>> triangle) {
    // initialize to the triangle
    List<List<Integer>> max = new ArrayList<List<Integer>>(triangle);
    // don't need to touch the bottom row
    for(int r = triangle.size() - 2; r >= 0; r--) {
      for(int c = 0; c < triangle.get(r).size(); c++) {
        int down = max.get(r+1).get(c);
        int downright = max.get(r+1).get(c+1);
        int most = Math.max(down, downright);
        max.get(r).set(c, triangle.get(r).get(c) + most);
      }
    }
    return max.get(0).get(0);
  }

  public static void main(String[] args) throws IOException {
    File f = new File(args[0]);
    List<List<Integer>> triangle = loadTriangle(f);
    int solution = solveTriangle(triangle);
    System.out.println(solution);
  }

}
