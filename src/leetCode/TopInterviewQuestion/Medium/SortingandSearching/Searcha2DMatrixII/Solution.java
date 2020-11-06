package leetCode.TopInterviewQuestion.Medium.SortingandSearching.Searcha2DMatrixII;

public class Solution {


    // Leet Code Solution
    public boolean searchMatrixLeetCode(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else if(target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }

 // Recursion solution that I could come up with
    public boolean searchMatrix(int[][] matrix, int target) {

      boolean result = search(matrix,target,0,0);

        return result;
    }

    public boolean search(int[][] matrix, int target, int row, int column){

        if(row<0 || row>=matrix.length || column<0 || column>=matrix[0].length || matrix[row][column]==Integer.MAX_VALUE){
            return false;
        }
        if(matrix[row][column]==target){
            return true;
        }
        int val = matrix[row][column];
        matrix[row][column]=Integer.MAX_VALUE;
        if(target<val){
          if (search(matrix,target,row,column-1)
            || search(matrix,target,row-1,column)){
              return true;
          }

        }else{
            if(search(matrix,target,row,column+1)||
            search(matrix,target,row+1,column)){
                return true;
            }
        }
        return  false;
    }

    //Brute Force
    public boolean searchMatrixBruteForce(int[][] matrix, int target) {

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[0].length;j++){

                if(matrix[i][j]==target){
                    return true;
                }
            }

        }

        return false;
    }
}