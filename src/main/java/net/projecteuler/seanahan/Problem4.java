package net.projecteuler.seanahan;

import java.util.*;

import net.projecteuler.seanahan.util.Prime;
import java.math.BigInteger;

public class Problem4 {

  public static boolean isPalindrome(Integer i) {
    String s = i.toString();
    for(int j = 0; j < s.length() / 2; j++) {
      if(s.charAt(j) != s.charAt(s.length() - j - 1)) {
        return false;
      }
    }
    return true;
  }

  public static int largest(int bottom, int top) {
    int largest = 0;
    for(int i = bottom; i < top; i++) {
      for(int j = i; j < top; j++) {
        int prod = i * j;
        if(isPalindrome(prod)) {
          if(prod > largest) {
            largest = prod;
            System.out.print("\r" + i + " " + j);
          }
        }
      }
    }
    System.out.println(largest);
    return largest;
  }

  public static void main(String[] args) {
    for(int i = 0; i < args.length; i++) {
      System.out.println(args[i] + " " + isPalindrome(Integer.valueOf(args[i])));
    }
    largest(10, 100); // should be 9009
    largest(100, 1000); // should be 9009
  }

}

