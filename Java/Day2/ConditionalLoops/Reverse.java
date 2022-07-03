<<<<<<< HEAD
package ConditionalLoops;

public class Reverse {
    public static void main(String[] args) {
        int num = 23456;
        int ans = 0;
        while(num>0){
            int rem = num % 10;
            num /=10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
=======
package ConditionalLoops;

public class Reverse {
    public static void main(String[] args) {
        int num = 23456;
        int ans = 0;
        while(num>0){
            int rem = num % 10;
            num /=10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
>>>>>>> 9b97bfd1abcfe8f84b276aa623865b7fabb1d556
