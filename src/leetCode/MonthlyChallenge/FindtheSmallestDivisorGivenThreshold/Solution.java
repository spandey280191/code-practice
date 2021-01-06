package leetCode.MonthlyChallenge.FindtheSmallestDivisorGivenThreshold;

import java.util.Arrays;

public class Solution {

    /**
     *  Time Limit Exceeded Solution
     * @param nums
     * @param threshold
     * @return
     */
    /*
    public int smallestDivisor(int[] nums, int threshold) {

        int result = Integer.MAX_VALUE;
        int length=nums.length;
        int j=1;

        while(result>threshold){
            result=0;
            for(int i=0;i<length;i++){
                result = result + (int)Math.ceil((double)nums[i]/(double)j);
            }
            j++;

        }



        return j-1;

    }*/


        public int smallestDivisor(int[] nums, int threshold) {
            Arrays.sort(nums);
            int result = 0;
            int length=nums.length;
            int j=nums[length-1]/2;
            j = search(nums,j,length,threshold);

            while(j>0 && result<=threshold){
                j--;
                result=0;
                for(int i=0;i<length;i++){
                    result = result + (int)Math.ceil((double)nums[i]/(double)j);
                }
            }

            return j+1;

        }

        public int search(int[] nums , int j, int length,int threshold){
            int result=0;
            for(int i=0;i<length;i++){
                result = result + (int)Math.ceil((double)nums[i]/(double)j);
            }
            if(result>threshold){
                j = j + (threshold-j)/2;
                j = search(nums,j,length,threshold);
            }else{
                return j;
            }

            return j;
        }

    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {962551,933661,905225,923035,990560};
        System.out.println(s.smallestDivisor(arr,10));
    }
}