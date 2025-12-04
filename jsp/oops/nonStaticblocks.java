package jsp.oops;

public class nonStaticblocks {
  {
    System.out.println("non - static block -1");
  }
  {
    System.out.println("non - static block -2");
  }

  public static void main(String[] args) {

    System.out.println("Main starts");
    new nonStaticblocks();
    System.out.println("Main ends");

  }

  {
    System.out.println("non - static block -3");
  }

}
