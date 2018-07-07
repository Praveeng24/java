package com.profile;

public class L {
	public static void main(String[] args) {

		String s = "Hero All Yeppp";

		String v[] = s.split("");

		for (String value : v) {

			if (value.length() == 1) {

				System.out.println(value);

			}
		}
	}
}
