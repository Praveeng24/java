package com.profile;

import java.util.*;
public class SeatCombination {
	private static Scanner v;

	public static void main(String[] args) {
		v = new Scanner(System.in);
		String str = v.nextLine();
		String array[]=str.split(" ");
		//for (int i = 0; i <str.length(); i++) {
			
				//array[i]= str.split(" ");
				
			
		//}
		
	/*	Set uniqKeys = new TreeSet();
		uniqKeys.addAll(Arrays.asList(array));
		System.out.println("uniqKeys: " + uniqKeys);
**/
		HashSet unique=new HashSet();
		unique.addAll(Arrays.asList(array));
		System.out.println(unique);
		
	}
}
