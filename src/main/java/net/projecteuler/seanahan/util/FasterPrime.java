package net.projecteuler.seanahan.util;

import java.util.*;
import java.math.BigInteger;

/**
 *  Faster prime detection.
 *  Short-circuits when the sqrt of the current prime is greater than
 */
public class FasterPrime extends Prime {

  @Override
  public boolean shortCircuit(BigInteger p, BigInteger b) {
    BigInteger square = p.multiply(p);
    if(square.subtract(b).signum() > 0) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    run(new FasterPrime());
  }

}

