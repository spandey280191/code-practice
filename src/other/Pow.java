package other;
class Solution17 {
	public double myPow(double x, int n) {

		if (n == 0)
			return 1;
		if (n < 0) {
			n = -n;
			x = 1 / x;
			
		}
		return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
	}
}

public class Pow {

	public static void main(String[] args) {

		Solution17 s = new Solution17();
		System.out.println(s.myPow(2.00000, -2147483648));

	}

}
