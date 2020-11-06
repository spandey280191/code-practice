package leetCode.TopInterviewQuestion.Medium.SortingandSearching.SearchinRotatedSortedArray;

public class Solution {

    // Binary Search
    public int search(int[] nums, int target) {
        if (nums.length==0) {
            return -1;
        }
        int begin=0;
        int end=nums.length-1;
        while(begin<=end){
            int middle=(end-begin)/2+begin;
            if (target == nums[middle]) {
                return middle;
            }
            if (nums[begin]<=nums[middle]) {
                if (target >=nums[begin] && target< nums[middle]) {
                    end=middle-1;
                } else {
                    begin=middle+1;
                }
            } else {
                if (target >=nums[begin] || target<nums[middle]) {
                    end=middle-1;
                } else {
                    begin=middle+1;
                }
            }
        }
        return -1;
    }

    // Simple Solution iterator
    public int searchIterator(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){

            if(nums[i]==target){
                return i;
            }
        }
        return -1;

    }
}
