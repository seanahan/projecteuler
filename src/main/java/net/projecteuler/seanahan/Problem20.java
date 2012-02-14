package net.projecteuler.seanahan;

import java.util.*;
import java.math.BigInteger;

/**
 *  Find the sum of the digits in 100!.
 */
public class Problem20 {

  public static void main(String[] args) {
    BigInteger b = new BigInteger("1");
    for(Integer i = 2; i <=100; i++) {
      b = b.multiply(new BigInteger(i.toString()));
    }
    System.out.println(Problem16.sumDigits(b));
  }

}

