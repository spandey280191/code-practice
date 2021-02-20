package leetCode.MonthlyChallenge.Jan2021.KthMissingPositiveNumber;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Solution {

    public int findKthPositive(int[] arr, int k) {
        int temp[] = new int[1000];
        int i=0,j=0,l=1;
        while(j!=k && i< arr.length){
            if(arr[i]!=l){
                temp[j]=l;
                j++;
            }else{
                i++;
            }
            l++;
        }

        while(j!=k){
            temp[j]=l;
            j++;
            l++;
        }
        return temp[k-1];
    }

    public static void main(String args[]){
        Solution s = new Solution();
        int arr[] = {1,2,3,4};
       int res=  s.findKthPositive(arr,2);
        System.out.println(res);
    }
}
