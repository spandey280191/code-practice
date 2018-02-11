package practice;
/*
Given an input stream of n integers the task is to insert integers to stream and print the median of the new stream formed by each insertion of x to the stream.

Example

Flow in stream : 5, 15, 1, 3 
5 goes to stream --> median 5 (5)
15 goes to stream --> median 10 (5, 15)
1 goes to stream --> median 5 (5, 15, 1)
3 goes to stream --> median 4 (5, 15, 1, 3)

Input:
The first line of input contains an integer N denoting the no of elements of the stream. Then the next N lines contains integer x denoting the no to be inserted to the stream.

Output:
For each element added to the stream print the floor of the new median in a new line.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindMedianInAStream {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Number of element in stream");
		int size= (int) scanner.nextInt();
		
		List<Integer> stream = new ArrayList<Integer>(size);
		List<Integer> median = new ArrayList<Integer>(size);
		System.out.println("Enter numers");
		FindMedianInAStream findMedianInAStream = new FindMedianInAStream();
		for(int i = 0; i<size;i++){
			int number= (int) scanner.nextInt();
			stream.add(number);
			median.add(findMedianInAStream.calculateMedian(stream));
		}
		
		scanner.close();
		median.forEach(x -> System.out.println(x));
	}
	
	public Integer calculateMedian(List<Integer> stream){
	
		Collections.sort(stream);
		int numberOfElement=stream.size();
		boolean isOdd = isOdd(numberOfElement); 
		Integer result=null;
		if(isOdd){
			if(numberOfElement==1){
				result = stream.get(0);
			}else{
				int medianIndex = (numberOfElement+1)/2;
				result = stream.get(medianIndex-1);
			}
		
		}else{
			int medianIndex = (numberOfElement)/2;		
			result = (stream.get(medianIndex-1) + stream.get(medianIndex))/2;
		}
		
		return result;
	}
	
	public boolean isOdd(int number){
		
		return number%2==0?false:true;
	}
	
	
}
