package com.company;


class Solution {
    public int mostWordsFound(String[] sentences) {

        int ans=0;

        for(String str: sentences)
        {
            ans = Math.max(ans, str.split(" ").length);
        }

        return ans;

    }
}

public class Main {

    public static void main(String[] args) {

        String[] s = {"please wait", "continue to fight", "continue to win"};
        Solution obj = new Solution();

        System.out.println(obj.mostWordsFound(s));

    }
}
