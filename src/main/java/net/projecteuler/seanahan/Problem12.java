package net.projecteuler.seanahan;

import java.util.*;

/**
 *
 */
public class Problem12 {

  public static void main(String[] args) {
    int max = 0;
    int counter = 1;
    int triangle = 1;
    while(true) {
      counter++;
      triangle = triangle+counter;
      Double sqrt = Math.sqrt(triangle);
      int sqrti = sqrt.intValue();
      int numDivisors = 0;
      for(int i = 1; i <= sqrti; i++) {
        if(triangle % i == 0) {
          numDivisors++;
          if(i != sqrti) {
            // divisors are symmetrical
            // 28 = 1*28 = 2*14 = 4*7
            // except when the number is a perfect square
            numDivisors++;
          }
        }
      }
      if(numDivisors > max) {
        max = numDivisors;
      }
      // print the current counter and max
      if(counter % 1000 == 0) {
        System.err.print("\r" + counter + " " + triangle + " " + max);
      }
      if(numDivisors > 500) {
        System.out.println("\n" + triangle);
        break;
      }
    }
  }

}
