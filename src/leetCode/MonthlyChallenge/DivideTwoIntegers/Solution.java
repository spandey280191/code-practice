package leetCode.MonthlyChallenge.DivideTwoIntegers;

public class Solution {

    public int divide(int dividend, int divisor) {
        long result = divideHelper(dividend, divisor);
        return result > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)result;
    }

    public long divideHelper(long dividend, long divisor){

        boolean isNegative=false;
        if(dividend < 0  || divisor <0){
            isNegative=true;
            if(dividend < 0  && divisor <0){
                isNegative=false;
            }
            dividend=Math.abs(dividend);
            divisor=Math.abs(divisor);
        }

        if(dividend<divisor){
            return 0;
        }
        if(dividend>0 && divisor==1){
            if(isNegative){
                return -1*dividend;
            }else{
                return dividend;
            }
        }
        long result=1;
        long sum=divisor;
        while((sum+sum)<=dividend){
            sum=sum+sum;
            result=result+result;
        }

        while((divisor+sum)<=dividend){
            sum=sum+divisor;
            result++;
        }

        if(isNegative){
            return -1*result;
        }else{
            return result;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.divide(-2147483648,-1);
        System.out.println(result);
    }
}
