import java.util.Stack;

class SortStackRecursively {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop(); // Remove top element
            sortStack(stack);       // Sort the remaining stack
            insertSorted(stack, temp); // Insert temp in correct position
        }
    }

    // Function to insert an element at the correct position
    private static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element); // Push if stack is empty or correct position found
        } else {
            int temp = stack.pop(); // Remove top element
            insertSorted(stack, element); // Recur for remaining elements
            stack.push(temp); // Put back the removed element
        }
    }

    // Function to display the stack
    public static void display(Stack<Integer> stack) {
        System.out.println("Stack (top to bottom): " + stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack:");
        display(stack);

        sortStack(stack);

        System.out.println("Sorted Stack:");
        display(stack);
    }
}
