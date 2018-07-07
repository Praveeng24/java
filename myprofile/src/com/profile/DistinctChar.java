package com.profile;

import java.util.Scanner;

public class DistinctChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String[] word = str1.split("");
		String value="";
		char[] ch = new char[str1.length()];
		int var = 1; 
		for(int i=0;i<word.length;i++)
		{
			value=word[i];
		}
		for (int j = 0; j < value.length(); j++) {
			for (int z = j+1; z <= value.length();z++) {

				if (value.charAt(j) == value.charAt(z)) {
					var = 0;
					break;

				} else {
					var = 1;
					break;
				}
			}

			if (var == 1)
			{
				System.out.println(ch[j]);
			}
			
		}
	}

}
