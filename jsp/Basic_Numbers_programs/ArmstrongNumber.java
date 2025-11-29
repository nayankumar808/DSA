package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    System.out.print("Enter the Number to check for the armstrong :");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int c = (n + "").length();
    int sum = 0;
    int num = n;
    while (n != 0) {
      int ld = n % 10;
      sum += Math.pow(ld, c);
      n /= 10;
    }
    if (num == sum)
      System.out.println("The number is ArmstrongNumber number");
    else
      System.out.println("The Number is not a ArmstrongNumber Number");

  }

}
