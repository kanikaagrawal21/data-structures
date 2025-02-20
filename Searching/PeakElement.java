package Searching;

public class PeakElement {
    public class PeakElementFinder {
        public static int findPeakElement(int[] arr) {
            int left = 0, right = arr.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] > arr[mid + 1]) {
                    right = mid; // Move to the left side
                } else {
                    left = mid + 1; // Move to the right side
                }
            }
            return left; // or return right (both will be the same at the end)
        }

        public static void main(String[] args) {
            int[] arr = {1, 3, 20, 4, 1, 0};
            int peakIndex = findPeakElement(arr);
            System.out.println("Peak Element Index: " + peakIndex);
            System.out.println("Peak Element Value: " + arr[peakIndex]);
        }
    }

}
