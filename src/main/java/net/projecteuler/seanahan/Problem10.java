package net.projecteuler.seanahan;

import java.util.*;

import net.projecteuler.seanahan.util.Prime;
import net.projecteuler.seanahan.util.FasterPrime;
import java.math.BigInteger;

public class Problem10 {

  public static void main(String[] args) {
    BigInteger stop = new BigInteger("2000000");
    Prime prime = new FasterPrime();
    // init both
    BigInteger currentPrime = prime.next();
    BigInteger sum = currentPrime;
    while(prime.hasNext()) {
      currentPrime = prime.next();
      if(stop.subtract(currentPrime).signum() < 0) {
        break;
      }
      sum = sum.add(currentPrime);
    }
    System.out.println(sum);
  }

}

