package com.example.demo.model;

public class Student {
	
	private int id;
	private String studentName;
		
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}
	
	public Student(int id)
	{
		this.id = id;
	}

	void display()
	{
		System.out.println("Student name is:"+ studentName +" and id is:"+id );
	}
	void show()
	{
		System.out.println("The age is: "+ id);
	}

}
