package leetCode.TopInterviewQuestion.MajorityElement;

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int max_element=0;
        int max_count=0;
        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){

                map.put(nums[i],map.get(nums[i])+1);

                if(map.get(nums[i])>max_count){

                    max_count=map.get(nums[i]);
                    max_element=nums[i];
                }

            }else{
                map.put(nums[i],1);
                if(map.get(nums[i])>max_count){

                    max_count=map.get(nums[i]);
                    max_element=nums[i];
                }
            }

        }

        return max_element;

    }
}
