package other;
class Solution20 {
    public int[] plusOne(int[] digits) {
    	int temp=0;
    	int carry=0;
    	int length = digits.length;
    	
    	temp = digits[length-1]+1;
    	if(temp>9){
    		carry=1;
    		digits[length-1]=temp%10;
    	}else{
    		digits[length-1]=temp;
    	}
    	for(int i=1;i<length;i++){
    	    temp = digits[length-1-i]+carry;
    	    if(temp>9){
        		carry=1;
        		digits[length-1-i]=temp%10;
        	}else{
        		carry=0;
        		digits[length-1-i]=temp;
        	}
    	}
    	if(carry>0){
    	
    		int ans[] = new int[length+1];
    		ans[0]=carry;
    		for(int j=0;j<length;j++){
    			ans[j+1]=digits[j];
    		}
    		return ans;
    	}else{
    		return digits;
    	}
    }
}
public class PlusOne{
	
	
public static void main(String args[]){
	
	Solution20 s = new Solution20();
    int digits[] = {4,3,2,1};
    int result[] = s.plusOne(digits);
    for(int i=0;i<result.length;i++){
    	System.out.println(result[i]);
    }

}






}
