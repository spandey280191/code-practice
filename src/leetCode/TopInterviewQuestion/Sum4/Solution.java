package leetCode.TopInterviewQuestion.Sum4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> listOflist = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }

                int l= j+1;
                int r=nums.length-1;

                while (l<r){
                    int sum = nums[i]+nums[j]+nums[l]+nums[r];

                    if(sum==target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        listOflist.add(list);
                        l++;
                        r--;

                        while (l<r && nums[l]==nums[l-1]){
                            l++;
                        }
                        while (l<r && nums[r]==nums[r+1]){
                            r--;
                        }

                    } else if(sum<target){
                        l++;
                    }else{
                        r--;
                    }

                }



            }



        }
        return listOflist;
    }
    public static void main(String args[]){

        Solution s = new Solution();
        int[] nums= {-3,-2,-1,0,0,1,2,3};
        List<List<Integer>> list = s.fourSum(nums,0);
        list.forEach(l -> {
            l.forEach(i -> System.out.print(i+" "));
            System.out.println();
        } );
    }
}