package HashMap;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int findLongestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;

        for (int num : arr) {
            set.add(num);
        }

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;


                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + findLongestConsecutive(arr));
    }
}
