public class StringConcatenation {
    public static void main(String[] args) {
        int iterations = 1000000; // Number of concatenations

        long startTime, endTime;

        // Using String (Inefficient)
        startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        endTime = System.nanoTime();
        System.out.println("String Concatenation Time: " + (endTime - startTime) / 1e6 + " ms");

        // Using StringBuilder (Efficient for single-threaded operations)
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Concatenation Time: " + (endTime - startTime) / 1e6 + " ms");

        // Using StringBuffer (Thread-safe, slightly slower than StringBuilder)
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Concatenation Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
