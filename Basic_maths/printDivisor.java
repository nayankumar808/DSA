package Basic_maths;

import java.util.List;
import java.util.ArrayList;

public class printDivisor {

  public static List<Integer> divisiors(int n) {
    List<Integer> divisor = new ArrayList<>();

    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        divisor.add(i);
      }
      if (n / i != i) {
        divisor.add(n / i);
      }

    }
    return divisor;
  }

  public static void main(String[] args) {
    System.out.print(divisiors(10));
  }

}
