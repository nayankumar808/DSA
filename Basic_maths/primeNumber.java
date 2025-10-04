package Basic_maths;

public class primeNumber {
  public static boolean primeNumber(int n) {
    if (n == 0)
      return false;
    if (n == 1)
      return true;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.print(primeNumber(5));
  }

}
