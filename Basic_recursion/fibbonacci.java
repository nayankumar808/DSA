package Basic_recursion;

public class fibbonacci {
  public static int fib(int n) {
    if (n <= 1) {
      return 1;

    }
    return fib(n - 1) + fib(n - 2);
  }

  public static void main(String[] args) {
    System.out.print(fib(5));
  }

}
