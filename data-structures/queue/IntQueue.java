public class IntQueue{
  private int[] queue;
  private int size;
  private int total;
  private int front;
  private int back;

  public IntQueue() {
    this.size = 100;
    this.total = 0;
    this.front = 0;
    this.back = 0;
    this.queue = new int[size];
  }

  public IntQueue(int size) {
    this.size = size;
    this.total = 0;
    this.front = 0;
    this.back = 0;
    this.queue = new int[size];
  }

  public boolean enQueue(int item) {
    if (!isFull()){
      this.queue[back] = item;
      back = (back +1) % this.size;
      total++;
      return true;
    }
    return false;
  }

  public int deQueue() {
    int item =  this.queue[front];
    front = (front + 1) % this.size;
    total--;
    return item;
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
    IntQueue queue = new IntQueue();
    queue.enQueue(3);
    queue.enQueue(4);
    queue.enQueue(5);
    queue.showAll();
  }

}
