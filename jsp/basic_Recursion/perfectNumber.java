package jsp.basic_Recursion;

public class perfectNumber {
  public static void main(String[] args) {
    System.out.println(isPerfect(1, 6, 0));

  }

  public static boolean isPerfect(int i, int n, int sum) {
    if (i > n / 2)
      return (sum == n);
    if (n % i == 0)
      sum += i;
    return isPerfect(i + 1, n, sum);
  }

}
