package Searching;

import java.util.Arrays;

public class TargetIndex {
    public static void main(String[] args) {
        int[] arr = {9, 3, 5, 34, 6, 87, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findTargetIndex(arr,34));


    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int findTargetIndex(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
