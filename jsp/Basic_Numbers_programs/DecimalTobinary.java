package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class DecimalTobinary {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the decimal number");
    int n = scn.nextInt();
    int i = 1;
    int binary = 0;
    while (n != 0) {
      int bit = n % 2;
      binary = bit * i + binary;
      n /= 2;
      i *= 10;
    }
    System.out.print(binary);

  }

}
