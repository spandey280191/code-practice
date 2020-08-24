package leetCode.sorting;
public class MergeSort {

	public void mergeSort(int l, int r, int arr[]) {

		if (l < r) {
			int m = (l + r) / 2;

			mergeSort(l, m, arr);
			mergeSort(m + 1, r, arr);
			merge(l, m, r, arr);
		} else {
			return;
		}

	}

	public void merge(int l, int m, int r, int arr[]) {

		int[] left = new int[m - l + 1];
		int[] right = new int[r - m];

		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i+l];
		}

		for (int i = 0; i <right.length; i++) {
			right[i] = arr[i+m+1];
		}

		int i = l, k = 0, n = 0;

		while (k < left.length && n < right.length) {

			if (left[k] < right[n]) {
				arr[i] = left[k];
				k++;
			} else {
				arr[i] = right[n];
				n++;
			}
			i++;

		}

		while (k < left.length) {
			arr[i] = left[k];
			k++;
			i++;
		}
		while (k < right.length) {
			arr[i] = right[n];
			k++;
			i++;
		}

	}

	public void swap(int a, int b, int arr[]) {

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void main(String args[]) {

		MergeSort b = new MergeSort();
		int[] a = { 4, 3, 5, 6, 1, 8, 2 };
		b.mergeSort(0, a.length - 1, a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
