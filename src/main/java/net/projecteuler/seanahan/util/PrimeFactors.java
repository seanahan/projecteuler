package net.projecteuler.seanahan.util;

import java.util.*;
import java.math.BigInteger;

public class PrimeFactors {

  public static Set<BigInteger> getPrimeFactors(BigInteger bi) {
    Set<BigInteger> factors = new HashSet<BigInteger>();
    Prime prime = new FasterPrime();
    while(true) {
      BigInteger current = prime.next();
      if(current.multiply(current).subtract(bi).signum() > 0) {
        break;
      }
      if(bi.mod(current) == BigInteger.ZERO) {
        factors.add(current);
      }
    }
    return factors;
  }

  public static void main(String[] args) {
    for(int i = 0; i < args.length; i++) {
      System.out.println(getPrimeFactors(new BigInteger(args[i])));
    }
  }

}
