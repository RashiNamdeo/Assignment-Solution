package com.namdeo.training;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		
		
		System.out.println("The  input array:" + Arrays.toString(a));
		
		int n = 20;
		System.out.println("\nKey to be searched=" + n);
		
		int s = 0, e = a.length - 1, mid, pos = -1;
		mid = (s + e) / 2;
		
		while (s <= e) {
		
			if (n > a[mid]) {
				s = mid + 1;
			}
			else if (n == a[mid]) {
				System.out.println("Element is found at index: " + mid);
				break;
			}
			else {
				e = mid - 1;
			}
			mid = (s + e) / 2;
		}
		
		if (s > e) {
		
			System.out.println("Element not found");
		}

	}
}
