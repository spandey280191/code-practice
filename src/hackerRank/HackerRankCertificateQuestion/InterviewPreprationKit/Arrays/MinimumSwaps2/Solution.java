package hackerRank.HackerRankCertificateQuestion.InterviewPreprationKit.Arrays.MinimumSwaps2;

import com.sun.javafx.logging.JFRInputEvent;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int count = 0;
        int i = arr.length-1;
        while(i>0) {

            if (arr[i] != i + 1) {

                int j = arr[i] - 1;
                swap(arr, i, j);
                count++;
            }else{
                i--;
            }
        }

        return count;

    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {7, 1, 3, 2, 4, 5, 6};
        System.out.println(s.minimumSwaps(arr));
    }
}