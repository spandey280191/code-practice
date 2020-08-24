package leetCode;
class Solution4 {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxStart = 0;
        int maxEnd = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() - i; j++) {
                if (i == 0 || (s.charAt(j) == s.charAt(j + i) && (i == 1 || dp[j + 1][j + i - 1]))) {
                    dp[j][j + i] = true;
                    maxStart = j;
                    maxEnd = j + i;
                }
            }
        }        
        return s.substring(maxStart, maxEnd + 1);
    }
}

public class LongestPalindrome {

	public static void main(String args[]){
		Solution4 s = new Solution4();
		System.out.println(s.longestPalindrome("aaabaaaa"));
	}
}
