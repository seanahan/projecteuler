package net.projecteuler.seanahan;

import java.math.BigInteger;

import java.util.*;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *  Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 */
public class Problem13 {

  public static void main(String[] args) throws IOException {
    File f = new File(args[0]);
    BufferedReader br = new BufferedReader(new FileReader(f));
    String line;
    BigInteger total = BigInteger.ZERO;
    int counter = 0;
    while( (line = br.readLine()) != null) {
      counter++;
      assert(line.length() == 50);
      total = total.add(new BigInteger(line));
    }
    assert(counter == 100);
    System.out.println(total);
  }

}

