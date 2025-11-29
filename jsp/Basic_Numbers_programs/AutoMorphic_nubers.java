package jsp.Basic_Numbers_programs;

import java.util.Scanner;

public class AutoMorphic_nubers {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number to Check wether it is automorphic number or not :");
    int n = scn.nextInt();
    int sq = n * n;
    int num = n;
    int i = 1;

    while (num > 0) {
      num /= 10;
      i *= 10;
    }
    if (sq % i == n) {
      System.out.println("Number is automorphic Number");
    } else {
      System.out.println("Number is not automorphic numbers");
    }
  }

}
