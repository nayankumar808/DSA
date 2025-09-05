package Basic_maths;

public class count_digit {
  public static int evenlyDivides(int n) {
    int m = n;
    int count = 0;
    while (m > 0) {
      int ld = m % 10;
      if (ld != 0 && n % ld == 0) {
        count++;
      }
      m = m / 10;
    }
    return count;
  }

  public static void main(String[] args) {
    int n = 1012;
    System.out.println("Digits that evenly divide " + n + " = " + evenlyDivides(n));
  }
}
