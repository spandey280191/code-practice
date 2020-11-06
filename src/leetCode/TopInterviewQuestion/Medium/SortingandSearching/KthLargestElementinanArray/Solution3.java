package leetCode.TopInterviewQuestion.Medium.SortingandSearching.KthLargestElementinanArray;

class Solution3 {
    public int findKthLargest(int[] nums, int k) {

        int length = nums.length;
        int result=partition(0,length-1,nums,length-k);

        return  result;
    }

    public void swap(int[] nums , int l , int r){

        int temp = nums[l];
        nums[l]=nums[r];
        nums[r]=temp;

    }


    public int partition(int left, int hi,int[] nums,int k_smallest) {

        int start=left;
        int end=hi;
        int pivot = nums[hi];
        int right = hi-1;
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
        swap(nums,left,hi);
        if (left == k_smallest) {
            return nums[k_smallest];
        }else if (k_smallest < left) {
            return partition(start, left - 1,nums,k_smallest);
        } else {
            return partition(left + 1, end,nums,k_smallest);
        }

    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[] arr = {3,2,3,1,2,4,5,5,6};
        System.out.println(s.findKthLargest(arr,4));
    }

}