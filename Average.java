package org;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[]{1,3,2,4};
		int sum = 0;
	    for (int element : arr) {
	      sum += element;
	    }

		double average= (double)sum/arr.length;
		
		System.out.println("Average of the array:" +average);

	}

}
