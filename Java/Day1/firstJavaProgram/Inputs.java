package firstJavaProgram;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
//        System.out.print("Please enter your roll number: ");
//        int rollno = input.nextInt();
//        System.out.println("Your roll number is " + rollno);
//        int a=234_000_000;
//        System.out.println(a);


//        If u want one word
//        String name = input.next();
//        System.out.println(name);

        //if you want the whole line
//        String names = input.nextLine();
//        System.out.println(names);

//        if u want float use it will round off and generally give floating point error
        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
