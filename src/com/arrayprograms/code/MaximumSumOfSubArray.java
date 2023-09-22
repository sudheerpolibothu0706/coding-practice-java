package com.arrayprograms.code;

public class MaximumSumOfSubArray {
public static void main(String[] args) {
	int arr[]={-2,-3,4,-1,-2,1,5,-3};
	int max=arr[0];
	
	for(int i=0;i<arr.length;i++){
		int sum=0;
		for(int j=i+1;j<arr.length;j++){
			if(sum==0){
			sum=arr[i]+arr[j];
			}
			else{
				sum=sum+arr[j];
			}
			
		
		if(sum>max){
			max=sum;
			
		}
		}
		
}
	System.out.println("maximum of sub array :-"+max);
}
}
