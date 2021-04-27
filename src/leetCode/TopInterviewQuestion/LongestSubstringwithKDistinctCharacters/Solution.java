package leetCode.TopInterviewQuestion.LongestSubstringwithKDistinctCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int longestSubString(String str,int k){
        int max=Integer.MIN_VALUE;
        int start=0;
        int length = str.length();
        Map<Character,Integer> map = new HashMap<>();
       for(int end=0;end<length;end++){

           map.put(str.charAt(end) , map.getOrDefault(str.charAt(end),0)+ 1);
           while (map.size()>k){
               Character left = str.charAt(start);
               map.put(left,map.getOrDefault(left,1)-1);
               if(map.get(left)==0){
                   map.remove(left);
               }
               start++;
           }

           max = Math.max(max,end-start+1);

       }




        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "araaci";
        System.out.println(s.longestSubString(str,1));

    }
}
