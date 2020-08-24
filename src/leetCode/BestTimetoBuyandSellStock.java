package leetCode;

class Solution24 {
    public int maxProfit(int[] prices) {
    	
    	if(prices.length==0){
    		return 0;
    	}
        int min=prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
        	
        	if((prices[i]-min) > 0 && profit < (prices[i]-min)){
        		
        		profit = prices[i]-min;
        		
        	}
        	
        	if(min>prices[i]){
        		min = prices[i];
        	}
        	
        }
        
    	return profit;
    }
}
public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		
		Solution24 s = new Solution24();
		int arr[] = {7,1,5,3,6,4};
		System.out.println(s.maxProfit(arr));
	}

}
