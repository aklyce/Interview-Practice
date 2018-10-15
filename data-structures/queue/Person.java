public class Person {
  private String name;
  private int employNum;
  private int age;

  public Person(String name, int employNum, int age) {
    this.name = name;
    this.employNum = employNum;
    this.age = age;
  }

  public String toString() {
    return "Name: " + this.name + " Age: " + this.age + " Num: " + this.employNum;
  }


}
