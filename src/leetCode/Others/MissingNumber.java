package leetCode.Others;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        boolean arr[] = new boolean[nums.length+1];
        Arrays.fill(arr,false);

        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=true;
        }
        for(int i=0;i<arr.length;i++){
            if(!arr[i]){
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        MissingNumber m = new MissingNumber();
        int arr[] = {0,3,2};
        System.out.println(m.missingNumber(arr));

    }
}
