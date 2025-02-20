import java.util.Stack;

public class StockSpan {

    // Function to calculate stock span
    public static int[] calculateSpan(int prices[]) {
        int n = prices.length;
        int span[] = new int[n]; // Result array to store spans
        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        // Iterate over each stock price
        for (int i = 0; i < n; i++) {
            // Pop elements from stack while stack is not empty and
            // price at stack top is less than or equal to current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, it means all previous elements were smaller
            if (stack.isEmpty()) {
                span[i] = i+1;
            }
            else {
                span[i] = i-stack.peek();
            }


            // Push current index to stack
            stack.push(i);
        }

        return span;
    }

    // Function to print an array
    public static void printArray(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int prices[] = {100, 80, 60, 70, 60, 75, 85};

        System.out.println("Stock Prices:");
        printArray(prices);

        int span[] = calculateSpan(prices);

        System.out.println("Stock Span:");
        printArray(span);
    }
}