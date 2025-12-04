package jsp.oops;

class nonStaticblocks2 {
  int i;
  int j;
  {
    i = 10;
    j = 20;
  }
  {
    j = 30;
  }

  public static void main(String[] args) {
    System.out.println("main starts");

    nonStaticblocks2 b = new nonStaticblocks2();
    System.out.println(b.i + "\t" + b.j);
    System.out.println("main ends");
  }

  {
    i = 40;
  }

}