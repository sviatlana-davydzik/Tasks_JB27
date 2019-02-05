package com.epam.jb27.lesson6;

public class Group {
	
	Student[] students;
	
	public Group(Student[] students) {
		this.students = students;

	}
	
	public double averageMarkGroup() {
		
		double sum = 0.0;
		double averageMarkGroup = 0.0;
		
		for (int i = 0; i< students.length; i++) {
			
			sum = sum + students[i].averageMark();
			
		}
		
		averageMarkGroup = (double) sum / students.length;
		
		return averageMarkGroup;
	}
	
	public void averageMarkForEachStudent() {
		
		for (int i = 0; i< students.length; i++) {
			
			System.out.println("Средний балл " + students[i].name + " будет равен " + students[i].averageMark());
			
			}	
		}
	
	public int qualityOfHavingFive() {
		
		int count = 0;
		
		for (int i = 0; i< students.length; i++) {
			
			if(students[i].averageMark() == 5) {
				
				count ++;
				
			}
			
		}
		
		return count;
		
	}
	
	public int qualityOfHavingTwo() {
		
		int count = 0;
		
		for (int i = 0; i< students.length; i++) {
			
			if(students[i].averageMark() == 2) {
				
				count ++;
				
			}
			
		}
		
		return count;
		
	}
	
	
}
