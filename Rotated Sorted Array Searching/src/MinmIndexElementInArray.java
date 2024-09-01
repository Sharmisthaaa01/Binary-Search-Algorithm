
/*
   A rotated sorted array is a sorted array on which rotation operation
   has been performed some number of times. Given a rotated sorted array, find the
   index of the minimum element in the array.

   Follow 0-Based indexing. It is guaranteed that
   all the elements in the array are unique.

   INPUT: Array =[3,4,5,1,2]
   OUTPUT: 3

 */

public class MinmIndexElementInArray {

    public static int MinimumIndexElement(int [] arr){
        int n = arr.length;
        int ans = -1;
        int start = 0, end = n-1;
        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid] > arr[n - 1]){
                start = mid + 1;

            } else if(arr[mid] <= arr[n - 1]){
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {

        int [] arr ={3,4,5,1,2};
        int target = 1;
        System.out.println(MinimumIndexElement(arr));

    }
}
