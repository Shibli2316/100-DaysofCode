<<<<<<< HEAD
package ConditionalLoops;

public class CountNums {
    public static void main(String[] args) {
        int n = 45536;
        int count = 0 ;
        while (n>0){
            int rem = n%10;
            if(rem == 5){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
=======
package ConditionalLoops;

public class CountNums {
    public static void main(String[] args) {
        int n = 45536;
        int count = 0 ;
        while (n>0){
            int rem = n%10;
            if(rem == 5){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
>>>>>>> 9b97bfd1abcfe8f84b276aa623865b7fabb1d556
