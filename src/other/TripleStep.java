package other;

import java.util.Arrays;
import java.util.Date;

// CTCI 8.1
public class TripleStep {

	//recursive
	public int coutWays(int n){
		
		if(n<0){
			return 0;
		}
		if(n==1){
			return 1;
		}else{
			return coutWays(n-1)+coutWays(n-2)+coutWays(n-3);
		}
		
	}
	
	//iterative
	int countIterative(int n){
		int memo[] = new int[n+1];
		Arrays.fill(memo, -1);
		return calculateIterative(n, memo);
		
	}
	
	int calculateIterative(int n , int memo[]){
		
		if(n<0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		if(memo[n]>-1)
		{
			return memo[n];
		}
		else{
			memo[n] = calculateIterative(n-1,memo)+calculateIterative(n-2,memo)+calculateIterative(n-3,memo);
		}
		
		return memo[n];
	}
	
//	public 
	
	public static void main(String args[]){
		
		TripleStep t = new TripleStep();
		System.out.println(new Date(System.currentTimeMillis()));
		System.out.println(t.coutWays(37));
		System.out.println(new Date(System.currentTimeMillis()));
		System.out.println(new Date(System.currentTimeMillis()));
		System.out.println(t.countIterative(37));
		System.out.println(new Date(System.currentTimeMillis()));
	}

}


