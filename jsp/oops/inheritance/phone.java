package jsp.oops.inheritance;

class Phone {
  String name;
  int num;
  String color;

  public Phone(String name, int num, String color) {
    this.name = name;
    this.color = color;
    this.num = num;
  }

}

class smartphone extends Phone {
  int ram;
  int rom;
  int pixel;

  public smartphone(String name, String color, int num, int ram, int rom, int pixel) {
    super(name, num, color);
    this.pixel = pixel;
    this.ram = ram;
    this.rom = rom;

  }

}

  public void display() {
    System.out.println(name + "\t" + num + "\t" + color + "\t" + ram + "\t" + rom + "\t");
  }

public class phone {

}
