package HashMap;

import java.util.*;

public class PairWithGivenSumInAnArray {
    public static boolean findPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {  // Fixed "contains" method
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }
            set.add(num); // Add current number to the set
        }

        // If loop completes and no pair is found
        System.out.println("No pair found.");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 3, 6};
        int target = 9;
        findPair(arr, target);
    }
}
