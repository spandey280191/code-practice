package leetCode.TopInterviewQuestion.Medium.DynamicProgramming.UniquePaths;

public class Solution {

    public int uniquePaths(int m, int n) {

        int count = 0;
        int arr[][] = new int[m][n];
        count= countPath(m, n, 0, 0,arr);
        return count;
    }


    public int countPath(int m, int n, int i, int j,int arr[][]) {
        if (i >= m || j >= n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if(arr[i][j]>0){
            return arr[i][j];
        }

        arr[i][j] = countPath(m, n, i + 1, j,arr) + countPath(m, n, i, j + 1,arr);

        return arr[i][j];
    }

    // recursion
    public int uniquePathsRecursion(int m, int n) {

        int count = 0;
      count= countPathRecursion(m, n, 0, 0, count);
        return count;
    }

    public int countPathRecursion(int m, int n, int i, int j, int count) {

        if (i >= m || j >= n) {
            return count;
        }
        if (i == m - 1 && j == n - 1) {
            count++;
            return count;
        }

        count = countPathRecursion(m, n, i + 1, j, count);
        count = countPathRecursion(m, n, i, j + 1, count);

        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int count = s.uniquePaths(3, 3);
        System.out.println(count);
    }
}