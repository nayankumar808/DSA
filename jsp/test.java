package jsp;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = scn.nextInt();
    // System.out.println(primeNumbers(n));
    // System.out.println(palindrome(n));
    // System.out.println(perfect(n));
    // System.out.println(strong(n));
    System.out.println(armstrong(n));
  }

  public static boolean primeNumbers(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0)
        count++;
    }
    if (count == 2) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean palindrome(int n) {
    int num = n;
    int digit = 0;
    int reverse = 0;

    while (num != 0) {
      digit = num % 10;
      reverse = (reverse * 10) + digit;
      num = num / 10;

    }
    return (reverse == n);
  }

  public static boolean perfect(int n) {
    int num = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        num = num + i;
      }

    }
    return (num == n);
  }

  public static int fact(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public static boolean strong(int n) {
    int num = n;
    int digit = 0;
    int sum = 0;
    while (n != 0) {
      digit = n % 10;
      sum = sum + fact(digit);
      n = n / 10;
    }
    return (sum == num);
  }

  public static int count(int n) {
    int t = 0;
    while (n != 0) {
      t++;
      n /= 10;

    }
    return t;
  }

  public static boolean armstrong(int n) {
    int num = n;
    int digit = 0;
    int num2 = 0;
    int length = count(n);

    while (num != 0) {
      digit = num % 10;
      num2 += (int) Math.pow(digit, length);
      num /= 10;

    }
    return (n == num2);
  }

}
