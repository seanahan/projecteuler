package net.projecteuler.seanahan;

import java.util.*;

/**
 *  The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem14 {

  private static final Map<Long, Integer> steps = new HashMap<Long, Integer>();

  public static void main(String[] args) {
    steps.put(1L, 1);
    compute();
    Map.Entry<Long, Integer> max = null;
    for(Map.Entry<Long, Integer> entry : steps.entrySet()) {
      if(max == null || entry.getValue() > max.getValue()) {
        max = entry;
      }
    }
    System.out.println(max);
  }

  public static void compute() {
    for(long i = 2L; i < 1000000L; i++) {
      LinkedList<Long> retry = new LinkedList<Long>();
      retry.add(i);
      while(retry.size() > 0) {
        if(retry.size() > 600) {
          throw new IllegalArgumentException(retry.toString());
        }
        long cur = retry.pop();
        // System.err.print("\r" + i + "\t" + retry.size() + "\t" + steps.size());
        long next = get(cur);
        if(steps.containsKey(next)) {
          steps.put(cur, steps.get(next) + 1);
        }
        else {
          retry.addFirst(cur);
          retry.addFirst(next);
        }
      }
    }
  }

  public static long get(long i) {
    if(i % 2 == 0) {
      return i/2;
    }
    return 3*i + 1;
  }

}
