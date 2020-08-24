package leetCode;

class Solution13 {
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
        	return dividend;
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
}
public class DivideTwoIntegers {

	public static void main(String[] args) {
		
		Solution13 s = new Solution13();
		System.out.println(s.divide(10,3));

	}

}
