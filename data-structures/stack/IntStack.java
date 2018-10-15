public class IntStack {
    private int[] stack;
    private int size;
    private int top;
  
    public IntStack(int size) {
      top = -1;
      this.size = size;
      stack = new int[this.size];
    }
    public boolean push(int item) {
      if (!isFull()) {
        top ++;
        stack[top] = item;
        return true;
      } else {
        return false;
      }
    }

    public int pop() {
      return stack[top--];
    }
    public boolean isFull() {
      return (top == stack.length -1);
    }
    public boolean isEmpty() {
      return (top == -1);
    }


    public static void main(String[] args){
      IntStack stack = new IntStack();
      stack.push(100);
      stack.push(200);
      stack.push(600);
      System.out.println(stack.pop());
      stack.pop();
      System.out.println(stack.isEmpty());
    }
}
