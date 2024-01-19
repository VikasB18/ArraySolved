package org;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,4};
		int arr2[]=new int[4];
		System.out.println("Original array");
		for(int i=0; i<=arr.length-1; i++) {
			
			System.out.println(arr[i]);
		}
		
		System.out.println("copied elements from original array");
		
		for(int i=0; i<=arr.length-1;i++) {
			arr2[i]=arr[i];
			System.out.println(arr2[i]);
		}
		
		

	}

}
