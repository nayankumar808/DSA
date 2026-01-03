package jsp.downcasting;

class animal {
  public void eat() {
    System.out.println("animal- eats");
  }

}

class dog extends animal {
  @Override
  public void eat() {
    System.out.println("dog eats");

  }

  public void bark() {
    System.out.println("dog barks");
  }

}

class babydog extends dog {
  @Override
  public void eat() {
    System.out.println("dog eats");

  }

  @Override
  public void bark() {
    System.out.println("dog barks");
  }

  public void weep() {
    System.out.println("babydog weeps");
  }
}

class cat extends animal {
  @Override
  public void eat() {
    System.out.println("cat - eats");
  }
}

public class animalDriver {
  public static void main(String[] args) {
    animal a = new animal();
    a.eat();
    dog d = (dog) a;
    d.eat();
    // babydog b = (babydog) a;
    animal a1 = new babydog();
    a1.eat();
    dog d1 = (dog) a1;
    d1.eat();
    d1.bark();
    // d1.weep();
    babydog b1 = (babydog) d1;
    babydog b2 = (babydog) a1;
    b1.eat();
    b1.bark();
    b1.weep();

  }

}
