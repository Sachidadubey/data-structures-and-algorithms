class MyStack {
  private int[] arr;
  private int top;
  private int capacity;

  // constructor call
  MyStack(int size) {
    arr = new int[size];
    top = -1;
    capacity = size;
  }
  // push element into stack

  public void pushed(int no) {
    if (top == capacity - 1) {
      System.out.println("stack overflow ! cannot pus ");
      return;
    }
    arr[++top] = no;
    System.out.println(no + "pushed into stack");
  }

  // pop elements from stack

  public int Popped() {
    if (top == -1) {
      System.out.println("stack underflow  ! cannot deleted ");
      return -1;
    }
    System.out.println("top element popped");
    return arr[top--];
  }

  // peek from stack

  public int peeked() {
    if (top == -1) {
      System.out.println("stack is empty");
      return -1;
    }
    System.out.println(arr[top]);
    return arr[top];
  }
  // isEmpty or not

  public boolean IsEmpty() {
    if (top == -1)
      return true;
    else
      return false;

  }

  // print stack

  public void Prints() {
    if (top == -1) {
      System.out.println("stack is empty");
      return;
    }
    while (--top >= 0) {
      System.out.print(arr[top] + " ");
    }
  }

  // size
  public int size() {
    System.out.println(top + 1);
    return top + 1;
  }

}

public class stack3 {
  public static void main(String[] args) {
    MyStack stack = new MyStack(5);
    stack.pushed(10);
    stack.pushed(120);
    stack.pushed(140);
    stack.pushed(150);
    stack.pushed(106);
    // stack.Popped();
    // System.out.println(stack.Popped());
    // stack.peeked();
    stack.size();
    System.out.println(stack.IsEmpty());

    stack.Prints();

  }
}
