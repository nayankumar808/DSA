package jsp.oops.inheritance;

class D {
  D(int i) {
    System.out.println("A(int i) construtor : " + i);
  }
}

class E extends D {
  E(int i) {
    super(i);
    System.out.println("B (int i) construtor: " + i);
  }
}

class F extends D {
  F() {
    super(20);
  }

}

public class superKey2 {
  public static void main(String[] args) {
    new F();
  }

}
