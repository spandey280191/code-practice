package leetCode;

import java.util.Arrays;

class Solution19 {
	public int climbStairs(int n) {

		int memo[] = new int[n + 1];
		Arrays.fill(memo, -1);
		return climb(n, memo);
	}

	public int climb(int n, int memo[]) {
		if (n < 0) {
			return 0;
		}
		if (n == 1 || n==0) {
			return 1;
		}
		if (memo[n] != -1) {
			return memo[n];
		}
		memo[n] = climb(n - 1, memo) + climb(n - 2, memo);
		return memo[n];
	}
}

public class ClimbingStairs {

	public static void main(String[] args) {

		Solution19 s = new Solution19();
		System.out.println(s.climbStairs(3));

	}

}
