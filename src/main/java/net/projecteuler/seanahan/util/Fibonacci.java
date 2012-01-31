package net.projecteuler.seanahan.util;

import java.util.*;

/**
*  The 0th Fibonacci is 1.
*  The 1st Fibonacci is 1.
*  The 2nd Fibonacci is 2.
*  And so on.
*/
public class Fibonacci {

  private static List<Integer> cache;
 
  static {
    cache = new ArrayList<Integer>();
    cache.add(1);
    cache.add(1);
  }

  public static int get(int i) {
    if(cache.size() < i+1) {
      cache.add(cache.get(i-1) + cache.get(i-2));
    }
    return cache.get(i);
  }

}
