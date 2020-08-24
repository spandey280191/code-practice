package leetCode.sorting;

public class SelectionSort {
	public void sort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
	        int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min]){
					min = j;
				}
			}
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}

	}

	public static void main(String args[]) {

		SelectionSort b = new SelectionSort();
		int[] a = { 5,4,3,2,1};
		b.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
