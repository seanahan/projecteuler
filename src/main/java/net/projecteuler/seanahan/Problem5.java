package net.projecteuler.seanahan;

import java.util.*;

public class Problem5 {

  public static int smallestEvenDivisor(Integer max) {
    int x = max;
    outer:
    while(true) {
      x++;
      // could filter out those that are divisors of others
      for(int i = 1; i < max; i++) {
        if(x%i != 0) {
          continue outer;
        }
      }
      return x;
    }
  }

  public static void main(String[] args) {
    Integer max = Integer.valueOf(args[0]);
    int x = smallestEvenDivisor(max);
    System.out.println(x);
  }

}
