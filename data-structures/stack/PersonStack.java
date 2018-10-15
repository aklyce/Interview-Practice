public class PersonStack {
    private Person[] stack;
    private int size;
    private int top;

    public PersonStack(int size) {
      top = -1;
      this.size = size;
      stack = new Person[this.size];
    }
    public boolean push(Person item) {
      if (!isFull()) {
        top ++;
        stack[top] = item;
        return true;
      } else {
        return false;
      }
    }

    public Person pop() {
      return stack[top--];
    }
    public boolean isFull() {
      return (top == stack.length -1);
    }
    public boolean isEmpty() {
      return (top == -1);
    }


    public static void main(String[] args){
      PersonStack stack = new PersonStack(50);
      Person person1 = new Person("Angel", "255");
      Person person2 = new Person("Saaleha", "234");
      stack.push(person1);
      stack.push(person2);
      stack.pop();
      System.out.println(stack.pop().toString());
    }
}
