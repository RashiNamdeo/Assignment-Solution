package com.namdeo.training;

import java.util.LinkedList;
import java.util.Queue;

public class Queuedemo {
	public static void main(String[] args) {
		Queue<String> city = new LinkedList<>();

		city.add("Mumbai");
		city.add("Pune");
		city.add("Nagpur");
		city.add("Delhi");
		city.add("Hydrabad");
		System.out.println("City is :" + city);
		System.out.println("Head of Queue:" + city.peek());
		city.remove();
		System.out.println("After removing head of Queue:" + city.remove());
		System.out.println("Elements in Queue:" + city.size());
	}
}
