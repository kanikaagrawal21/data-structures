package Sorting;

import java.util.Arrays;
//BubbleSort

public class StudentMarks {
    public static void main(String[] args) {
        int[]arr={67,72,56,81,94,42};
       sortMarks(arr);
        System.out.println(Arrays.toString(arr));

    }
    public  static void sortMarks(int[]arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j =1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
