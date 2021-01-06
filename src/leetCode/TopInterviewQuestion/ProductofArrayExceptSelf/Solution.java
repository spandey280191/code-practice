package leetCode.TopInterviewQuestion.ProductofArrayExceptSelf;

public class Solution {

    public int[] productExceptSelf(int[] nums) {

        int totalMult = 1;
        int[] output = new int[nums.length];
        int countZero=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countZero++;
                continue;
            }
            totalMult = totalMult * nums[i];

        }
        if(countZero==nums.length || countZero>1) {

            for(int i=0;i<nums.length;i++){

                output[i]=0;
            }
        }else if(countZero>0){

            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    output[i]=totalMult;
                    continue;
                }
                output[i]=0;
            }

        }else{
            for(int i=0;i<nums.length;i++){

                output[i]=totalMult/nums[i];
            }
        }


        return output;
    }

    // Time out O(n2)
   /* public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int totalMult = 1;
            for(int j=0;j<nums.length;j++){

                if(i==j){
                    continue;
                }

                totalMult = totalMult * nums[j];
            }

            output[i] = totalMult;
        }


        return output;
    }
*/
    public static void main(String[] args) {
        int nums[] = {0,0};
        Solution s = new Solution();
        int[] result = s.productExceptSelf(nums);
        for(int i=0;i<nums.length;i++) {
            System.out.print(result[i] + " ");
        }
    }
}
