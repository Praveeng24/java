package com.java;

public class Students {
	public static void main(String args[])
	{
		Student student=new Student();
		student.setStudentId(123);
		student.setDepartment("CSE");
		student.setFirstName("Praveen");
		student.setLastName("G");
		student.setGender("Male");
		System.out.println(student);
	}


}
