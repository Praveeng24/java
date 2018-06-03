package com.profile;

public class PrasanthProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"Prasanth");
		System.out.println(ProfileConstant.LAST_NAME+"R");
		System.out.println(ProfileConstant.AGE+"20");

	}

	@Override
	public void myHobbies() {
System.out.println("video games");
	}

}
