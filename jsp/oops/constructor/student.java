package jsp.oops.constructor;

public class student {
  String name;
  int age;
  int id;

  student(String name) {
    this.name = name;
  }

  student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  student(String name, int age, int id) {
    this.name = name;
    this.age = age;
    this.id = id;
  }

  public void distplay() {
    System.out.println(name);
    System.out.println(age);
    System.out.println(id);
  }

  public static void main(String[] args) {
    student s1 = new student("nayan");
    student s2 = new student("nayan", 22);
    student s3 = new student("nayan", 22, 32);
    s1.distplay();
    s2.distplay();
    s3.distplay();

  }
}
