package net.projecteuler.seanahan;

import java.util.*;
import java.math.BigInteger;

/**
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 21000?
 */
public class Problem16 {

  public static int sumDigits(BigInteger bi) {
    String str = bi.toString(10);
    int sum = 0;
    for(int i = 0; i < str.length(); i++) {
      sum += str.charAt(i) - '0';
    }
    return sum;
  }

  public static void main(String[] args) {
    Integer exp = Integer.valueOf(args[0]);
    BigInteger bi = new BigInteger("2");
    bi = bi.pow(exp);
    System.out.println(sumDigits(bi));
  }


}

