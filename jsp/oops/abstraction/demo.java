package jsp.oops.abstraction;

abstract class AAA {
  abstract public void m1();

  abstract public void m2();
}

abstract class BBB extends AAA {
  @Override
  public void m1() {
    System.out.println("m1()-b");

  }
}

class CCC extends BBB {
  @Override
  public void m2() {
    System.out.print("m2()-c");
  }
}

public class demo {
  public static void main(String[] args) {
    AAA a = new CCC();
    a.m1();
    a.m2();
  }

}
