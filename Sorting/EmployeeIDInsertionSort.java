package Sorting;

import java.util.Arrays;

public class EmployeeIDInsertionSort {
    public static void main(String[] args) {
        int[] arr= {21,34,12,3,1,7,2};
        sortID(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sortID(int[]arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
