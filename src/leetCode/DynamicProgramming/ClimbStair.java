package leetCode.DynamicProgramming;

public class ClimbStair {
	 public int climbStairs(int n) {
	        
	        if(n==1){
	            return 1;
	        }
	        if(n==2){
	        	return 2;
	        }
	      
	        int count = climbStairs(n-1) + climbStairs(n-2); 
	        return count;
	        
	    }
	 
	 //recurrsion
	 
	  public int climbStairs_recurrsion(int n) {
	        return climb_Stairs(0, n);
	    }
	    public int climb_Stairs(int i, int n) {
	        if (i > n) {
	            return 0;
	        }
	        if (i == n) {
	            return 1;
	        }
	        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
	    }
	 
	 public static void main(String args[]){
		 ClimbStair s = new ClimbStair();
		 int count = s.climbStairs(5);
		 s.climbStairs_recurrsion(5);
		 System.out.println(count);
		 
	 }
}
