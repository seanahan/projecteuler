package net.projecteuler.seanahan;

import java.util.*;

import net.projecteuler.seanahan.util.Summer;

public class Problem1 extends Summer {

  @Override public int map(int i) {
    return i;
  }

  @Override public boolean qualifies(int i) {
    return (i % 3 == 0 || i % 5 == 0);
  }

  @Override public boolean isValid(int i) {
    return i < 1000;
  }

  public static void main(String[] args) {
    int total = new Problem1().sum(0);
    System.out.println(total);
  }


}
