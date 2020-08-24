package hackerRank.HackerRankCertificateQuestion;

import java.util.ArrayList;
import java.util.List;


public class BalancedFileSystem {

	
	
	int  mostBalancedPartition(List<Integer> parent, List<Integer> files_size) {
		
		int[] max_sum = new int[parent.size()];
		
		for(int i=0;i<parent.size();i++){
			
			max_sum[i] = max_sum[i] + files_size.get(i);
			int temp=parent.get(i);
			while(temp!=-1){
				max_sum[temp] = max_sum[temp] + files_size.get(i);
				temp=parent.get(temp);
			}
			
		}
		int min_sum = Math.abs(max_sum[0] - 2*max_sum[1]);
		for(int i=2;i<parent.size();i++){
			if(min_sum > Math.abs(max_sum[0] - 2*max_sum[i])  ){
				min_sum = Math.abs(max_sum[0] - 2*max_sum[i]);
			}
		}
		return min_sum;
		 
	 }
	 
	 
	 public static void main(String args[]){
		 
		 BalancedFileSystem b = new BalancedFileSystem();
		 
		 List<Integer> parent = new ArrayList<Integer>();
		 List<Integer> files_size = new ArrayList<Integer>();
		 
		 parent.add(-1);
		 parent.add(0);
		 parent.add(0);
		 parent.add(0);
//		 parent.add(1);
//		 parent.add(2);
		 
		 files_size.add(10);
		 files_size.add(11);
		 files_size.add(10);
		 files_size.add(10);
//		 files_size.add(1);
//		 files_size.add(1);
		 
		System.out.println(b.mostBalancedPartition(parent, files_size));

	 }
}
