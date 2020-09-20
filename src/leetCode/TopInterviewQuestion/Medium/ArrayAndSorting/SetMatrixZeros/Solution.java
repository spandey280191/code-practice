package leetCode.TopInterviewQuestion.Medium.ArrayAndSorting.SetMatrixZeros;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public void setZeroes(int[][] matrix) {

        List<Integer> row = new ArrayList<Integer>();
        List<Integer> column = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    row.add(i);
                    column.add(j);
                }
            }

        }

        for (Integer rowNum : row) {
            setRowZero(matrix, rowNum);
        }
        for (Integer columnNum : column) {
            setColumZero(matrix, columnNum);
        }


    }

    public void setRowZero(int[][] matrix, int row) {

        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }

    }

    public void setColumZero(int[][] matrix, int column) {

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }

    }
}
