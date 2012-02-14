package net.projecteuler.seanahan.util;

import java.util.*;
import java.math.BigInteger;

public class MathUtils {

  public static int sum(Iterable<Integer> nums) {
    int x = 0;
    for(Integer i : nums) {
      x += i;
    }
    return x;
  }

  public static List<Integer> getFactors(int n) {
    List<Integer> result = new ArrayList<Integer>();
    for(int i = 1; i < (n+2)/2; i++) {
      if(n % i == 0) {
        result.add(i);
      }
    }
    return result;
  }
}

