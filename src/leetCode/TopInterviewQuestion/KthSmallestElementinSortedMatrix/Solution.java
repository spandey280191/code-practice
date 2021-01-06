package leetCode.TopInterviewQuestion.KthSmallestElementinSortedMatrix;

public class Solution {

    public int kthSmallest(int[][] matrix, int k) {

        int y=(k-1)%matrix.length;
        int x=(k-y-1)/matrix.length;

        return matrix[x][y];


    }

    public static void main(String args[]){
        Solution s = new Solution();
        int[][] board={{-5}};
        System.out.println(s.kthSmallest(board,1));
    }
}
