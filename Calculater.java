package com.namdeo.training;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		char operation;
		int num1;
		int num2;

		 System.out.println("Enter First Number");

		num1 = in.nextInt();

		System.out.println("Enter Operation");

		operation = in.next().charAt(0);

		System.out.println("Enter Second Number");

		num2 = in.nextInt();

		if (operation == '+')//make sure single quotes
		{
		    System.out.println("your answer is " + (num1 + num2));
		}
		if (operation == '-')
		{
		    System.out.println("your answer is " + (num1 - num2));
		}
		if (operation == '/')
		{
		    System.out.println("your answer is " + (num1 / num2));
		}
		if (operation == '*')
		{
		    System.out.println("your answer is " + (num1 * num2));
		}

		}
		}