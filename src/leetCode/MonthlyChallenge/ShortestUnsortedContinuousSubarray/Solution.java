package leetCode.MonthlyChallenge.ShortestUnsortedContinuousSubarray;

import leetCode.TopInterviewQuestion.WordLadder.SolutionTwoWayBFS;

import java.util.Arrays;
import java.util.Stack;

public class Solution {



    // Using Sorting

        public int findUnsortedSubarraySorting(int[] nums) {
            int[] snums = nums.clone();
            Arrays.sort(snums);
            int start = snums.length, end = 0;
            for (int i = 0; i < snums.length; i++) {
                if (snums[i] != nums[i]) {
                    start = Math.min(start, i);
                    end = Math.max(end, i);
                }
            }
            return (end - start >= 0 ? end - start + 1 : 0);
        }


    // Stack Solution
        public int findUnsortedSubarrayStack(int[] nums) {
            Stack < Integer > stack = new Stack< Integer >();
            int l = nums.length, r = 0;
            for (int i = 0; i < nums.length; i++) {
                while (!stack.isEmpty() && nums[stack.peek()] > nums[i])
                    l = Math.min(l, stack.pop());
                stack.push(i);
            }
            stack.clear();
            for (int i = nums.length - 1; i >= 0; i--) {
                while (!stack.isEmpty() && nums[stack.peek()] < nums[i])
                    r = Math.max(r, stack.pop());
                stack.push(i);
            }
            return r - l > 0 ? r - l + 1 : 0;
        }


    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {1,2,3,4};
        System.out.println(s.findUnsortedSubarrayStack(arr));
    }
}
