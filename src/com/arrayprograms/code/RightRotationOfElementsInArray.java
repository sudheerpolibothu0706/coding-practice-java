package com.arrayprograms.code;

import java.util.Arrays;

public class RightRotationOfElementsInArray {

	public static void main(String[] args) {
		int arr[]={2,3,5,7,9,11};
		int n=2;
		
		for(int i=0;i<n;i++){
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
