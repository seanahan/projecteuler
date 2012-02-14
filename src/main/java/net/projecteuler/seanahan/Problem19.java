package net.projecteuler.seanahan;

import java.util.*;

/**
 * You are given the following information, but you may prefer to do some research for yourself.
 *  1 Jan 1900 was a Monday.
 *  Thirty days has September,
 *  April, June and November.
 *  All the rest have thirty-one,
 *  Saving February alone,
 *  Which has twenty-eight, rain or shine.
 *  And on leap years, twenty-nine.
 *  A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 *  How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class Problem19 {

  public static void main(String[] args) {
    Calendar cal = new GregorianCalendar(1901,1,1);
    int counter = 0;
    while(cal.get(Calendar.YEAR) < 2001) {
      //System.err.print("\r" + cal.get(Calendar.YEAR) + "\t" +
      //                 cal.get(Calendar.MONTH) + "\t" +
      //                 cal.get(Calendar.DAY_OF_MONTH));
      if(cal.get(Calendar.DAY_OF_MONTH) == 1 &&
         cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
      {
        counter++;
      }
      cal.add(Calendar.DATE, 1);
    }
    // System.err.println();
    System.out.println(counter);
  }

}

