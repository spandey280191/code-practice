package leetCode.TopInterviewQuestion.Medium.DynamicProgramming.LongestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {


    public int lengthOfLIS(int[] nums) {
        int memo[][] = new int[nums.length][nums.length];
        for (int[] l : memo) {
            Arrays.fill(l, -1);
        }
        return lengthofLIS(nums, -1, 0, memo);
    }
    public int lengthofLIS(int[] nums, int previndex, int curpos, int[][] memo) {
        if (curpos == nums.length) {
            return 0;
        }
        if (memo[previndex + 1][curpos] >= 0) {
            return memo[previndex + 1][curpos];
        }
        int taken = 0;
        if (previndex < 0 || nums[curpos] > nums[previndex]) {
            taken = 1 + lengthofLIS(nums, curpos, curpos + 1, memo);
        }

        int nottaken = lengthofLIS(nums, previndex, curpos + 1, memo);
        memo[previndex + 1][curpos] = Math.max(taken, nottaken);
        return memo[previndex + 1][curpos];
    }

    /**
     * Brute Force Solution - Time Limit Exceeds

    public int lengthOfLIS(int[] nums) {

        if(null==nums || nums.length==0){
            return 0;
        }
        int max=1;
        char[] lookup= new char[nums.length];
        for(int i=0;i<nums.length;i++){
            lookup[i]='N';
        }
        for(int i=0;i<nums.length-1;i++){
            if(lookup[i]=='N') {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                int res = find(nums, list, i + 1, 0,lookup);
                if (res > max) {
                    max = res;
                }
            }
        }
      return max;
    }

    public int find(int[] nums, List<Integer> vals, int i, int max, char[] lookup) {

        if (i >= nums.length) {
            return vals.size();
        }

        for (int j = i; j < nums.length; j++) {
            if (vals.get(vals.size() - 1) < nums[j]) {
                vals.add(nums[j]);
                lookup[i]='Y';
                int res = find(nums, vals, j + 1, max,lookup);
                if (res > max) {
                    max = res;
                }
                vals.remove(vals.size() - 1);
            }
        }

        if(vals.size()>max){
            max=vals.size();
        }

        return max;
    }
**/
    public static void main(String args[]) {

        Solution s = new Solution();
        int arr[] = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(s.lengthOfLIS(arr));
    }
}
