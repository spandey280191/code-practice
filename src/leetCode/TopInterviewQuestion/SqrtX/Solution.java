package leetCode.TopInterviewQuestion.SqrtX;

public class Solution {

    // Binary search
    public int mySqrtBS(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int left = 1, right = x;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(mid <= x/mid && (mid+1)> x/(mid +1)){
                return mid;
            }else if(mid <= x/mid){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return 0;
    }

    // Linear Solution
    public int mySqrt(int x) {

        int prev=0;
        int i=1;

        while(i<=x/i){
            prev=i;
            i++;
        }

        return prev;
    }
}
