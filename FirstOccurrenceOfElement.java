

/*
    Find the first occurrence of a given element x, given that
    the given array is sorted. If no occurrence of x is found then
    return -1.

    INPUT:
    arr[] = {2,5,5,5,6,6,8,9,9,9}
    x=5

    OUTPUT:
    1
 */

public class FirstOccurrenceOfElement {

    // Function to find the first occurrence of target in sorted array
    public static int FirstOccurrence(int[] arr, int target) {
        int n = arr.length;

        // Two pointers: start and end
        int start = 0, end = n - 1;
        int firstOccurrence = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // Check if the mid-element is the target
            if (arr[mid] == target) {
                firstOccurrence = mid;
                // Move the end pointer left to find earlier occurrence
                end = mid - 1;
            }
            // If the mid-element is less than the target, move start to mid + 1
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            // If the mid-element is greater than the target, move end to mid - 1
            else {
                end = mid - 1;
            }
        }
        return firstOccurrence;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        System.out.println(FirstOccurrence(arr, target)); // Expected Output: 1
    }
}
