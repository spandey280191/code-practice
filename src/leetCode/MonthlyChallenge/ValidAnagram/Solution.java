package leetCode.MonthlyChallenge.ValidAnagram;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char a[] = s.toCharArray();
        Arrays.sort(a);
        char b[] = t.toCharArray();
        Arrays.sort(b);
        for(int i=0;i<s.length();i++){

            if(a[i]!=b[i]){
                return false;
            }

        }

        return true;
    }

    public static void main(String args[]){
        Solution s = new Solution();

    }
}
