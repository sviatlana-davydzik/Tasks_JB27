package com.epam.jb27.lesson6;

public class Student {
	
	public String name;
	
	public int[] marks;
	
	public Student(String name, int[] marks) {
		this.marks = marks;
		this.name = name;
	}
	
	public double averageMark() {
		
		double sum = 0;
		double averageMark = 0.0;
		
		for (int i = 0; i< marks.length; i++) {
			
			sum = sum + marks[i];
			
		}
		
		averageMark = sum / marks.length;
		
		
		return averageMark;
	}
	
}

