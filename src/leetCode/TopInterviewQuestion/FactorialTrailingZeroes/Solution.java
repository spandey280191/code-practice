package leetCode.TopInterviewQuestion.FactorialTrailingZeroes;

public class Solution {

    public int trailingZeroes(int n) {

        if(n==0){
            return 0;
        }
        long fact = factorial(n);
        System.out.println(fact);
        int count=0;

        while(fact%10==0){
            count++;
            fact=fact/10;
        }

        return count;

    }


    public long factorial(int n){

      long fact=1;

      for(int i=2;i<=n;i++){
          fact = i * fact;
      }

      return fact;
    }


    public static void main(String args[]){
        Solution s = new Solution();
        System.out.println(s.trailingZeroes(50));
    }
}
