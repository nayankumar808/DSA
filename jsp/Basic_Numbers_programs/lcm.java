package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class lcm {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter the value of N1");
    int n1 = scn.nextInt();
    System.out.println("Enter the value of N2");
    int n2 = scn.nextInt();

    int a = n1; // preserve original values
    int b = n2;

    // Euclidean Algorithm for GCD
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    int gcd = a;

    // LCM formula
    int lcm = (n1 * n2) / gcd;

    System.out.println("LCM of the numbers: " + lcm);
  }
}
