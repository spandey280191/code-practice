package other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Given an array of items, an i-th index element denotes the item id’s and given a number m, the task is to remove m elements such that there should be minimum distinct id’s left.Print the number of distinct id’s.
Input:
The first line of the input contains a single integer T, denoting the number of test cases. Then T test case follows, the three lines of the input, the first line contains N, denoting number of elements in an array,second line contains N elements/ids, and third line contains the number M.
Output:
For each test case, print the minimum number of distinct ids.
 */
public class MinimumDistinctIds {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Number of array element");
		
		int number= (int) scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter array element");
		
		String values= scanner.nextLine();
		
		ArrayList<Integer> array = new ArrayList<Integer>(number);
		for(String s:values.split(" ")){
			array.add(Integer.valueOf(s));
		}
		System.out.println("Number of element to remove");
		
		int m= (int) scanner.nextInt();	
		scanner.close();
		
		MinimumDistinctIds minimumDistinctIds = new MinimumDistinctIds();
		int distinctElement=minimumDistinctIds.minimumDistincId(array,m);
		System.out.println("Number of minimum distinct id is " + distinctElement);
	}
	
	public int minimumDistincId(ArrayList<Integer> array,int m){
		

		int minimumCount;
		Integer index;
		for(int k=0;k<m;k++){
			minimumCount=0;
			index=-1;
		for (int i : array) {

			int count = 0;

			for (int j : array) {
				if (j == i) {
					count++;
				}
			}
			
			if(minimumCount==0 || minimumCount>count){
				minimumCount=count;
				index=i;
			}
		}
		
		
	     array.remove(index);
		}
		
		Set<Integer> set=new HashSet<Integer>(array);
		return set.size();
	}
}
