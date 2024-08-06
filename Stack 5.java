import java.util.Stack;

public class Stack5 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor to initialize the stack and minStack
    public Stack5() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element onto the stack
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Pop element from the stack
    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    // Get the top element of the stack
    public int top() {
        return stack.peek();
    }

    // Retrieve the minimum element in the stack
    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Stack5 minStack = new Stack5();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Minimum element: " + minStack.getMin()); // Returns -3
        minStack.pop();
        System.out.println("Top element: " + minStack.top()); // Returns 0
        System.out.println("Minimum element: " + minStack.getMin()); // Returns -2
    }
}
