package jsp.oops.CallToThis;

public class b {
  b() {
    this(10);
    System.out.println("B()cons called");

  }

  b(int i) {
    this(10, 20);
    System.out.println("B(int i)cons called " + i);
  }

  b(int i, int j) {
    System.out.println("B(int i, int j)cons called " + j);
  }

  public static void main(String[] args) {
    new b();
    System.out.println();
  }
}
