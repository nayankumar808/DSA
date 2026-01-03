package jsp.oops.Binding;

public class vehicle {
  class vehicle1 {
    public void start() {

    }

    public void accelerate() {

    }

    public void stop() {

    }
  }

  class BMW extends vehicle {

    public void start() {
      System.out.println("BMW starts");

    }

    public void accelerate() {
      System.out.println("BMW accelerate");
    }

    public void stop() {
      System.out.println("BMW stop");
    }

  }

  class audi extends vehicle {

    public void start() {
      System.out.println("audi starts");

    }

    public void accelerate() {
      System.out.println("audi accelerate");
    }

    public void stop() {
      System.out.println("audi stop");
    }

  }

  class benz extends vehicle {

    public void start() {
      System.out.println("benz starts");

    }

    public void accelerate() {
      System.out.println("benz accelerate");
    }

    public void stop() {
      System.out.println("benz stop");
    }

  }

  public class vehicleDriver {
    public static void drive(vehicle1 v) {
      v.start();
      v.accelerate();
      v.stop();
    }
  }

  public static vehicle getCar() {

  }

}
