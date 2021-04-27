package leetCode.TopInterviewQuestion.FruitsintoBaskets;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int maxFruit(Character[] str){
        int max=Integer.MIN_VALUE;
        int start=0;
        int length = str.length;
        Map<Character,Integer> map = new HashMap<>();
        for(int end=0;end<length;end++){

            map.put(str[end] , map.getOrDefault(str[end],0)+ 1);
            while (map.size()>2){
                Character left = str[start];
                map.put(left,map.getOrDefault(left,1)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                start++;
            }

            max = Math.max(max,end-start+1);

        }




        return max;
    }

    public int maxFruitLeetCode(int[] tree){
        int max=Integer.MIN_VALUE;
        int start=0;
        int length = tree.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int end=0;end<length;end++){

            map.put(tree[end] , map.getOrDefault(tree[end],0)+ 1);
            while (map.size()>2){
                int left = tree[start];
                map.put(left,map.getOrDefault(left,1)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                start++;
            }

            max = Math.max(max,end-start+1);

        }




        return max;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
     //   Character[] str = {'A', 'B', 'C', 'A', 'C'};
        int[] arr = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(s.maxFruitLeetCode(arr));
    }


}
