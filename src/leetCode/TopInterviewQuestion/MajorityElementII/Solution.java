package leetCode.TopInterviewQuestion.MajorityElementII;

import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        int min_count = nums.length/3;
        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }

        }

        Set<Integer> set = map.keySet();

        for(Integer i : set){

            if(map.get(i)>min_count){
                list.add(i);
            }

        }

        return list;

    }
}