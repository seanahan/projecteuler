package net.projecteuler.seanahan;

import java.util.*;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * 
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * c = sqrt(a^2 + b^2)
 */
public class Problem9 {

  public static void main(String[] args) {
    for(double a = 2.0; a < 500.0; a++) {
      for(double b = a+1; b < 500.0; b++) {
        double csquared = a*a + b*b;
        double c = Math.sqrt(csquared);
        double rounded = Math.rint(c);
        // make sure c is an integer
        if(c == rounded) {
          if(a + b + c == 1000.0) {
            double prod = a*b*c;
            System.out.println(a + "\t" + b + "\t" + c + "\t" + prod);
          }
        }
      }
    }
  }


}

