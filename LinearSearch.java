package com.namdeo.training;

public class LinearSearch {
        public static int search (int arr[],int x)
        {
        
        
		int  n =arr.length;
		for(int i=0;i<=n;i++)
		{
			if (arr[i]==x)
				return i; 
}
return -1;
	}

	public static void main  (String[] args)
	{
		int arr []= {2,3,4,10,80};
		int  x =4;
		int result =search(arr,x);
		if (result==-1)
			System.out.println("Element are not present in array");
		else 
		System.out.println("Element are present in array"+ result);
		}
	}
	


