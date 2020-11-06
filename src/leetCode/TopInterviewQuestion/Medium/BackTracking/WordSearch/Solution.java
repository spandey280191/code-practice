package leetCode.TopInterviewQuestion.Medium.BackTracking.WordSearch;

import java.util.Arrays;

public class Solution {
    public boolean exist(char[][] board, String word) {
        boolean result = false;
        char[] word_arr = word.toCharArray();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == word_arr[0]) {
                    result = search(board, word_arr, i, j, 0);
                    if(result){
                        return true;
                    }
                }

            }

        }

        return result;
    }

    public boolean search(char[][] board, char[] word_arr, int i, int j, int next) {

        if (i<0 || j<0 || i >= board.length || j >= board[0].length || board[i][j] != word_arr[next]) {
            return false;
        }
        if(word_arr.length-1==next){
            return true;
        }
        board[i][j]='0';


        boolean result = search(board, word_arr, i, j + 1, next + 1)
                || search(board, word_arr, i, j - 1, next + 1)
        || search(board, word_arr, i + 1, j, next + 1)
        || search(board, word_arr, i - 1, j, next + 1);

        board[i][j] = word_arr[next];

        return result;
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        String word = "ABCESEEEFS";
        char[][] arr = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(s.exist(arr, word));

    }
}
