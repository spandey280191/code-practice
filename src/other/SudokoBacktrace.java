package other;

import java.util.Scanner;
/**
iven an incomplete Sudoku configuration in terms of a 9x9  2-D square matrix (mat[][]) the task to print a solution of the Sudoku. For simplicity you may assume that there will be only one unique solution.

Example

3 0 6 5 0 8 4 0 0 
5 2 0 0 0 0 0 0 0 
0 8 7 0 0 0 0 3 1 
0 0 3 0 1 0 0 8 0 
9 0 0 8 6 3 0 0 5 
0 5 0 0 9 0 6 0 0 
1 3 0 0 0 0 2 5 0 
0 0 0 0 0 0 0 7 4 
0 0 5 2 0 6 3 0 0 

For the above configuration the solution is
3 1 6 5 7 8 4 9 2
5 2 9 1 3 4 7 6 8
4 8 7 6 2 9 5 3 1
2 6 3 4 1 5 9 8 7
9 7 4 8 6 3 1 2 5
8 5 1 7 9 2 6 4 3
1 3 8 9 4 7 2 5 6
6 9 2 3 5 1 8 7 4
7 4 5 2 8 6 3 1 9


Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains 9*9 space separated values of the matrix mat[][] representing an incomplete Sudoku state where a 0 represents empty block.

Output:
For each test case in a new line print the space separated values of the solution of the the sudoku.

Constraints:
1<=T<=10
0<=mat[]<=9

Example:
Input:
1
3 0 6 5 0 8 4 0 0 5 2 0 0 0 0 0 0 0 0 8 7 0 0 0 0 3 1 0 0 3 0 1 0 0 8 0 9 0 0 8 6 3 0 0 5 0 5 0 0 9 0 6 0 0 1 3 0 0 0 0 2 5 0 0 0 0 0 0 0 0 7 4 0 0 5 2 0 6 3 0 0

Output:
3 1 6 5 7 8 4 9 2 5 2 9 1 3 4 7 6 8 4 8 7 6 2 9 5 3 1 2 6 3 4 1 5 9 8 7 9 7 4 8 6 3 1 2 5 8 5 1 7 9 2 6 4 3 1 3 8 9 4 7 2 5 6 6 9 2 3 5 1 8 7 4 7 4 5 2 8 6 3 1 9 
 *
 */
public class SudokoBacktrace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Number of Testcases");
		int testCases = (int) scanner.nextInt();
		int[][] sudoko = new int[9][9];
		scanner.nextLine();
		SudokoBacktrace solveTheSudoku = new SudokoBacktrace();
		for (int i = 0; i < testCases; i++) {
			System.out.println("Enter array element, space separated");
			String element = scanner.nextLine();
			String[] array = element.split(" ");
			int count=0;
			for (int j = 0; j < 9; j++) {	
				for (int k = 0; k < 9; k++) {
					sudoko[j][k] = Integer.valueOf(array[count]);
					count++;
				}
			}
			boolean isComplete=false;
			System.out.println("Input array");
			solveTheSudoku.printResult(sudoko);
			solveTheSudoku.solveSudoko(sudoko);
			isComplete=solveTheSudoku.isSudokoComplete(sudoko);
			System.out.println();
			System.out.println("Is sudoko complete? "+isComplete);
			System.out.println("Output array");
			solveTheSudoku.printResult(sudoko);
			scanner.close();
		}
	}

	public String unassignedRowColumn(int[][] sudoko) {

		int j=0,k=0;

			for (j = 0 ; j < 9; j++) {
				for (k = 0 ; k < 9; k++) {
					if (sudoko[j][k] == 0) {
							return j+","+k;
					}

				}
	}
			return null;
	}
	
	public boolean solveSudoko(int[][] sudoko){
	
		int row=0,column=0;
		String value=unassignedRowColumn(sudoko);
		if(value!=null){
			String arr[] = value.split(",");
			row=Integer.valueOf(arr[0]);
			column=Integer.valueOf(arr[1]);
			for (int number = 1 ; number <= 9; number++) {
				
				boolean result = isExist(row, column, number,
						sudoko);
				if (!result) {	
					sudoko[row][column]=number;
			        if(solveSudoko(sudoko)){	
			        	return true;
			        }else{
			        	sudoko[row][column]=0;
			        }
				}
			}
		}else{
			return true;
		}
	
		
		return false;
	}
	
	public boolean isExist(int row, int column, int number, int[][] sudoko) {

		boolean isExist = false;
		for (int i = 0; i < 9; i++) {
			if (sudoko[row][i] == number) {
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			for (int i = 0; i < 9; i++) {
				if (sudoko[i][column] == number) {
					isExist = true;
					break;
				}
			}
		}
		if (!isExist) {
			
			row = row/3;
			column = column/3;
			for (int i = (row*3); i < (row*3)+3; i++) {
				for (int j = (column*3); j < (column*3)+3; j++) {
				if (sudoko[i][j] == number) {
					isExist = true;
					break;
				}
				}
			}
		}
		return isExist;
	}

	public boolean isSudokoComplete(int[][] sudoko) {

		boolean isComplete=true;
		for (int j = 0; j < 9; j++) {

			for (int k = 0; k < 9; k++) {
				if(sudoko[j][k]==0){
					isComplete=false;
					break;
				}
			}
		}
		return isComplete;
	}
	
	public void printResult(int[][] sudoko) {

		for (int j = 0; j < 9; j++) {
			System.out.println();
			for (int k = 0; k < 9; k++) {
				System.out.print(sudoko[j][k] + " ");
			}
		}
		System.out.println();
	}
}
