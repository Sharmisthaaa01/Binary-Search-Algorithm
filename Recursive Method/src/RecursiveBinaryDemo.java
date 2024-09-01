
/*       given a sorted array & a target,
    find the target whether it is there in the array or not
    in Recursive Method
   arr[] = {2 4 5 7 15 20 24 45 50 77}

   here, target = 24
 */

import java.util.Arrays;

import java.util.Arrays;

// Main class
public class RecursiveBinaryDemo {

    // Function declaration
    public static boolean RecursiveBinaryElement(int[] arr, int start, int end, int target) {
        // Base case
        if (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                return RecursiveBinaryElement(arr, start, mid - 1, target);
            } else {
                return RecursiveBinaryElement(arr, mid + 1, end, target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 15, 20, 24, 45, 50, 77};
        int target = 24;

        // Capture the result of the recursive binary search
        boolean isFound = RecursiveBinaryElement(arr, 0, arr.length - 1, target);

        // Print the result
        if (isFound) {
            System.out.println("Target " + target + " is found in the array.");
        } else {
            System.out.println("Target " + target + " is not found in the array.");
        }
    }
}
