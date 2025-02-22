package Searching;

public class RotationPointFinder {

        public static int findRotationPoint(int[] arr) {
            int left = 0, right = arr.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] > arr[right]) {
                    left = mid + 1; // Move to the right side
                } else {
                    right = mid; // Move to the left side
                }
            }
            return left; // Index of the smallest element (rotation point)
        }

        public static void main(String[] args) {
            int[] arr = {4, 5, 6, 7, 0, 1, 2};
            int rotationIndex = findRotationPoint(arr);
            System.out.println("Rotation Point Index: " + rotationIndex);
            System.out.println("Smallest Element: " + arr[rotationIndex]);
        }
    }

