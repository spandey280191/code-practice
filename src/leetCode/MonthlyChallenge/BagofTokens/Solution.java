package leetCode.MonthlyChallenge.BagofTokens;

import java.util.Arrays;

public class Solution {

    public int bagOfTokensScore(int[] tokens, int P) {

        int max_score=0;
        int score=0;
        int left =0;
        int right= tokens.length-1;
        Arrays.sort(tokens);

        if(tokens.length==1){

            if(P>tokens[0]){
                return 1;
            }

        }

        while(left<right){

            while(P>=tokens[left]){
                score++;
                P = P - tokens[left];
                left++;
            }

            if(score>max_score){
                max_score = score;
            }
            if(left<right && score>0){

                P = P + tokens[right];
                right--;
                score--;

            }else {
                right--;
            }


        }

        if(score>max_score){
            max_score = score;
        }

        return max_score;


    }

   /* public int bagOfTokensScore(int[] tokens, int P) {

        return 0;
    }

    public int calculate(int[] tokens, int P, int i, int current_score, int max_score) {

        if (i >= tokens.length) {
            return current_score;
        }

        int score1 = 0;

        int score3 = calculate(tokens, i + 1, P, current_score, max_score);
        P = P - tokens[i];
        current_score++;
        score1 = calculate(tokens, i + 1, P, current_score, max_score);


        P = P + tokens[i];
        current_score--;
        int score2 = calculate(tokens, i + 1, P, current_score, max_score);

        return Math.max(score1, score2,score3);

    }*/

    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {71, 55, 82};
        System.out.println(s.bagOfTokensScore(arr, 54));

    }
}