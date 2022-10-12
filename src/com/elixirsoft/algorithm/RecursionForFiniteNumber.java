package com.elixirsoft.algorithm;

public class RecursionForFiniteNumber {
	
	static int count = 0;

	public static void main(String[] args) {

		System.out.println("--------------------------");

		finite();
	}

	private static void finite() {

		count++;
		
		if (count <= 5) {
			
			System.out.println(count);
			finite();
		}
	}
}