package leetCode.TopInterviewQuestion.Medium.BackTracking.Permutations;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class Solution {


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        dfs(result, nums, 0);
        return result;
    }
    private void dfs(List<List<Integer>> result, int[] array, int index){
        if(index==array.length-1){
            List<Integer> list = new ArrayList(array.length);
            for(int i:array){
                list.add(i);
            }
            result.add(list);
            return;
        }
        for(int i = index;i<array.length;i++){
       //     if(i!=index)
            swap(array, i, index);
            dfs(result, array, index+1);
       //     if(i!=index)
            swap(array, i, index);
        }
    }
    private void swap(int[] array, int left, int right){
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }

    public List<List<Integer>> permuteBacktrack(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> l = new ArrayList<Integer>();
        helper(nums,list,l);
        return list;
    }

    public void helper(int[] nums , List<List<Integer>> list , List<Integer> l){

        //base condition
            if(l.size()==nums.length){
            list.add(new ArrayList<>(l));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(l.contains(nums[i])) continue; // element already exists, skip
            l.add(nums[i]);
            helper(nums,list,l);
            l.remove(l.size() - 1);
        }


    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,2,3};
        s.permute(arr);
    }
}
