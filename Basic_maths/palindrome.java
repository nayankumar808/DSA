package Basic_maths;

public class palindrome {

  public static boolean isPalindrome(int x) {
    int orignalVlaue = x;
    long reverseNum = 0;
    while (x != 0) {
      int ld = x % 10;
      reverseNum = (reverseNum * 10) + ld;
      x = x / 10;
    }
    return reverseNum == orignalVlaue ? true : false;

  }

  public static void main(String[] args) {
    int num = 121;
    System.out.println(isPalindrome(num));

  }

}
