package leetCode.sorting;

class Solution21 {
    public void sortColors(int[] nums) {
        
    	int start=0;
    	int length=nums.length;
    	int end=length-1;
    	while(start<length && nums[start]==0){
    		start++;
    	}
    	while(end>=0 && nums[end]==2 ){
    		end--;
    	}
    	for(int i=start;i<length;i++){
    		if(nums[i]==0){
    			swap(nums, i, start);
    			start++;
    		}else if(nums[i]==2 && i<=end){
    			swap(nums, i, end);
    			end--;
    			i--;
    		}
    	}
    	
    	
    }
    
    public void swap(int nums[],int i, int j){
    	int temp = nums[i];
    	nums[i]=nums[j];
    	nums[j]=temp;
    }
}
public class ColorSort {

	public static void main(String[] args) {
		Solution21 s = new Solution21();
		int nums[] = {1,2,0};
		s.sortColors(nums);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}

	}

}
