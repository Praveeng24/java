package com.profile;

public class Unique {

	public static void main(String args[]) {
		int j;
		int a[] = { 2, 1, 3, 3 };
		int uni[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			for ( j = 0; j < uni.length; j++) {
				if (a[i] == uni[j]) {

				} else {
					uni[j] = a[i];
				}

			}
		
System.out.println(uni[j]);
		}
	}
}
