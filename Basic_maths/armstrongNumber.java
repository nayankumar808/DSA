package Basic_maths;

public class armstrongNumber {
  public static boolean armstrong(int x) {
    int orignal = x;
    int ans = 0;
    while (x != 0) {
      int ld = x % 10;
      ans = ans + (ld * ld * ld);
      x = x / 10;
    }
    if (ans == orignal) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(armstrong(153)); // true
    System.out.println(armstrong(370)); // true
    System.out.println(armstrong(371)); // true
    System.out.println(armstrong(9474)); // false (not a 3-digit cube Armstrong)
  }
}
