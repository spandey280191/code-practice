package leetCode.TopInterviewQuestion.Medium.DynamicProgramming.JumpGame;

import java.util.*;

public class Solution {



    // Using Leet code approach
    public boolean canJump(int[] nums) {

        char[] arr  = new char[nums.length];
        if(nums.length==1 || nums.length==0){
            return true;
        }
        return jump(nums,0,arr);

    }

    public boolean jump(int[] nums, int i, char[] arr){

        if(i == nums.length-1){
            return true;
        }

        if(i>=nums.length || nums[i]==0 || arr[i]=='B'){

            return false;
        }

        boolean result=false;
        if(nums.length-1 <= i + nums[i]){
            return true;
        }
        for(int j=1;j<=nums[i];j++){
            if(jump(nums,i+j,arr)){
                arr[i]='G';
                return true;
            }
        }
        arr[i]='B';

        return result;
    }

    // Came up by own // Time limit exceed solution
    public boolean canJumpTimeLimit(int[] nums) {

        if(nums.length==1 || nums.length==0){
            return true;
        }
        return jumpTimeLimit(nums,0);

    }

    public boolean jumpTimeLimit(int[] nums, int i){

        if(i == nums.length-1){
            return true;
        }
        if(i>=nums.length || nums[i]==0){
            return false;
        }


        boolean result=false;
        // more optimized condition still timeout
       /* if(nums.length-1 <= i + nums[i]){
            return true;
        }*/
        for(int j=1;j<=nums[i];j++){
            result = jumpTimeLimit(nums,i+j);
            if(result){
                return result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,3,1,1,4};
       //  int[] nums = {2,0};
        System.out.println(s.canJump(nums));

    }

}
