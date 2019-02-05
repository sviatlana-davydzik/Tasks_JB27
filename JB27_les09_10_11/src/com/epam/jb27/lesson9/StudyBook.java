package com.epam.jb27.lesson9;

public class StudyBook extends Book {
	
	public String level;
	public String subject;

	public StudyBook(String title, String author, int price, String level) {
		super(title, author, price);
		this.level = level;

	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "StudyBook [level=" + level + ", subject=" + subject + "]";
	}
	
	

	
	
}
