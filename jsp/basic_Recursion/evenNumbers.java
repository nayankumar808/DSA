package jsp.basic_Recursion;

public class evenNumbers {
  public static void main(String[] args) {
    // even(1, 100);
    Sumofeven(1, 100, 0);
  }

  // Printing basic even numbers using recursion
  public static void even(int st, int end) {
    if (st > end)
      return;
    if (st % 2 == 0) {
      System.out.println(st);
    }
    even(st + 1, end);
  }

  // sum of even numbers
  public static void Sumofeven(int st, int end, int sum) {

    if (st > end) {
      System.out.println(sum);
      return;
    }
    if (st % 2 == 0) {
      // System.out.println(st);
      sum += st;
    }
    Sumofeven(st + 1, end, sum);
  }
}
