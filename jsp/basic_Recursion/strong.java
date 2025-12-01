package jsp.basic_Recursion;

public class strong {
  public static void main(String[] args) {

  }

  public static boolean strongNumber(int n, int sum, int m) {
    if (n == 0)
      return sum == m;
    sum += fact(n % 10);

    return strongNumber(n / 10, sum, m);

  }

  public static int fact(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * fact(n - 1);
  }

}
