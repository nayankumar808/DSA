package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class primeNumbers {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // System.out.println("Enter the value of n :");
    // int n = scn.nextInt();
    // System.out.println(isPrime(n));

    // System.out.println("Enter the value of n1 :");
    // int n1 = scn.nextInt();
    // System.out.println("Enter the value of n2 :");
    // int n2 = scn.nextInt();
    // range(n1, n2);

    System.out.println("Enter the value of n:");
    int n = scn.nextInt();
    SecondLargestPrimeNo(n);

  }

  // Method for checking wether the number is prime number or not
  public static boolean isPrime(int n) {
    if (n <= 1)
      return false;
    if (n == 2)
      return true;
    if (n % 2 == 0)
      return false;
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  // Method to print The prime Number in the given range

  public static void range(int n1, int n2) {
    for (int i = n1; i <= n2; i++) {
      if (isPrime(i))
        System.out.println(i);
    }
  }

  // method to print the second largest prime number --

  public static void SecondLargestPrimeNo(int n) {
    int count = 0;
    if (n <= 2)
      System.out.println("No prime number exist");
    for (int i = n; i >= 2; i--) {
      if (isPrime(i))
        count++;
      if (count == 2)
        System.out.println("Second largest prime number is :" + i);
      break;
    }
  }
}
