package HashMap;

import java.util.*;

public class SubarraysWithZeroSum {

    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;


        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

              for (int i = 0; i < arr.length; i++) {
            sum += arr[i];


            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println("Subarray found: " + Arrays.toString(Arrays.copyOfRange(arr, startIndex + 1, i + 1)));
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        findZeroSumSubarrays(arr);
    }
}
