package leetCode.TopInterviewQuestion.Medium.SortingandSearching.TopKFrequentElements;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[k];
        for(int i=0;i<nums.length;i++){

            if(map.get(nums[i])!=null){
               int val = map.get(nums[i]);
               map.put(nums[i],val+1);
            }else{
                map.put(nums[i],1);
            }

        }

        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        for(int i=0;i<k;i++){
            result[i]=list.get(i).getKey();
        }


        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {1,1,1,2,2,3};
        int k = 2;
        s.topKFrequent(nums,k);
    }
}