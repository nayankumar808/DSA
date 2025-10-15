package Basic_recursion;

public class StrinngPalindrome {
  public static boolean plainndrome(String s, int start, int end) {
    if (start >= end) {
      return true;
    }
    if (s.charAt(start) != s.charAt(end)) {
      return false;
    }
    return plainndrome(s, start + 1, end - 1);

  }

  public static void main(String[] args) {
    System.out.println(plainndrome("nayan", 0, 4));
  }

}
