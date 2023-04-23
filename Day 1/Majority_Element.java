//        Given an array of size N, find the majority element. The majority element is the element that
//        appears more than floor(N/2) times.You may assume that the array is non-empty and the
//        majority element always exist in the array.


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {

        int count1=0, count2=0;
        int ele1=-1, ele2=-1;

        for(int i=0;i<A.size();i++)
        {
            if(count1==0){
                ele1 =A.get(i);
                count1=1;
            }
            else if(count2==0){
                ele2=A.get(i);
                count2=1;
            }
            else if(count1==ele1)
            {
                count1++;
            }else if(count2==ele2)
            {
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        if(count1>count2)
            return ele1;
        else
            return ele2;


    }
}
