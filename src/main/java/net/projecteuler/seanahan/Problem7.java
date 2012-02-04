package net.projecteuler.seanahan;

import java.util.*;

import net.projecteuler.seanahan.util.Prime;
import java.math.BigInteger;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * Solution: Use the Prime iterator and count.  Made easy by Problem 3.
 */
public class Problem7 {

  public static void main(String[] args) {
    Prime prime = new Prime();
    BigInteger result = null;
    for(int i = 0; i < 10001; i++) {
      result = prime.next();
    }
    System.out.println(result);
  }
}


