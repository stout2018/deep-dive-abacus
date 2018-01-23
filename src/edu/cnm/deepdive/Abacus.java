package edu.cnm.deepdive;

import java.util.Arrays;

public class Abacus {

  public static void main(String[] args) {
    double sum = 0;
    for (String s : args) {
      sum += Double.parseDouble(s);
    }

//    System.out.print("Sum = ");
//    System.out.println(sum);
    System.out.printf("Sum of %s = %5.2f%n", Arrays.toString(args),  sum);
  }

}
