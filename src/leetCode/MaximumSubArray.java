package leetCode;

class Solution2 {
    public int maxSubArray(int[] nums) {
        int max_current=nums[0];
        int max_so_far=nums[0];
        for(int i=1;i<nums.length;i++){
            
            max_current = Math.max(nums[i], max_current + nums[i]);
            max_so_far = Math.max(max_so_far, max_current);
            
        }
        
        return max_so_far;
    }
}

public class MaximumSubArray {

	public static void main(String args[]){
		
		int a[] = {-2,1,-3,4,-1,2,1,-5,4};

		Solution2 s = new Solution2();
		s.maxSubArray(a);
	}
	
}
