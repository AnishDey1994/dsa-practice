//Given an array A of length N, your task is to find the maximum possible sum of any non-empty contiguous subarray.
//
//In other words, among all possible subarrays of A, determine the one that yields the highest sum and return that sum.

package oneD_array;

public class MaxSumContiguousSubarray {
    public int solve(final int[] A) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0; i < A.length; i++){
            sum = sum + A[i];
            max_sum = Math.max(sum, max_sum);

            if(sum < 0){
                sum = 0;
            }
        }

        return max_sum;
    }


    public static void main(String[] args) {
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaxSumContiguousSubarray obj = new MaxSumContiguousSubarray();

        System.out.println("Ans: " + obj.solve(A));
    }
}
