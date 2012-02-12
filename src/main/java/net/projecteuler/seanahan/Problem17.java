package net.projecteuler.seanahan;

import java.util.*;

public class Problem17 {

  public static Map<Integer, String> words = new HashMap<Integer, String>();
  static {
    words.put(1, "one");
    words.put(2, "two");
    words.put(3, "three" );
    words.put(4, "four" );
    words.put(5, "five" );
    words.put(6, "six" );
    words.put(7, "seven" );
    words.put(8, "eight" );
    words.put(9, "nine" );
    words.put(10, "ten" );
    words.put(11, "eleven" );
    words.put(12, "twelve" );
    words.put(13, "thirteen" );
    words.put(14, "fourteen" );
    words.put(15, "fifteen" );
    words.put(16, "sixteen" );
    words.put(17, "seventeen" );
    words.put(18, "eighteen" );
    words.put(19, "nineteen" );
    words.put(20,"twenty");
    words.put(30,"thirty");
    words.put(40,"forty");
    words.put(50,"fifty");
    words.put(60,"sixty");
    words.put(70,"seventy");
    words.put(80,"eighty");
    words.put(90,"ninety");
    words.put(100, "hundred" );
  }

  public static void main(String[] args) {i % 100
    int total = 0;
    String onethousand = "onethousand";
    String and = "and";
    for(int c = 1; c < 1000; c++) {
      int i = c;
      // System.out.println(i + "\t" + total);
      int mod100 = i % 100;
      if(i >= 100 && mod100 != 0) {
        total += and.length(); // for and
      }
      if(mod100 < 20 && mod100 >= 10) {
        total += words.get(mod100).length();
        i = i - mod100;
      }
      int mod10 = i%10;
      if(mod10 != 0) {
        // the ones place
        total += words.get(mod10).length();
        i = i - (mod10); 
      }
      mod100 = i % 100;
      if(mod100 != 0) {
        // the tens place
        total += words.get(mod100).length();
        i = i - (mod100);
      }
      if(i > 0) {
        // the hundreds place
        i = i / 100;
        total += words.get(i).length();
        total += words.get(100).length();
      }
    }
    total += onethousand.length();
    System.out.println(total);
  }

}

