package net.projecteuler.seanahan;

import java.util.*;

public class Problem6 {

  public static Integer squareSum(int x) {
    Integer val = x * (x+1) / 2;
    val = val * val;
    return val;
  }

  public static Integer sumSquares(int n) {
    return n * (n+1) * (2*n+1) / 6;
  }

  public static void main(String[] args) {
    Integer x = Integer.valueOf(args[0]);
    Integer a = squareSum(x);
    Integer b = sumSquares(x); 
    Integer result = a - b;
    System.out.println(a + "\t" + b + "\t" + result);
  }

}
