package jsp.oops.constructor;

public class copyConstructor {
  int i;
  int j;

  copyConstructor() {

  }

  copyConstructor(int i, int j) {
    this.i = i;
    this.j = j;
  }

  public copyConstructor(copyConstructor a) {
    this.i = a.i;
    this.j = a.j;

  }

  public static void main(String[] args) {
    copyConstructor a = new copyConstructor();
    copyConstructor a1 = new copyConstructor(10, 20);
    copyConstructor a2 = new copyConstructor(a); // Copy constructor
    copyConstructor a3 = new copyConstructor(a1);
    copyConstructor a4 = a1;
    System.out.println(a1.i + "\t" + a1.j);
    System.out.println(a2.i + "\t" + a2.j);
    System.out.println(a3.i + "\t" + a3.j);

  }

}
