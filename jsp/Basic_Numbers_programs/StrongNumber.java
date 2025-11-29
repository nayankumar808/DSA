package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class StrongNumber {
  public static void main(String[] args) {
    System.out.println("Enter the number to check for the Strong Number");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int num = n;
    int sum = 0;
    while (n != 0) {

      int m = n % 10;
      int fact = 1;
      for (int i = 1; i <= m; i++) {
        fact *= i;
        // System.out.println(fact);
      }
      sum += fact;
      n /= 10;
    }
    if (sum == num)
      System.out.println("The given Number is perfect number");
    else
      System.out.println("The Given number is not a perfect Number");

  }

}
