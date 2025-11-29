package jsp.methods;

public class alternateNumbers {
  public static void main(String[] args) {
    range(1, 100);

  }

  public static void range(int start, int end) {
    int count = 0;
    for (int i = start; i <= end; i++) {
      if (ispalindrome(i)) {
        count++;
        if (count % 2 != 0) {
          System.out.println(i);
        }
      }
    }
  }

  public static boolean isprimeNumbers(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0)
        count++;
    }
    if (count == 2) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean ispalindrome(int n) {
    int num = n;
    int digit = 0;
    int reverse = 0;

    while (num != 0) {
      digit = num % 10;
      reverse = (reverse * 10) + digit;
      num = num / 10;

    }
    return (reverse == n);
  }

}
