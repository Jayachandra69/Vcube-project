package com.DSA;
//          INSERTION SORT  !!
public class TestDsa6 {

	public static void main(String[] args) {
		int[]arr = {2,9,4,7,3,8,5};
		int temp = 0;
		int j = 0;
		
		for(int i=1;i<arr.length;i++) {
			temp = arr[i];
			j = i;
			
			while(j>0 && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j = j-1;
			}
			arr[j] = temp;
		}
		for(int a :arr) {
			System.out.print(a + " ");
		}
	}

}
