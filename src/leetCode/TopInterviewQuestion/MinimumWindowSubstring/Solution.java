package leetCode.TopInterviewQuestion.MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {

        String result="";
        int match=0;
        int start=0;
        int string_start=0;
        Map<Character,Integer> frequency = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            frequency.put(t.charAt(i),frequency.getOrDefault(t.charAt(i),0)+1);
        }

        for(int end=0;end<s.length();end++){
            char ch = s.charAt(end);

            if (frequency.containsKey(ch)){
                frequency.put(ch,frequency.get(ch)-1);
                if(frequency.get(ch)>=0){
                    match++;
                }

            }

            while (match==t.length()){
                if(end-start+1 < min){
                    min = end-start+1;
                    string_start=start;
                }

                char left = s.charAt(start);
                start++;

                if(frequency.containsKey(left)){

                    if(frequency.get(left)==0){
                        match--;
                    }

                    frequency.put(left,frequency.get(left)+1);
                }



            }



        }

        return min>s.length()?"":s.substring(string_start,string_start+min);

    }

    public static void main(String args[]){
        Solution s = new Solution();
        System.out.println(s.minWindow("adcad","abc"));
    }
}
