package com.namdeo.training;

public class oneTwoDimensionalArray {

	public static void main(String[] args) {
		int[][] MultiArray = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
		double[] SingleArray = { 1.9, 2.9, 3.4, 3.5 };

		System.out.println("SingleDimensional Array :");
		for (int i = 0; i < 3; i++) {

			System.out.println(SingleArray[i] + " ");
		}

		System.out.println("MultiDimensional Array :");
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 2; j++) {

				System.out.print(MultiArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
