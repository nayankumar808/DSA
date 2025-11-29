package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class gcd {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter the value of N1");
    int n1 = scn.nextInt();
    System.out.println("Enter the value of N2");
    int n2 = scn.nextInt();
    int num = 0;
    int gcd = 0;
    if (n1 < n2)
      num = n1;
    else
      num = n2;
    for (int i = 1; i <= num; i++) {
      if (n1 % i == 0 && n2 % i == 0) {
        gcd = i;
      }
    }
    System.out.println(gcd);

    // By using euclids algorithm

    while (n2 != 0) {
      int temp = n2;
      n2 = n1 % n2;
      n1 = temp;
    }
    System.out.println(n1);
  }

}
