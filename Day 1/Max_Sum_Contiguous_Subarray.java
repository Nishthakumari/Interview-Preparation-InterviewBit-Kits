//Find the contiguous subarray within an array, A of length N which has the largest sum.

public class Solution {

    public int maxSubArray(final int[] A) {

        //Kadane Algorithm

        int max_ending_here=0, max_so_far=Integer.MIN_VALUE;

        for(int i=0;i<A.length;i++)
        {
            max_ending_here += A[i];

            if(max_ending_here>max_so_far)
            {
                max_so_far = max_ending_here;
            }

            if(max_ending_here<0)
                max_ending_here=0;
        }

        return max_so_far;


    }
}
