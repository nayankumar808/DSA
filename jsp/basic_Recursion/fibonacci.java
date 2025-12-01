package jsp.basic_Recursion;

public class fibonacci {
  public static void main(String[] args) {
    System.out.println(fib(5));
  }

  public static int fib(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    int fibn = fib(n - 2) + fib(n - 1);
    System.out.println(fibn);
    return (fibn);
  }

}
