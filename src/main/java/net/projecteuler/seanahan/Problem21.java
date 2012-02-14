package net.projecteuler.seanahan;

import java.util.*;
import java.math.BigInteger;
import net.projecteuler.seanahan.util.MathUtils;

/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * Evaluate the sum of all the amicable numbers under 10000.
 */
public class Problem21 {

  public static void main(String[] args) {
    Map<Integer, Integer> sums = new HashMap<Integer, Integer>();
    for(int i = 1; i < 10000; i++) {
      sums.put(i, MathUtils.sum(MathUtils.getFactors(i)));
    }
    int sum = 0;
    for(int i = 1; i < 10000; i++) {
      int s = sums.get(i);
      if(s >= 10000 || s == 0) {
        continue;
      }
      int t = sums.get(s);
      if(i < sums.get(i) && i == t) {
        sum += s;
        sum += sums.get(s);
      }
    }
    System.out.println(sum);
  }
  
}
