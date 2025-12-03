package jsp.oops;

public class StaticBlocks2 {
  static int i;
  static {
    i = 10;

  }
  static {
    i = 20;
  }

  public static void main(String[] args) {
    System.out.println(i);
  }

  static {
    int i = 30; // local variable
  }

}
