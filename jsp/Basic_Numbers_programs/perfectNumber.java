package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class perfectNumber {
  public static void main(String[] args) {
    System.out.println("Enter the number to check for the perfect number :");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sum = 0;
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        sum += i;
      }

    }
    if (n == sum)
      System.out.println("The Number is perfect Number ");

    else
      System.out.println("The Number is  not a perfect Number ");
  }

}
