package leetCode;
import java.util.HashSet;

class Solution1 {
    public int lengthOfLongestSubstring(String s) {
    	 int l=0,r=0,min=0, lenght = s.length();
         
         if(s.length()==0){
      	   return 0;
         }
         
         
         HashSet<Character> set = new HashSet<Character>();
         
         while (l<lenght && r<lenght){
      	   
      	   if(!set.contains(s.charAt(r))){
      		   set.add(s.charAt(r++));
      		  min = Math.max(min,r-l);
      	   }else{
      		   set.remove(l++);
      	   }
      	 
      	   
         }
         
         return min;
    }
}


//public class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//        Set<Character> set = new HashSet<>();
//        int ans = 0, i = 0, j = 0;
//        while (i < n && j < n) {
//            // try to extend the range [i, j]
//            if (!set.contains(s.charAt(j))){
//                set.add(s.charAt(j++));
//                ans = Math.max(ans, j - i);
//            }
//            else {
//                set.remove(s.charAt(i++));
//            }
//        }
//        return ans;
//    }
//}
public class LongestSubstringWithoutRepeatingCharacters {
	
	
	public static void main(String args[]){
		
	Solution1 s = new Solution1();
	System.out.println(s.lengthOfLongestSubstring("pwwkew"));
	}
	
}