
package jsp.oops.inheritance;

class A {
  public static void m1() {
    b.m2();

  }

  static {
    System.out.println("static bloc a");
  }
}

class b extends A {
  public static void m2() {

  }

  static {
    System.out.println("static block b");
  }

}

public class superKey {
  static {
    A.m1();
    System.out.println("static block super");
  }

  public static void main(String[] args) {
    System.out.println("main executed");
  }

}
