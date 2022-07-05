package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0]=23;
//        arr[1]=2322;
//        arr[2]=2344;
//        arr[3]=231;
//        arr[4]=203;
////        System.out.println(arr[3]);
//        System.out.println(Arrays.toString(arr));

//        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=in.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }
//        for (int j : arr) {  // for every element in array, print the element
//            System.out.print(j + " ");
//        }


        // arrays for objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modifing
        str[1]="Shibli";
        System.out.println(Arrays.toString(str));
    }
}
