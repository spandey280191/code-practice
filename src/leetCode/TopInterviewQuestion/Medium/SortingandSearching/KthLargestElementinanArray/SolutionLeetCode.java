package leetCode.TopInterviewQuestion.Medium.SortingandSearching.KthLargestElementinanArray;

public class SolutionLeetCode {

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return partition(nums, 0, n - 1, nums.length - k);
    }
    public int partition(int[] nums, int start, int end, int k) {
        if (start == end){
            return nums[k];
        }
        int left = start, right = end;
        int pivot = nums[(start + end) / 2];

        while (left <= right){
            while(left <= right && nums[left] < pivot){
                left++;
            }
            while(left <= right && nums[right] > pivot){
                right--;
            }
            if(left <= right){
                swap(nums,left, right);
                left++;
                right--;
            }
        }
        if(k <= right){
            return partition(nums,start,right,k);
        }
        if(k >= left){
            return partition(nums,left,end,k);
        }
        return nums[k];
    }
    public void swap(int[] nums,int x,int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public static void main(String[] args) {
        SolutionLeetCode s = new SolutionLeetCode();
        int[] arr = {3,2,3,1,2,4,5,5,6};
        System.out.println(s.findKthLargest(arr,4));
    }
}
