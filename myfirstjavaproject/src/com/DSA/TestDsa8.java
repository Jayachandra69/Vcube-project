package com.DSA;

//           QUICK SORT !!
public class TestDsa8 {

	public static void main(String[] args) {
		int [] arr = {12, 4, 21, 30, 25, 17, 5, 8};
		quicksort(arr,0,arr.length-1);
		
		for(int n:arr) {
			System.out.print(n + " ");
		}
	}

	private static void quicksort(int[] arr, int low, int high) {
		
		if(low < high) {
			int pivotIndex = partition(arr,low,high);
			
			quicksort(arr,low,pivotIndex-1);
			quicksort(arr,pivotIndex+1,high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int start = low;
		int end = high;
		while(start < end ) {
		while(start <= high && arr[start] <= pivot) {
			start++;
		}
		
		while(arr[end] > pivot) {
			end--;
		}
		
		if(start < end) {
			swap(arr,start,end);
		}
	}
		swap(arr,low,end);
	    return end;
  }

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
