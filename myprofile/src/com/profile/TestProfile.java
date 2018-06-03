package com.profile;

public class TestProfile {
	public  static void printProfile(IProfile profile) {
		profile.myHobbies();
		profile.myBasicInfo();
	}

public static void main(String args[])
{
	IProfile myProfile=new PrasanthProfile();
	printProfile(myProfile);
	
}
}
