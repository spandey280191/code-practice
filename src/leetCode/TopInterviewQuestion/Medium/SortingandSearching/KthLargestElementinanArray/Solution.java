package leetCode.TopInterviewQuestion.Medium.SortingandSearching.KthLargestElementinanArray;

class Solution {
    public int findKthLargest(int[] nums, int k) {

        int length = nums.length;
        int result=quickSelect(0,length-1,nums,length-k);

        return  result;
    }

    public int quickSelect(int left, int right,int [] nums , int k_smallest){

        int pivot = partition(left, right-1, right,nums);

        if (pivot == k_smallest) {
            return nums[pivot];
        } else if (k_smallest < pivot) {
            return quickSelect(0, pivot - 1,nums,k_smallest);
        } else {
            return quickSelect(pivot + 1, right,nums,k_smallest);
        }

    }



    public void swap(int[] nums , int l , int r){

        int temp = nums[l];
        nums[l]=nums[r];
        nums[r]=temp;

    }


    public int partition(int left, int right, int pivot_index,int[] nums) {

        int pivot = nums[pivot_index];
        while(left<=right){

            while(left <= right && nums[left]<pivot){
                left++;
            }
            while(left <= right && nums[right]>pivot){
                right--;
            }

            if (left>=right) {
                break;
            }else{
               swap(nums,left,right);
                left++;
                right--;
            }

        }
        swap(nums,left,pivot_index);
        return left;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {99,99};
        System.out.println(s.findKthLargest(arr,1));
    }

}