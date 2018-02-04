package practice;
/*
Given n doors and n persons. The doors are numbered from 1 to n and persons are given id’s numbered from 1 to n. Each door can have only two statuses ie open (1) or closed (0) . Initially all the doors have status closed. Find the final status of all the doors, when all the persons have changed the status of the doors of which they are authorized. i.e. if status open then change the status to closed and vice versa. A person with id ‘i’ is authorized to change the status of door numbered ‘j’ if ‘j’ is a multiple of ‘i’.
Note: A person has to change the current status of all the doors for which he is authorized exactly once.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoorProblem {

	
public static void main(String args[]){
	
	Scanner scanner = new Scanner(System.in); 
	
	System.out.println("Number of door and person");
	
	int number= (int) scanner.nextInt();
	scanner.close();
	List<Integer> doors = new ArrayList<Integer>(number); 
	
	for(int i=1;i<=number;i++){
		doors.add(0);
	}
	
	for(int i=1;i<=doors.size();i++){
		
      for(int j=1;j<=doors.size();j++){
    	  if(i%j==0){
    		  int value =doors.get(i-1);
    		  if(value == 0){
    			  doors.set(i-1, 1);
    		  }else {
    			  doors.set(i-1, 0);
    		  }
    			  
    	  }
      }
		
		
	}
	
	doors.stream().forEach(i -> System.out.println(i));
	
}
}
