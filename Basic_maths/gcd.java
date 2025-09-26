package Basic_maths;

public class gcd {

  public static int Gcd(int x, int y) {
    if (x == 0 || y == 0) {
      return 0;

    }
    if (x == 0)
      return y;
    if (y == 0)
      return x;
    int gcd = 1;

    for (int i = 1; i <= Math.min(x, y); i++) {

      if (x % i == 0 && y % i == 0) {
        gcd = i;
      }

    }
    return gcd;

  }

  public static void main(String[] args) {
    System.out.println(Gcd(7, 14));

  }

}