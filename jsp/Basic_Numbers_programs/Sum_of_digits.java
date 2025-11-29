package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class Sum_of_digits {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the number :");
    int n = scn.nextInt();
    int sum = 0;
    while (n != 0) {

      sum += n % 10;
      n /= 10;
    }
    System.out.println("The number of digit in the give number is : " + sum);
  }

}
