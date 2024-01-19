package org;

import java.util.Scanner;

public class SpecificElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int arr[]= new int[]{1,3,2,4,5,6,10};
		
		System.out.println("Enter element given in an given array");
		int key=sc.nextInt();
		int index = -1;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==key) {
				index=i;
				break;
				
			}
		}
		if (index != -1) {
	           System.out.println("Element found at index: " + index);
	       } else {
	           System.out.println("Element not found in the array.");
	       }
		
	}

}
