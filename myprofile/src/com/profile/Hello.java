package com.profile;

import java.util.Scanner;

public class Hello {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[scan.nextInt()];
		int first = 0;
		int second = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
			int n = array[i];
			if (first < n) {
				first = second;
				first = n;

			} else if (second <n)
				second = n;
		}
		System.out.println(first+""+second);
	}
}
