package com.epam.jb27.lesson9;

public class Library {
	
	public static void main(String[] args) {
		
		Book book = new Book("Book", "Author", 10);
		
		StudyBook studyBook = new StudyBook("Study Book", "Ivanov", 20, "A1");
		
		TutorialBook tutorialBook = new TutorialBook("Tutorial Book", "Petrov", 30, "A1", "English");
		
		System.out.println(book);
	}

}
