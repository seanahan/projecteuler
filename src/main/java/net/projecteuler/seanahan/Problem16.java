package net.projecteuler.seanahan;

import java.util.*;
import java.math.BigInteger;

public class Problem16 {

  public static void main(String[] args) {
    Integer exp = Integer.valueOf(args[0]);
    BigInteger bi = new BigInteger("2");
    bi = bi.pow(exp);
    String str = bi.toString(10);
    int sum = 0;
    for(int i = 0; i < str.length(); i++) {
      sum += str.charAt(i) - '0';
    }
    System.out.println(sum);
  }


}

