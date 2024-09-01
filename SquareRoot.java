
/*
    Find the square root of the given non-negative element x,
    Round it off to the nearest floor integer vale.

    INPUT: X=4
    OUTPUT: 2

    INPUT: X=11
    OUTPUT: 3
 */

public class SquareRoot {

    public static int FindSquareRoot(int x){

        int start = 0, end = x;

        int answer = -1;
        while(start <= end){
            int mid = (start + end)/2;
            int val = mid * mid;


            if(val == x){
                return mid;
            } else{
                if(val < x){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        int x = 9 ;
        System.out.println(FindSquareRoot(x));

    }
}
