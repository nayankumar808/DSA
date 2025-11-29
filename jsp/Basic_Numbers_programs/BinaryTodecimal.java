package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class BinaryTodecimal {
  public static void main(String[] args) {
    System.out.println("Enter the Binary value of the number");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int decimalVlaue = 0;
    int count = 0;
    while (n != 0) {
      int ld = n % 10;
      decimalVlaue += ld * (int) Math.pow(2, count);
      count++;
      n /= 10;

    }
    System.out.println(decimalVlaue);

  }

}
