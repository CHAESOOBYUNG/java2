package com.javaedu;

public class Add2 {
	public static void main(String[] args) {
		int z = 0;
		z = addition(100, 200);
		System.out.println(z);
	}
	
	public static int addition(int x, int y) {
		int sum = x + y;
		return sum;
	}
}