package com.profile;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Codes {
	// List list = Arrays.asList(new character[] { '@', 'A', 'B', 'C', 'D' });
	static List list = Arrays.asList(new Character[] { '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I','J','k','M','N','O','P','Q','R','S','T','U','V','W','Y','Z' });

	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		String[] str1 = scan.nextLine().split("//s ");
		for (int i = 0; i < str1.length; i++) {
			String word = str1[i];
				int value=0;
				for (int j = 0; j < word.length() / 2; j++) {
					char one = word.charAt(j);
					char two = word.charAt(word.length() - (j+1));
					 int sum=0;
					 sum = list.indexOf(one)-list.indexOf(two);
					 if(sum<0) {
						 sum*=-1;
					 }
					
					  value=sum+value;
					System.out.println(sum);
					}

			}
			
			
		}
	}

