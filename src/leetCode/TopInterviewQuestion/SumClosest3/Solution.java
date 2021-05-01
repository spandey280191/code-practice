package leetCode.TopInterviewQuestion.SumClosest3;

import java.util.Arrays;

public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        int closetTarget=10001;
        Arrays.sort(nums);
        for(int i=0;i< nums.length-2;i++){

            int l=i+1;
            int r=nums.length-1;
            while (l<r){

                int sum = nums[i]+nums[l]+nums[r];

                if(sum==target) {
                    return target;
                }

                if(Math.abs(target-closetTarget)>Math.abs(target-sum)){

                    closetTarget=sum;
                }

                if(sum<target){
                    l++;
                }else{
                    r--;
                }

            }

        }



        return closetTarget;

    }


    public static void main(String args[]){
        Solution s = new Solution();
        int[] nums= {-3,-2,-5,3,-4};

        System.out.println(s.threeSumClosest(nums,-1));
    }
    }