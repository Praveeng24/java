package com.profile;

public class PraveenProfile implements IProfile {

	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"Praveen");
		System.out.println(ProfileConstant.LAST_NAME+"G");
		System.out.println("Age:21");

	}

	public void myHobbies() {
		System.out.println("my hobbies are playing video games cricket");

	}

}
