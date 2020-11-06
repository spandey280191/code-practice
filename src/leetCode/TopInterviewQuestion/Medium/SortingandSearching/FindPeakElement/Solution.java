package leetCode.TopInterviewQuestion.Medium.SortingandSearching.FindPeakElement;

public class Solution {
    public int findPeakElement(int[] nums) {

        if(nums.length==1){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {

            if(i==0 && nums[i]>nums[i+1]){
                return i;
            }else if(i>0 && i==nums.length-1 && nums[i]>nums[i-1]){
                return i;
            }else if(i>0 && i<nums.length-1 && nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                return i;
            }

        }

        return -1;
    }


    //Binary Search Solution
    public int findPeakElementBinarySearch(int[] nums) {
        return search(nums, 0, nums.length - 1);
    }
    public int search(int[] nums, int l, int r) {
        if (l == r)
            return l;
        int mid = (l + r) / 2;
        if (nums[mid] > nums[mid + 1])
            return search(nums, l, mid);
        return search(nums, mid + 1, r);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1};
        s.findPeakElement(nums);
    }
}