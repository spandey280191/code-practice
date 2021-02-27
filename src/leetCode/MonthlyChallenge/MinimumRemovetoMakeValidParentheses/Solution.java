package leetCode.MonthlyChallenge.MinimumRemovetoMakeValidParentheses;

import leetCode.TopInterviewQuestion.WordLadder.SolutionTwoWayBFS;

public class Solution {

    public String minRemoveToMakeValid(String s) {

        char arr[] = s.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]=='('){
                count++;
            }else if (arr[i]==')'){
                if(count>0){
                    count--;
                }else{
                    arr[i]='#';
                }
            }


        }
        count=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==')'){
                count++;
            }else if (arr[i]=='('){
                if(count>0){
                    count--;
                }else{
                    arr[i]='#';
                }
            }
        }


        String result= new String(arr);
        result = result.replaceAll("#","");
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minRemoveToMakeValid("))(("));
    }
}
