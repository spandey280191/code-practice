package other;
import java.util.ArrayList;
import java.util.List;

class Solution23 {
	public List<Integer> spiralOrder(int[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;
		int number = m * n;
		int top = 0, bottom = 0, right = 0, left = 0;
		int row=0;
		List<Integer> list = new ArrayList<Integer>();
		while (list.size() < number) {
			top = 0; bottom = 1; right = 1; left = 1;
			while (list.size() < number && top+row <= n-1-row) {
				list.add(matrix[row][top+row]);
				top++;
			}
			while (list.size() < number && right+row <= m-1-row) {
				list.add(matrix[right+row][n-1-row]);
				right++;
			}
			while (list.size() < number && n-1-(bottom+row) >= row) {
				list.add(matrix[m-1-row][n-1-(bottom+row)]);
				bottom++;
			}
			while (list.size() < number && m-1-(left+row) >= row) {
				list.add(matrix[m-1-(left+row)][row]);
				left++;
			}
			row++;
		}

		return list;
	}
	
}

public class SpiralMartix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Solution23 s = new Solution23();
			int matrix[][]={{1, 2, 3, 4},{5, 6, 7, 8},{9,10,11,12},{13,14,15,16}};
			List<Integer> list =s.spiralOrder(matrix);
			for(int i=0;i<matrix.length;i++){
				for(int j=0;j<matrix[0].length;j++){
					System.out.print(matrix[i][j]+ "\t");
				}
				System.out.println();
			}
			
			list.forEach((i) -> System.out.print(i+ " "));
	}

}
