public class Person {

  private String name;
  private String rollNum;
  public Person(String name, String rollNum){
    this.name = name;
    this.rollNum = rollNum;
  }

  public String toString() {
    return "Name: " + this.name + " Roll Number: " + this.rollNum;
  }

}
