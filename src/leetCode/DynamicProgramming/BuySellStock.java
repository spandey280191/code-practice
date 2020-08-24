package leetCode.DynamicProgramming;

public class BuySellStock {

	//Brute Force
	 public int maxProfit_bruteforce(int[] prices) {
	        
	       int max_profit=0;
	       for(int i=0;i<prices.length;i++){
	           
	           for(int j=i+1;j<prices.length;j++){
	            
	               if(prices[j]-prices[i]>max_profit){
	                   max_profit=prices[j]-prices[i];
	               }
	           
	       }
	       }
	        
	        return max_profit;
	        
	    }
	 
	  public int maxProfit(int prices[]) {
	        int minprice = Integer.MAX_VALUE;
	        int maxprofit = 0;
	        for (int i = 0; i < prices.length; i++) {
	            if (prices[i] < minprice)
	                minprice = prices[i];
	            else if (prices[i] - minprice > maxprofit)
	                maxprofit = prices[i] - minprice;
	        }
	        return maxprofit;
	    }
}
