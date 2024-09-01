
/*       given a sorted array & a target,
    find the target whether it is there in the array or not
   arr[] = {2 4 5 7 15 20 24 45 50 77}

   here, target = 24
 */

// Java Program to demonstrate working of binarySearch()
// Method of Arrays class In a sorted array

// Importing required classes
import java.util.Arrays;

// Main class
public class BinarySearchDemo {

//    function declaration
    public static boolean BinarySearchElement(int[] arr, int target) {
        int n = arr.length;

//        define two pointers
        int start = 0, end = n - 1;  //0 based indexing
        while (start <= end) {
            int mid = (start + end) / 2;

//            now the three conditions for arr[] & target
            if (arr[mid] == target) {
                return true;
            }else{
                if (arr[mid] > target) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
//        if none of the above conditions satisfies, then we exit the loop as-
        return false;
    }
    public static void main(String[] args) {

        int [] arr ={2, 4, 5, 7, 15, 20, 24, 45, 50, 77};
        int target = 24;
        System.out.println(BinarySearchElement(arr, target));

    }
}



