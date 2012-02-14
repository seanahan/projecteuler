package net.projecteuler.seanahan;

import java.util.*;
import java.io.*;

/**
 * @see Problem18
 */
public class Problem67 {

  public static void main(String[] args) throws IOException {
    File f = new File(args[0]);
    List<List<Integer>> triangle = Problem18.loadTriangle(f);
    int solution = Problem18.solveTriangle(triangle);
    System.out.println(solution);
  }




}

