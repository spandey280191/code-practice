package leetCode.TopInterviewQuestion.Medium.BackTracking.GenerateParentheses;

import java.util.*;

public class Solution {


    //Optimized with open and close bracket count
    public List<String> generateParenthesisOptimized(int n) {
        List<String> ans = new ArrayList();
        backtrackOptimized(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrackOptimized(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrackOptimized(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrackOptimized(ans, cur+")", open, close+1, max);
    }

    //Backtracking Solution bracket count
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        backtrack(list, "", n);

        Set<String> ans = new HashSet<>();
        for(String s : list){

            boolean val = isValid(s);
            if(val){
                ans.add(s);
            }

        }
        List r = new ArrayList(ans);
        System.out.println(r.size());
        return r;
    }

    public void backtrack(List<String> ans, String cur, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

            backtrack(ans, cur+"(", max);
            backtrack(ans, cur+")", max);
    }

    // iterative solution - what I could think of
    public List<String> generateParenthesisIterate(int n) {

        List<String> result = new ArrayList<>();

        for(int i=0;i<n*2;i++){
            List<String> list = new ArrayList<>(result);
            result = new ArrayList<>();
            if(list.isEmpty()){
                result = new ArrayList<>();
                result.add("(");
                result.add(")");
            }else {

                for (String s : list) {
                    result.add(s+"(");
                    result.add(s+")");
                }
            }

        }
        Set<String> ans = new HashSet<>();
        for(String s : result){

            boolean val = isValid(s);
            if(val){
                ans.add(s);
            }

        }
        List r = new ArrayList(ans);
        System.out.println(r.size());
        return r;

    }


    public boolean isValid(String s) {

        Stack<String> stack = new Stack<>();
        String arr[] = s.split("");

        for (int i = 0; i < arr.length; i++) {

            switch (arr[i]) {
                case "(":
                    stack.push(")");
                    break;
                case ")":
                    if (stack.size()==0 || !stack.pop().equals(")"))
                        return false;
                    break;
            }


        }
        if(stack.size()!=0){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
      //  s.generateParenthesis(7);
        s.generateParenthesisIterate(7);
    }
}
