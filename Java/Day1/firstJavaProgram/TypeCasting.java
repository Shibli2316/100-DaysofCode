package firstJavaProgram;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

//        Type Casting
//        int num=(int)(67.43f);
//        System.out.println(num);


//        Automatic type promotion in expression
//        int a = 257;
//        byte b= (byte)(a); //257%256 ==1
//        System.out.println(b); //cant handle more than its max limit
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b)/ c;
//        System.out.println(d);


//        int number = 'A';
//        System.out.println(number);  //Unicode values


        byte b =42;
        char c = 'a';
        short s=1024;
        int i = 50000;
        float f=5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c)-(d-s);
        System.out.println((f*b) + " " + (i/c) + " " + (d-s));
        System.out.println(result);
    }
}
