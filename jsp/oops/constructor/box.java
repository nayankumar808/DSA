package jsp.oops.constructor;

public class box {
  int height;
  int width;
  int length;

  box(int i) {
    length = i;
    width = i;
    height = i;
  }

  box(int i, int j) {
    length = i;
    width = j;
  }

  box(int length, int width, int height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public void display() {
    System.out.println("legnth : " + length);
    System.out.println("height : " + height);
    System.out.println("width : " + width);

  }

  public static void main(String[] args) {
    box b1 = new box(25);
    b1.display();
    box b2 = new box(25, 30);
    b2.display();
    box b3 = new box(25, 30, 50);
    b3.display();

  }

}
