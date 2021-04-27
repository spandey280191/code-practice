package leetCode.MonthlyChallenge.DistributeCandies;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public int distributeCandies(int[] candyType) {

        int count=0;
        int max_candies= candyType.length/2;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        count = Math.min(max_candies,set.size());

        return count;
    }
}
