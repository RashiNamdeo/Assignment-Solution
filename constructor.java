package com.namdeo.training;

public class constructor {
	
	
		int num1;
		int num2;
		int result;
		public constructor()
		{
			num1=7;
			num2=7;
			System.out.println("in Constructor");
		}
		public constructor(int n)
		{
			num1 =n;
			num2= n;
		}
		public constructor(double d ,int n)
		{
			num1=(int)d;
			num2=n;
		}
		
		



	public static void main(String[] args) {
		constructor  obj = new constructor();
		System.out.println(obj.num1);
		
		

	}
	
}



		
		
		
	



