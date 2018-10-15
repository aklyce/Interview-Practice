public class PersonQueue{
  private Person[] queue;
  private int size;
  private int total;
  private int front;
  private int back;

  public PersonQueue() {
    this.size = 100;
    this.total = 0;
    this.front = 0;
    this.back = 0;
    this.queue = new Person[size];
  }

  public PersonQueue(int size) {
    this.size = size;
    this.total = 0;
    this.front = 0;
    this.back = 0;
    this.queue = new Person[size];
  }

  public boolean enQueue(Person person) {
    if (!isFull()){
      this.queue[back] = person;
      back = (back +1) % this.size;
      total++;
      return true;
    }
    return false;
  }

  public Person deQueue() {
    Person person =  this.queue[front];
    front = (front + 1) % this.size;
    total--;
    return person;
  }

  public boolean isFull() {
    return (size == total);

  }

  public void showAll() {
    int f = front;
    if (total != 0) {
      for (int i = 0; i < total; i++) {
        System.out.println(" " + queue[f]);
        f = (f + 1) % size;
      }
    }
  }

  public static void main(String[] args) {
    PersonQueue queue = new PersonQueue();
    Person person1 = new Person("Angel Klyce", 123, 44);
    Person person2 = new Person("Heaven Miller", 44444, 99);
    queue.enQueue(person1);
    queue.enQueue(person2);
    queue.showAll();

  }

}
