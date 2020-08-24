package other;

import java.util.Scanner;

public class ExtractNumberFromString {

	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter Line with numers");
		
		String str = scanner.nextLine();
		scanner.close();
		Object [] obj = new Object[10];
		obj=str.split(" ");
		
		str = str.replaceAll("[A-Za-z]","");
		str = str.replaceAll("\\W+"," ");
		str=str.trim();
		System.out.println(str);
		
		for(int i=0;i<obj.length;i++){
			
			if(obj[i] instanceof Number){
				System.out.println(obj[i]);
			}
		}
	}

	
}
