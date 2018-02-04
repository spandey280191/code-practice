package practice;

import java.util.Scanner;

/*
Davis who has number of scanners in his shop select only two scanners to scan the documents of a customer. When a customer comes to his shop he knows three parameters S1, S2 and N.  S1 and S2 are the time taken by scanner 1 and scanner 2 to scan one document respectively And N is the number of documents given by the customer. As he is suppose to entertain a number of customers, he wants to calculate the minimum time to scan all the N documents using those two scanners.
Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains three space separated integers S1, S2 and N.
Output:
In new line, print the minimum time required
 */
public class FindMinimumTime {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("input scanner time for s1, s2 and number of documnet space separated");
		
		String data=scanner.nextLine();
		String[] dataValue= data.split(" ");
		int s1 = Integer.valueOf(dataValue[0]);
		int s2 = Integer.valueOf(dataValue[1]);
		int n = Integer.valueOf(dataValue[2]);
		scanner.close();
		
		FindMinimumTime findMinimumTime = new FindMinimumTime();
		findMinimumTime.calcuateMinimuTime(s1, s2, n);
	}
	
	public int calcuateMinimuTime(int s1,int s2,int n){
		
		int maxtime = s1>s2?n*s1:n*s2;
		int minimumTime=0;
		int numberOfDocS1 = 0;
		int numberOfDocS2 = 0;
		for(int i=0;i<=maxtime;i++){
		
			if(n==0){
				break;
			}
			if((i==0 || i%s1==0) && n>0 ){
				numberOfDocS1=numberOfDocS1+1;
				n--;
			}
			if((i==0 || i%s2==0) && n>0){
				numberOfDocS2=numberOfDocS2+1;
				n--;
			}
		}
		
		if((numberOfDocS1*s1) == (numberOfDocS2*s2)){
			minimumTime = (numberOfDocS1*s1);
		}else if((numberOfDocS1*s1) > (numberOfDocS2*s2)){
			minimumTime = ((numberOfDocS1*s1) - (numberOfDocS2*s2)) + (numberOfDocS2*s2);
		}else if((numberOfDocS1*s1) < (numberOfDocS2*s2)){
			minimumTime = ((numberOfDocS1*s2) - (numberOfDocS2*s1)) + (numberOfDocS2*s1);
		}
		System.out.println("minimumTime required = "+ minimumTime);
		return minimumTime;
	}
}
