package org;


public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[]{1,3,2,4};
		int max = arr[0];
		 for (int i = 1; i < arr.length; i++) {
		     if (arr[i] > max) {
		       max = arr[i];
		     }
		   }
		 System.out.println("Maximum value in the array: " + max);

	}

}
