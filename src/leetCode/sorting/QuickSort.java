package leetCode.sorting;

public class QuickSort {
	public void sort(int lo, int pivot, int[] arr) {

		int hi = pivot -1;
		if (lo >= hi) {
			return;
		}
		int mid = partition(lo, hi, pivot, arr);
		System.out.println(mid + ", " + lo + " ," + hi + ", " + pivot);

		sort(lo, mid-1, arr);
		sort(mid + 1, pivot, arr);

	}

	public int partition(int lo, int hi, int pivot, int[] arr) {

		while (lo < hi) {

			while (lo<pivot && arr[lo] < arr[pivot]) {
				lo++;
			}
			while (hi>0 && arr[hi] > arr[pivot]) {
				hi--;
			}
			if (lo>=hi) {
				break;
			}else{
				int temp = arr[lo];
				arr[lo] = arr[hi];
				arr[hi] = temp;
				lo++;
				hi--;
			}

		}

		int temp = arr[lo];
		arr[lo] = arr[pivot];
		arr[pivot] = temp;

		return lo;
	}

	public static void main(String args[]) {

		QuickSort b = new QuickSort();
//		int[] a = { 4, 3, 5, 6, 1, 8, 2 };
		int[] a = { 9,8,7,6,5,4,3,2,1 };
		b.sort(0,a.length - 1, a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
