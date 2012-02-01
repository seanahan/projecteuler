package net.projecteuler.seanahan;

import java.util.*;

import net.projecteuler.seanahan.util.Prime;
import java.math.BigInteger;

public class Problem3 {

  public static void main(String[] args) {
    BigInteger number = new BigInteger("600851475143");
    Prime prime = new Prime();
    while(true) {
      BigInteger p = prime.next();
      if(number.mod(p) == BigInteger.ZERO) {
        number = number.divide(p);
        System.out.println("dividor: " + p + " new " + number);
        if(number.equals(BigInteger.ONE)) {
          System.out.println(p);
          break;
        }
      }
    }
  }

}

