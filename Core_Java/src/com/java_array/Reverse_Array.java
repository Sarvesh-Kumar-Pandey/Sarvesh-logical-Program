package com.java_array;

public class Reverse_Array {

	public static void main(String[] args) {
		int arr[]= {15,8,9,2,11,4,7};
		int temp=0;
		for (int i = 0; i < arr.length/2; i++) {
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;

		}
    for (int i : arr) {
    	System.out.println(i);
		
	}
	}

}
