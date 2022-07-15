package Sorting;

import java.util.Arrays;

public class BubbleSortBasics {
    public static void main(String[] args) {
        int[] arr = {1};
        bubble(arr);
        System.out.println(Arrays.toString((arr)));

    }
    static void bubble(int[] arr){
        boolean swapped;
//        Run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
//            for each step max item will come at respective index
            for (int j = 1; j < arr.length-i; j++) {
//                Swap
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
//            if you did not swap for a perticular value
            if(!swapped){
                break;
            }
        }
    }
}
