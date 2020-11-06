package leetCode.TopInterviewQuestion.Medium.SortingandSearching.SortColor;

public class Solution {

    public void sortColors(int[] nums) {

        int count[] = new int[3];

        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<3;i++){
            while(count[i]>0){
                nums[j]=i;
                j++;
                count[i]--;
            }

        }


    }
    public void sortColorsBubbleSort(int[] nums) {

        for(int i=0;i<nums.length;i++){

            for(int j=i;j<nums.length;j++){

                if(nums[j]<nums[i]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;

                }

            }

        }


    }


    public static void main(String[] args) {

        Solution s = new Solution();
        int nums[] = {2,0,2,1,1,0};
        s.sortColors(nums);
    }


}
