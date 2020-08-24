package other;

import java.util.Scanner;

public class QuickSort {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in); 
		QuickSort quickSort = new QuickSort();
		System.out.println("Enter array elements space saparated");
		String arrayElement=scanner.nextLine();
		scanner.close();
		String arr[] = arrayElement.split(" ");
		Integer array[] = new Integer[arr.length];
		for(int i=0;i<arr.length;i++){
			array[i] = Integer.valueOf(arr[i]);
		}
		quickSort.quickSort(0,array.length-1, array);
		System.out.println();
		for(int j:array){
			System.out.print(j + " ");
		}
	}
	
	public void quickSort(int low,int high, Integer array[]){
		int pivot = high;
		int leftpointer=low;
		int rightpointer=high;
		if(rightpointer-leftpointer>0){
		while(leftpointer<rightpointer){
			
			while(array[leftpointer]<array[pivot]){
				leftpointer++;
			}
			while(array[rightpointer]>=array[pivot] && rightpointer>0){
				rightpointer--;
			}	
			
			if(leftpointer>=rightpointer){
				break;
			}else{
				swap(leftpointer, rightpointer, array);
			}
		}	
		swap(leftpointer, pivot, array);
		pivot=leftpointer;
		quickSort(low, pivot-1, array);
		quickSort(pivot+1, high, array);
		}else{
			return;
		}
	
	}
	
	public void swap(int high,int low, Integer array[]){
		int temp;
		temp=array[low];
		array[low]=array[high];
		array[high]=temp;
	}
}
