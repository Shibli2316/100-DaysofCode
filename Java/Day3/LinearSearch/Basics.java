package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to check for:");
        int target = in.nextInt();
        int[] nums ={23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        System.out.println(Arrays.toString(nums));
//        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    /*
        Search the array: return the index if item found
        else return -1
         */
    static int linearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
//        run a for loop
        for (int index = 0; index < arr.length; index++) {
//            Check for element at every index if it is target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
//        This line will execute when none of the above has been executed
        return -1;
    }

//    Search the target and return the element itself
    static int linearSearch2(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
//        run a for loop
        for (int element: arr) {
            if (element == target) {
                return element;
            }
        }
//        This line will execute when none of the above has been executed
        return -1;
    }

//    Search the  target and return true or false
static boolean linearSearch3(int[] arr, int target){
    if (arr.length==0){
        return false;
    }
//        run a for loop
    for (int index = 0; index < arr.length; index++) {
//            Check for element at every index if it is target
        int element = arr[index];
        if(element==target){
            return true;
        }
    }
//        This line will execute when none of the above has been executed
    return false;
}
}
