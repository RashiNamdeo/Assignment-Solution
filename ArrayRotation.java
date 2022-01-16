package com.namdeo.training;

public class ArrayRotation {
	
	 void leftRotate(int arr[], int d, int n) 
	    {
	        int i;
	        for (i = 0; i < d; i++)
	            leftRotatebyOne(arr, n);
	    }
	  
	    void leftRotatebyOne(int arr[], int n) 
	    {
	        int i, temp;
	        temp = arr[0];
	        for (i = 0; i < n - 1; i++)
	            arr[i] = arr[i + 1];
	        arr[i] = temp;
	    }
	  
	    
	    void printArray(int arr[], int size) 
	    {
	        int i;
	        for (i = 0; i < size; i++)
	            System.out.print(arr[i] + " ");
	    }
	  
	   
	    public static void main(String[] args) 
	    {
	    	ArrayRotation rotate = new ArrayRotation();
	        int arr[] = {21, 22, 23, 24, 25, 26,27,28,29};
	        rotate.leftRotate(arr, 2, 9);
	        rotate.printArray(arr, 9);
	    }
}
