package LinearSearch;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 18;
        System.out.println(linearSearch(arr, target, 2, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }
//        run a for loop
        for (int index = start; index <= end; index++) {
//            Check for element at every index if it is target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
//        This line will execute when none of the above has been executed
        return -1;
    }
}
