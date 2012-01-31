package net.projecteuler.seanahan.util;

import java.util.*;

public abstract class Summer {

  public int sum(int start) {
    int total = 0;
    for(int i = start; isValid(i); i++) {
      if(qualifies(i)) {
        total += map(i);
      }
    }
    return total;
  }

  public abstract boolean qualifies(int i);
  public abstract int map(int i);
  public abstract boolean isValid(int i);

}
