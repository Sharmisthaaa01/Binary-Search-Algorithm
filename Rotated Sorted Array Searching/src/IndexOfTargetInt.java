
/*
   Search element in rotated sorted array with duplicate elements.
   Return true if the element is found, else return false.

   INPUT: [0,0,0,1,1,1,2,0,0,0], target = 2
   OUTPUT: true

 */

public class IndexOfTargetInt {

    public static boolean FoundElement(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If the middle element is the target
            if (arr[mid] == target) {
                return true;
            }

            // When the left half is sorted
            if (arr[start] < arr[mid]) {
                // Check if the target is within the sorted left half
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // When the right half is sorted
            else if (arr[mid] < arr[end]) {
                // Check if the target is within the sorted right half
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // Handling duplicates: arr[start] == arr[mid] == arr[end]
            else {
                if (arr[start] == arr[mid]) {
                    start++;
                }
                if (arr[end] == arr[mid]) {
                    end--;
                }
            }
        }
        return false;  // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 1, 2, 0, 0, 0};
        int target = 2;
        System.out.println(FoundElement(arr, target));
    }
}

