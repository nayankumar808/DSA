package jsp.basic_Recursion;

public class countDigit {
  public static void main(String[] args) {
    System.out.println(count(58963, 0));
  }

  public static int count(int n, int count) {
    if (n == 0)
      return count;
    n /= 10;
    count++;
    return count(n, count);
  }

}
