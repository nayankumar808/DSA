package Basic_maths;

public class reverseDigit {

  public static long reverse(int x) {
    long reverseNum = 0;

    while (x != 0) {
      int ld = x % 10;
      reverseNum = (reverseNum * 10) + ld;
      x = x / 10;
    }
    return reverseNum;
  }

  public static void main(String[] args) {
    int x = 123;
    System.out.println(reverse(x));

  }

}