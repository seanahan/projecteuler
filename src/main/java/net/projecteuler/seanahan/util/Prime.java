package net.projecteuler.seanahan.util;

import java.util.*;
import java.math.BigInteger;

/**
 * Iterate over the primes, starting at 2.
 */
public class Prime implements Iterator<BigInteger> {

  List<BigInteger> primes = new ArrayList<BigInteger>(); 

  public boolean hasNext() {
    return true;
  }

  public BigInteger next() {
    if(primes.isEmpty()) {
      primes.add(new BigInteger("2"));
      return primes.get(0);
    }
    BigInteger highest = primes.get(primes.size() - 1);
    // for unknown reasons, adding one is faster than next probable prime
    BigInteger next = highest.add(BigInteger.ONE);
    // BigInteger next = highest.nextProbablePrime();
    while(true) {
      if(isPrime(next)) {
        primes.add(next);
        return next;
      }
      // next = next.nextProbablePrime();
      next = next.add(BigInteger.ONE);
    }
  }

  public boolean shortCircuit(BigInteger p, BigInteger b) {
    return false;
  }

  /**
   *  Takes 3m26 to 78,499 primes, the last is 1,000,003.
   */
  public boolean isPrime(BigInteger b) {
    for(int i = 0; i < primes.size(); i++) {
      BigInteger p = primes.get(i);
      if(shortCircuit(p, b)) {
        break;
      }
      if(b.mod(p) == BigInteger.ZERO) {
        return false;
      }
    }
    return true;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }

  public static void main(String[] args) {
    run(new Prime());
  }

  public static void run(Prime prime) {
    long begin = (new Date()).getTime();
    BigInteger p = BigInteger.ZERO;
    BigInteger stopper = new BigInteger("1000000");
    int counter = 0;
    // while((new Date()).getTime() - begin < 1000 * 60) {
    while(p.subtract(stopper).signum() < 0) {
      counter++;
      p = prime.next();
      if(counter % 100 == 0) {
        System.err.print("\r" + counter + "\t" + p);
      }
    }
    System.out.println("generated N primes " + counter + " last: " + p);
  }

}

