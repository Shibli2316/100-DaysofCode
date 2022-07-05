package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr ={22, 11, 9, 3, 1};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
//        Find weather the arr is in ascending or descending
        boolean isAsc = arr[start] < arr[end];


        while(start<=end){
//            Find the middle element
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid +1;
                }
            } else {
                if(target>arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
