package com.namdeo.training;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {50, 30, 20, 80,  60, 10, 70, 90, 40};
		int n= a.length;
		
		System.out.println("Unsolved array:");
		
	for(int i=0; i<n; i++)
		{
			System.out.println(a[i]+",");
		}
		//selection sorting
	 for(int i=0;i<n-1;i++)
	 {
		 int min =a[i];
		 int pos = i;
		 for(int j =i;j<n;j++)
		 {
			 if (a[j]<min)
			 {
				 min = a[j];
				 pos = j;
				  }
			}
		int t =a[i];
		a[i]=a[pos];
		a[pos]=t;
	 }
	System.out.println("\n\nSolved array:");
		for (int i=0;i<n;i++)
		{
			System.out.println(a[i]+",");
		 }

	}

}
