package leetCode.DynamicProgramming;

public class MaximumSubArray {

	public int maxSubArray(int[] nums) {

        int l=0,r=0;
        int length = nums.length;
        int max_sum=0;
        int current=nums[0];
        while(r<length){
            
            current=current+nums[r];
            if(max_sum<current){
                max_sum=current;
            }
            if(current<0){
                l++;
            }
            r++;
            
        }
        return max_sum;
        
    }

}
