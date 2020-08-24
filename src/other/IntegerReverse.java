package other;

class Solution5 {
    public int reverse(int x) {
        long reverse=0;
        int max = Integer.MAX_VALUE;
        boolean isNegative=false;
        if(x<0){
            isNegative=true;
        }
        x=Math.abs(x);
        while(x>0){
            
            reverse=reverse*10 + x%10;
            if(reverse>max){
            	return 0;
            }
            x=x/10;
            
        }
        if(isNegative){
        	reverse = reverse * -1;
        }
       
        
        return (int)reverse;
    }
}

public class IntegerReverse {

	public static void main(String args[]){
		
		Solution5 s  = new Solution5();
		System.out.println(s.reverse(1534236469));
	}
}
