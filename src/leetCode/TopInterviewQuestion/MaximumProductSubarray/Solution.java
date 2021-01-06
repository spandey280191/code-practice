package leetCode.TopInterviewQuestion.MaximumProductSubarray;

public class Solution {


    //
    public int maxProductIterative(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int maxProduct = nums[0];
        int max_temp = nums[0];
        int min_temp = nums[0];
        for(int i=1;i<nums.length;i++) {
            int a = nums[i]*max_temp;
            int b = nums[i]*min_temp;
            max_temp = Math.max(Math.max(a,b), nums[i]);
            min_temp = Math.min(Math.min(a,b), nums[i]);
            maxProduct = Math.max(maxProduct, max_temp);
        }
        return maxProduct;
    }

    // Recusion Time limit Error
    public int maxProduct(int[] nums) {

        return max(nums,nums[0],nums[0],1);

    }

    public int max(int[] nums , int max, int current , int i){

        if(i==nums.length) {
            if(current>max){
                return current;
            }
            return max;
        }
        if(current>max){
            max=current;
        }
       i = i+1;

       int num1 = max(nums, max,current * nums[i-1],i);
       int num2 = max(nums,max,nums[i-1],i);

        return Math.max(num1,num2);
    }

    public  static  void main(String args[]){

        Solution s = new Solution();
        int[] arr = {2,3,-2,2,2,-12};
        int max = s.maxProduct(arr);
        System.out.println(max);
    }

}
