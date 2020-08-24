package leetCode.searching;
public class BinarySearch {

	public boolean search(int[] arr, int num, int start, int end) {

		int mid = start+(end-start) / 2;
		System.out.println(mid);
		if (arr[mid] == num) {
			return true;
		}
		if (start < end) {
			if (arr[mid] > num) {
			    System.out.println("First half");
			return search(arr, num, start, mid);

			} else if (arr[mid] < num) {
			    System.out.println("second half");
			return	search(arr, num, mid, end);
				
			}
		}
		return false;
	}

	public static void main(String args[]) {

		BinarySearch b = new BinarySearch();
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		boolean exist = b.search(a, 2, 0, a.length - 1);

		System.out.println(exist);

	}
}
