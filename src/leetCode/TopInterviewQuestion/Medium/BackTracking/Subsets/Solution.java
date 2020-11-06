package leetCode.TopInterviewQuestion.Medium.BackTracking.Subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), nums,0);

        return list;

    }

    public List<List<Integer>> subsetsIterator(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> tempList = new ArrayList<>();
        list.add(tempList);

        for(int i=0;i<nums.length;i++){

            List<List<Integer>> outputList = new ArrayList<>();
            for(List<Integer> l : list){

                tempList = new ArrayList<>(l);
                tempList.add(nums[i]);
                outputList.add(tempList);
            }

            for(List<Integer> l : outputList){
                list.add(l);
            }


        }

        return list;

    }
    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr= {1,2,3};
        s.subsetsIterator(arr);

    }
}