package leetCode.MonthlyChallenge.Jan2021.BeautifulArrangement;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int countArrangement(int n) {

        int count = 0;
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        getPermutations(n,permutations,new ArrayList<Integer>());
        return permutations.size();
       /* for (List<Integer> list : permutations) {
            int i = 1;
            boolean res = true;
            for (Integer val : list) {
                if (val % i != 0 && i % val != 0) {
                    res = false;
                    break;
                }
                i++;
            }
            if (res) {
                count++;
            }
        }
        return count;*/
    }


    public void getPermutations(int n, List<List<Integer>> permutations,List<Integer> temp) {

        if(temp.size()==n){
            List<Integer> list = new ArrayList<>(temp);
            permutations.add(list);
        }

        for(int i=1;i<=n;i++){
            if(temp.contains(i)){
                continue;
            }
            temp.add(i);
            if (i % temp.size() != 0 && temp.size() % i != 0){
                temp.remove(temp.size()-1);
                continue;
            }else{
                getPermutations(n,permutations,temp);
                temp.remove(temp.size()-1);
            }

        }

    }


    public static void main(String args[]) {

        Solution s = new Solution();
        int count= s.countArrangement(4);
        System.out.println(count);
    }
}
