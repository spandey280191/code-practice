package other;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Topology {

	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String inputArr[]=input.split(" ");
		int nodes = Integer.valueOf(inputArr[0]);
		int edges = Integer.valueOf(inputArr[1]);
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		
		for(int i=0;i<edges;i++){
			input = sc.nextLine();
			String edgesArr[]=input.split(" ");
			int edge1= Integer.valueOf(edgesArr[0]);
			int edge2 = Integer.valueOf(edgesArr[1]);
			
			if(map.get(edge1)!=null){
				map.put(edge1,map.get(edge1)+1);
			}else{
				map.put(edge1,1);
			}
			
			if(map.get(edge2)!=null){
				map.put(edge2,map.get(edge2)+1);
			}else{
				map.put(edge2,1);
			}
		}
		
		//find topology
		
		int nodesWithOneDegree=0;
		int nodesWithTwoDegree=0;
		int nodesWithNDegree=0;
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()){
			int value = it.next();
					if(map.get(value)==1){
						nodesWithOneDegree+=1;
					}else if(map.get(value)==2){
						nodesWithTwoDegree+=1;
					}else if(map.get(value)==(nodes-1)){
						nodesWithNDegree+=1;
						
					}
				}
		
		if(nodesWithOneDegree==2 && nodesWithTwoDegree==nodes-2){
			System.out.println("bus");
		}else if(nodesWithTwoDegree==nodes){
			System.out.println("Ring");
		}else if(nodesWithNDegree==1 && nodesWithOneDegree==nodes-1){
			System.out.println("Start");
		}else{
			System.out.println("unknown");
		}
		
	sc.close();
	}
	
}
