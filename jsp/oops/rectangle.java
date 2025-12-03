package jsp.oops;

public class rectangle {

  int length;
  int breadth;

  public void initia(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public void area() {
    System.out.println(length * breadth);
  }

  public void perimeter() {
    int res = 2 * (length + breadth);
    System.out.println(res);
  }

  public void display() {
    System.out.println("length is " + length + "breadth is " + breadth);
  }

  public static void main(String[] args) {
    rectangle r1 = new rectangle();
    r1.initia(10, 20);
    r1.area();
    r1.perimeter();
    r1.display();

  }
}