package ConditionalLoops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        if (a>b){
//            if(a>c){
//                System.out.println("Max is a");
//            }else if(c>b){
//                System.out.println("Max is c");
//            }
//        }else if(b>c){
//            System.out.println("Max is b");
//        }else{
//            System.out.println("Max is c");
//        }

        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println(max);
    }
}
