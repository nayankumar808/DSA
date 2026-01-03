package jsp.oops.Binding;

class A {

}

class B extends A {

}

class C {
  public void m1(A a) {
    System.out.println((" m1(A a) - C"));

  }

  public void m2(B b) {
    System.out.println((" m2(B b) - C"));
  }
}

class D extends C {
  @Override
  public void m1(A a) {
    System.out.println((" m1(A a) - d"));

  }

  @Override
  public void m2(B b) {
    System.out.println((" m1(A a) - d"));

  }

}

public class test {
  public static void main(String[] args) {
    A a = new B();
    C c = new D();
    c.m1(a);

  }

}
