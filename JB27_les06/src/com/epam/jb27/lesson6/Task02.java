package com.epam.jb27.lesson6;

public class Task02 {
	
	public static void main (String[] args) {
		
		Student[] student = new Student[5];
		
		student[0] = new Student("Ivanov", new int[] {5,2});
		student[1] = new Student("Petrov", new int[] {4,3});
		student[2] = new Student("Vasechkin", new int[] {5,5});
		student[3] = new Student("Blinov", new int[] {3,3});
		student[4] = new Student("Shpak", new int[] {2,2});
	
		Group group = new Group(student);
		
		System.out.println("Средний балл группы: " + group.averageMarkGroup());
		
		group.averageMarkForEachStudent();	
		
		System.out.println("Количество отличников = " + group.qualityOfHavingFive());
						
		System.out.println("Количество двоечников = " + group.qualityOfHavingTwo());
		
	}

}
