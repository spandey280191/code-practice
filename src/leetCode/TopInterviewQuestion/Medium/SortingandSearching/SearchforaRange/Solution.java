package leetCode.TopInterviewQuestion.Medium.SortingandSearching.SearchforaRange;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums.length == 0) {
            return result;
        }
        int search = search(0, nums.length - 1, nums, target);
        int start = -1;
        int end = -1;
        if (search != -1) {
            start = search;
            end = search;
            while (start >= 0 && nums[start] == target) {
                start--;
            }
            while (end < nums.length && nums[end] == target) {
                end++;
            }
            start++;
            end--;
        }

        result[0] = start;
        result[1] = end;

        return result;
    }

    public int search(int left, int right, int[] nums, int target) {
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (left == right) {
            return -1;
        }
        if (nums[mid] > target) {
            return search(left, mid , nums, target);
        } else {
            return search(mid + 1, right, nums, target);
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] arr = {2,2};
        System.out.println(s.searchRange(arr, 1));
    }
}
