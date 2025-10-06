package Basic_recursion;

import java.util.Scanner;

public class reversePrinting {
  public static void reversePrint(int i, int n) {
    if (i < 1) {
      return;

    }
    System.out.println(i);
    reversePrint(i - 1, n);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    reversePrint(n, n);
    sc.close();
  }

}
