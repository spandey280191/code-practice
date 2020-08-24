package leetCode.sorting;

public class InsertionSort {
	public void sort(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int num = arr[i];
			int temp=-1;
			while (j >= 0) {

				if (arr[j] > num) {
					arr[j+1] = arr[j];
					temp=j;
				}
				j--;
			}
			if(temp>=0)
			arr[temp]=num;

		}

	}

	public static void main(String args[]) {

		InsertionSort b = new InsertionSort();
		int[] a = { 4, 3, 5, 6, 1, 8, 2 };
		b.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
