package LinearSearch;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
        System.out.println(max(arr));
        System.out.println(inRange(arr, 3, 4));
    }
//    Assuming arr.length != 0
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    static int max(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    static int inRange(int[] arr, int start, int end){
        System.out.println("Press 1 to finding max in the array\nPress 2 to find the min in the array");
        int user;
        Scanner in = new Scanner(System.in);
        user = in.nextInt();
//        int ans = Integer.MIN_VALUE;
        int ans = arr[start];
        if (user==1){
            for (int i = start; i <=end; i++) {
                if (arr[i]>ans){
                    ans = arr[i];
                }
            }
        }
        else if (user==2){
            for (int i = start; i <=end; i++) {
                if (arr[i]<ans){
                    ans = arr[i];
                }
            }
        }
        else{
            System.out.println("Invalid input");
        }
        return ans;
    }
}
