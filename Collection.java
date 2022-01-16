package com.namdeo.training;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Collection {

	public static void main(String[] args) {
		System.out.println("Array list");
		ArrayList<String> colour = new ArrayList<String>();
		colour.add("Red");
		colour.add("yellow");
		colour.add("green");
		System.out.println(colour);

		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> number = new Vector<Integer>();
		number.add(285);
		number.add(147);
		number.add(369);
		System.out.println(number);

		System.out.println("\n");
		System.out.println("linked list");
		LinkedList<String> city = new LinkedList<String>();
		city.add("pune");
		city.add("mumbai");
		city.add("goa");
		city.add("nagpur");
		System.out.println(city);

	}

}
