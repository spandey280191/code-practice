package leetCode.MonthlyChallenge.ValidateStackSequences;

import java.util.Stack;

public class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {


        Stack<Integer> stack = new Stack<>();
        if(pushed.length!=popped.length){
            return false;
        }
        if(pushed.length==0){
            return true;
        }

        int i=0;
        for(int j=0;j<pushed.length;j++)
        {
            if(!stack.isEmpty() && stack.peek()==popped[i]){
                i++;
                stack.pop();
                j--;
            }else{
                stack.push(pushed[j]);
            }



        }

        for(int k=i;k<popped.length;k++)
        {
           if(stack.pop()!=popped[k]){
               return false;
           }
        }
        return true;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a={2,1,0};
        int b[] ={1,2,0};
        boolean result = s.validateStackSequences(a,b);
        System.out.println(result);
    }
}
