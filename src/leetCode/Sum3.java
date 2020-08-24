package leetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution7 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
          int sum = 0;
        
        for(int i = 0 ; i<nums.length-2; i++){
            if(i == 0 || nums[i] > nums[i-1]){
                int j = i+1;
                int k = nums.length-1;
              
        
            while(j<k){
                 sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> temp = new LinkedList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    
                    result.add(temp);
                    j++;
                    k--;
                
                while(j<k && nums[j] == nums[j-1]) j++;
                while(j<k && nums[k] == nums[k+1]) k--;
            }
                else if(sum < 0) j++;
                else k--;
            }
        }
    }
        return result;
    }
}
public class Sum3 {

	public static void main(String[] args) {

    Solution7 s = new Solution7();
    int a[] = {-1, 0, 1, 2, -1, -4};
    s.threeSum(a).forEach(l -> {
    	System.out.println();
    	l.forEach((i) -> System.out.print(i));
    	});

	}

}
