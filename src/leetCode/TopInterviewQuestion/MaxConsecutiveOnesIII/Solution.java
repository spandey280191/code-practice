package leetCode.TopInterviewQuestion.MaxConsecutiveOnesIII;

public class Solution {

    public int longestOnes(int[] nums, int k) {
        int max=0;
        int start=0;
        int count=0;
        for (int end=0;end<nums.length;end++){

            if(nums[end]==1){
                count++;
            }

            if(end-start+1 - count>k){
                if(nums[start]==1){
                    count--;
                }
                start++;
            }


            max= Math.max(max,end-start+1);
        }


        return max;
    }


    public static void main(String args[]){

        Solution s = new Solution();
        int[] nums = {1, 1, 0, 0, 0, 1, 1, 0, 1, 1};
        int result = s.longestOnes(nums,2);
        System.out.println(result);
    }
}
