package leetCode.sorting;

public class BubbleSort {

	public void sort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static void main(String args[]) {

		BubbleSort b = new BubbleSort();
		int[] a = { 4, 3, 5, 6, 1, 8, 2 };
		b.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
