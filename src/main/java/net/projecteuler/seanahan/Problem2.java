package net.projecteuler.seanahan;

import java.util.*;

import net.projecteuler.seanahan.util.Summer;
import net.projecteuler.seanahan.util.Fibonacci;

public class Problem2 extends Summer {

  private final int max;

  public Problem2(int max) {
    this.max = max;
  }

  public boolean isValid(int i) {
    return Fibonacci.get(i) < max;
  }

  public int map(int i) {
    return Fibonacci.get(i);
  }

  public boolean qualifies(int i) {
    return Fibonacci.get(i) % 2 == 0;
  }

  public static void main(String[] args) {
    // int param = Integer.valueOf(args[0]);
    int param = 4000001;
    int result = new Problem2(param).sum(2);
    System.out.println(result);
  }

} 
