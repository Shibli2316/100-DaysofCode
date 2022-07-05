package Arrayss;

public class Basics {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // q: store a name
        String name = "Kunal Kishwaha";

        // Syntax for arrays
        // datatype[] variable_name = new datatype[size]
        //Example: int[] ros = new int[5];
        //or directly: int[] ros2={23, 12, 45, 32, 15}

        int[] ros; // declaration of array defined in stack
        ros = new int[5]; // object being created in the memory (heap)
        System.out.println(ros[1]);

        String[] arr= new String[4];
        System.out.println(arr[0]);
    }
}
