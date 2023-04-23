//        Given an array of size N, find the majority element. The majority element is the element that
//        appears more than floor(N/2) times.You may assume that the array is non-empty and the
//        majority element always exist in the array.


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {

        int n = A.size();

        int ele = -1;

        int cnt=0;

        for(int i=0;i<n;i++)
        {
            if(cnt==0)
            {
                ele = A.get(i);
                cnt = 1;

            }else if(ele == A.get(i))
            {
                cnt++;
            }else{
                cnt--;
            }
        }

        return ele;


    }
}
