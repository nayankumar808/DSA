package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class sumOfDigits {
  public static void main(String[] args) {
    System.out.println("Enter the number : ");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    while (n > 10) {
      int sum = 0;
      while (n != 0) {
        int digit = n % 10;
        sum += digit;
        n /= 10;
      }
      n = sum;
      System.out.println(sum);
    }

  }

}
