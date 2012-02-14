package net.projecteuler.seanahan;

import java.util.*;

/**
 * Let us define a geometric triangle as an integer sided triangle with sides a ≤ b ≤ c so that its sides form a geometric progression, i.e. b^2 = a · c . 
 * An example of such a geometric triangle is the triangle with sides a = 144, b = 156 and c = 169.
 * There are 861805 geometric triangles with perimeter ≤ 10^6 .
 * How many geometric triangles exist with perimeter ≤ 2.5·1013 ?
 */
public class Problem370 {

  public static void main(String[] args) {
    long max = 1000000;
    if(args.length >= 2) {
      max = Long.valueOf(args[1]);
    }
    if(args[0].equals("go")) {
      go(max);
    }
    else if(args[0].equals("naive")) {
      naive(max);
    }
    else {
      assert false;
    }
  }

  public static void naive(long max) {
    Integer counter = 0;
    double amax = max / 3 + 1;
    double bmax = max / 2 + 1;
    for(Double a = 1.0; a <= amax; a++) {
      for(Double b = a; b <= bmax; b++) {
        Double c = b.doubleValue() * b.doubleValue() / a.doubleValue();
        if(a + b < c) {
          break;
        }
        if(c.equals(Math.rint(c)) && a + b + c <= max) {
          System.out.print("\r" + counter + "\t" + a + "\t" + b + "\t" + c);
          counter++;
        }
      }
    }
    System.out.println(counter);
  }
  
  public static void go(long max) {
    long counter = 0;
    for(long a = 1; a < max / 3 + 1; a++) {
      long localCount = 0;
      long amax = (max - a) / 2; 
      amax = amax * amax + 1;
      long skipped = 0;
      for(Long b2 = a*a; b2 < amax; b2+=a) {
        Double b = Math.sqrt(b2.doubleValue());
        Double c = b2.doubleValue() / a;
        // System.out.println(a + "\t" + b + "\t" + c);
        if(a + b < c) {
          break;
        }
        if(a + b + c > max) {
          break;
        }
        if(c.equals(Math.rint(c)) && 
           b.equals(Math.rint(b)))
        {
          localCount++;
          // System.out.println(a + "\t" + b + "\t" + c);
          System.out.print("\r" + counter + "\t" + a + "\t" + b + "\t" + c);
          //System.out.println("yes");
          skipped = 0;
        }
        else {
          skipped++;
          //System.out.println("no");
        }
      }
      counter += localCount;
    }
    System.out.println(counter);
  }


}

