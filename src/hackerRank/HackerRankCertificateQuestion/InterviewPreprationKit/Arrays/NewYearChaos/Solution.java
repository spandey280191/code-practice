package hackerRank.HackerRankCertificateQuestion.InterviewPreprationKit.Arrays.NewYearChaos;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int count=0;
        int memo[] = new int[q.length];
        for(int i=q.length-1;i>=0;i--){

            if(q[i]-(i+1)>2){
                System.out.println("Too chaotic");
                return;
            }
            for(int j=i+1;j<q.length;j++){

                if(memo[j]!=0 && q[j]<q[i]){
                    count = count + 1 +memo[j];
                    memo[i]=memo[j]+1;
                    break;
                }else if(q[j]<q[i]){
                    count = count+1;
                    memo[i]=memo[i]+1;
                }
            }
        }

        System.out.println(count);


    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr= {1,2,5,3,7,8,6,4};
        s.minimumBribes(arr);
    }
}
