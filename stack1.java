import java.util.Stack;

public class stack1 {
  public static void main(String[] args) {

    Stack<Integer> st = new Stack<>();

    // 1️⃣ push() → add elements
    st.push(10);
    st.push(20);
    st.push(30);

    System.out.println("Stack: " + st);

    // 2️⃣ peek() → see top element (without removing)
    System.out.println("Top element (peek): " + st.peek());

    // 3️⃣ pop() → remove top element
    System.out.println("Popped element: " + st.pop());

    System.out.println("Stack after pop: " + st);

    // 4️⃣ empty() → checks if stack is empty
    System.out.println("Is stack empty? " + st.empty());

    // 5️⃣ search(element)
    System.out.println("Position of 10: " + st.search(10));
    System.out.println("Position of 50: " + st.search(50)); // not present

    // size function return the size of stack
    System.out.println("size =" + st.size());
    // it will print all the elemnts of stack
    System.out.println(st);
  }
}
