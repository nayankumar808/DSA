package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class fibonnaciSeries {
  public static void main(String[] args) {
    System.out.println("Enter the nth term upto which fibbonaci series have to be calcualted");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a = 0, b = 1, fib = 0;
    while (n != 0) {
      fib = a + b;
      a = b;
      b = fib;
      System.out.println(fib);
      n--;
    }
  }

}
