package leetCode.MonthlyChallenge.ScoreofParentheses;

import javax.security.auth.callback.CallbackHandler;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://leetcode.com/problems/score-of-parentheses/discuss/141777/C%2B%2BJavaPython-O(1)-Space
public class Solution {


  //Using Stack

    public int scoreOfParenthesesStack(String S) {
        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(cur);
                cur = 0;
            } else {
                cur = stack.pop() + Math.max(cur * 2, 1);
            }
        }
        return cur;
    }
    int scoreOfParentheses(String S) {
        int res = 0, l = 0;
        char[] arr = S.toCharArray();
        for (int i = 0; i < S.length(); ++i) {
            if (arr[i] == '(') l++; else l--;
            if (arr[i] == ')' && arr[i - 1] == '(') res += 1 << l;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int count = s.scoreOfParentheses("(()(()))");
        System.out.println(count);
    }
}
