package leetCode.searching;

public class BadVersion {
	public int firstBadVersion(int n) {

		boolean result = true;
		int start = 1;
		int last = n;
		int mid = 0;
		while (result && start<last) {

			mid = (last - start) / 2 + start;

			if (isBadVersion(mid) && !isBadVersion(mid - 1)) {
				result = false;
				return mid;
			} else if (isBadVersion(mid) && isBadVersion(mid - 1)) {
				last = mid;
			} else if (!isBadVersion(mid) && !isBadVersion(mid - 1)) {
				start = mid+1;
			}

		}
		return mid;

	}

	public boolean isBadVersion(int n) {
		if (n == 4) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {

		BadVersion v = new BadVersion();
		System.out.println(v.firstBadVersion(5));
		// v.firstBadVersion(5);

	}
}
