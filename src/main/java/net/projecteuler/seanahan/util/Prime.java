package net.projecteuler.seanahan.util;

import java.util.*;

/**
 * Iterate over the primes, starting at 2.
 *
 */
public class Prime implements Iterator<Integer> {

  public boolean hasNext() {
    return true;
  }

  public Integer next() {
    return 2;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }

}
