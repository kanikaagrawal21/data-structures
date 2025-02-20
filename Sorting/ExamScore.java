package Sorting;

import java.util.Arrays;

public class ExamScore  {
    public static void main(String[] args) {
        int[] scores = {85, 72, 90, 66, 78, 95, 88};

        selectionSort(scores);

        System.out.println("Sorted Exam Scores: " + Arrays.toString(scores));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            swap(arr, i, minIndex);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
