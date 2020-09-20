package leetCode.TopInterviewQuestion.Medium.ArrayAndSorting.LongestPalindromicSubstringSolution;

public class Solution {

    // O(n2) Optimized one
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        String result="";
        for(int i=0;i<s.length();i++){
            int length1 = expandCenter(i,i,s);
            int length2 = expandCenter(i,i+1,s);

            int max = Math.max(length1,length2);
            if (max > end - start) {
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }
        return s.substring(start, end + 1);

        }


    public int expandCenter(int l,int r, String s){

        while(l>=0  && r<s.length() && s.charAt(l)==s.charAt(r)){
        l--;
        r++;

        }

        return r-l-1;
    }


    // Brute Force - Time Limit issue O(n3)
    public String longestPalindromeBruteForce(String s) {

        if(s.length()==1 || s.length()==0){
            return s;
        }
        char arr[] = s.toCharArray();
        String result=String.valueOf(arr[0]);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                String str = s.substring(i,j+1);
                boolean val = isPalindrome(str);
                if(val){
                    if(result.length()<str.length()){
                        result = str;
                    }
                }
            }


        }
        return result;
    }

    public boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        String reverse = sb.reverse().toString();
        if(str.equals(reverse)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){

        Solution s = new Solution();
        String value = s.longestPalindrome("cbbd");
        System.out.println(value);
    }
}
