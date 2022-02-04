package com.example.demo.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("arun.xml");
		
	Student stu= context.getBean("student",Student.class);
	//Student stu = new Student(101, "Arundhas");
		stu.display();
		
		Student stuu= context.getBean("studentt",Student.class);
		//Student stu = new Student(101, "Arundhas");
			stuu.show();
		
	}

}
