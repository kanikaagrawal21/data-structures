package Searching;

import java.util.Arrays;

public class MissingPositiveInteger {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,7,8,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missingInteger(arr));

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
    public static int missingInteger(int[]arr){
        int expected = 1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==expected){
                expected++;
            }else if(arr[i]>expected){
                return expected;

            }
        }
        return -1;
    }
}
