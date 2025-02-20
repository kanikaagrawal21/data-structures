import java.io.*;

public class LargeFileReadingEfficiency {
    public static void main(String[] args) {
        String filePath = "largefile.txt"; // Replace with actual file path

        long startTime, endTime;

        // Using FileReader (Character Stream)
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            startTime = System.nanoTime();
            while (bufferedReader.read() != -1) {
                // Reading character by character
            }
            endTime = System.nanoTime();
            System.out.println("FileReader Time: " + (endTime - startTime) / 1e6 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using InputStreamReader (Byte Stream)
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            startTime = System.nanoTime();
            while (bufferedReader.read() != -1) {
                // Reading character by character
            }
            endTime = System.nanoTime();
            System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1e6 + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
