package Basic_recursion;

public class count_digit {
  int count = 0;

  public void print(int n) {
    if (count == n) {
      return;
    }
    System.out.println("nayan");
    count++;
    print(n); // recursive call
  }

  public static void main(String[] args) {
    count_digit obj = new count_digit(); // ✅ create object
    obj.print(5);
  }
}
