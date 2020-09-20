package leetCode.TopInterviewQuestion.Medium.ArrayAndSorting.Sum3;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> finalList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            set = new HashSet<Integer>();
            for (int j = i+1; j < nums.length; j++) {

                int rem = 0 - (nums[i] + nums[j]);
                if (set.contains(rem)) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(rem);
                    finalList.add(list);
                    while(j+1<nums.length && nums[j]==nums[j+1]){
                        j++;
                    }
                }
                set.add(nums[j]);

            }
        }

        return finalList;
    }

    public static void main(String args[]){
        Solution s = new Solution();
       // int[] arr = {-1, 0, 1, 2, -1, -4};
        int[] arr = {0,0,0,0};
      //  int[] arr = {-2,0,1,1,2};
        s.threeSum(arr);

    }

}