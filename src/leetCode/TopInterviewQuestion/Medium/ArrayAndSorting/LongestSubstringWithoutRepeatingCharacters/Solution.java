package leetCode.TopInterviewQuestion.Medium.ArrayAndSorting.LongestSubstringWithoutRepeatingCharacters;

import java.sql.SQLOutput;
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        List<Character> set = new ArrayList<Character>();
        char[] arr = s.toCharArray();
        int max=-1;
        while(l<=r && r < s.length()){

            if(set.contains(arr[r])){

                if(max<set.size()){
                    max=set.size();
                }
                int k=0;
                while(!set.get(k).equals(arr[r])){
                    set.remove(set.get(k));
                    l++;
                }
                set.remove(k);
                l++;
            }
            set.add(arr[r]);
            r++;

        }

        if(max<set.size()){
            max=set.size();
        }

        return max;

    }

    // Optimized n complexity
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
    // Optimized 2n complexity
    public int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String args[]){

        Solution s = new Solution();
        System.out.println( s.lengthOfLongestSubstring2("abba"));
       // System.out.println( s.lengthOfLongestSubstring("aab"));
    }


}