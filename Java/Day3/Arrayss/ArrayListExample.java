package Arrayss;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(67);
//        list.add(22);
//        list.add(22);
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list.contains(67));

        for (int i = 0; i <10; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i <10; i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println(list);
    }
}
