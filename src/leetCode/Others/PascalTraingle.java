package leetCode.Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTraingle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if (numRows == 0) {
            return result;
        }
        int arr[][] = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            Arrays.fill(arr[i], 0);
        }

        arr[0][0] = 1;
        list.add(1);
        result.add(list);
        for (int i = 1; i < numRows; i++) {
            list = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {

                if (j == 0) {
                    arr[i][j] = arr[i - 1][j];
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                list.add(arr[i][j]);
            }
            result.add(list);
        }

        return result;

    }



    public static void main(String[] args) {

    }
}
