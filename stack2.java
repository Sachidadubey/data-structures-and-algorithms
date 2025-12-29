import java.util.ArrayDeque;
import java.util.Deque;

public class stack2 {
  public static void main(String[] args) {

    Deque<Integer> stack = new ArrayDeque<>();

    // push()
    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println("Stack: " + stack);

    // peek()
    System.out.println("Top: " + stack.peek());

    // pop()
    System.out.println("Popped: " + stack.pop());

    System.out.println("After pop: " + stack);

    // isEmpty()
    System.out.println("Is empty? " + stack.isEmpty());
  }
}
