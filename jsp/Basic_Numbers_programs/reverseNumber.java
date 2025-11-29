package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class reverseNumber {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the value of n which has to be reversed");
    int n = scn.nextInt();
    int reversed = 0;
    while (n != 0) {
      int ld = n % 10;
      reversed = reversed * 10 + ld;
      n = n / 10;
    }
    System.out.println("The reverse of the give number is : " + reversed);
  }

}
