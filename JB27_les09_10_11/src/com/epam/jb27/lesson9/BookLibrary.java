package com.epam.jb27.lesson9;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

	List<Book> items= new ArrayList<Book>();
	
	public void addBook (Book item) {
		
		items.add(item);

	}

	public void removeBook (String title) {
		
		for (Book book : items) {
			
			if (book.getTitle().contains(title)) {
				
				items.remove(book);
				
				break;
				
			}
			
		}			
		
	}
	
	public Book findBook (String title) {
		
		for (Book book : items) {
			
			if (book.getTitle().contains(title))
			
			return book;
			
		}
		return null;
		
	}
	
		
		//создать отдельный List, где будут храниться книги только 1 автора
		//пробегать по листу книг в библиотеке
		//в каждой книге - принадлежит ли автору
		//если да - книгу записать в лист (см. выше)
		//если нет - пропустить
		//берем лист с книга автора, используем метод sort, вставляет Price Comparator, return лист с книгами одного автора
		//
		
	public List<Book> sortBooksByAuthor(String author) {
		
		List<Book> authorBook= new ArrayList<Book>();
		
		for (Book book : items) {
			
		if (book.getAuthor().contains(author))
			
			authorBook.add(book);			
		
		}
		
		authorBook.sort(new PriceComparator());
		
		return authorBook;
	}

	@Override
	public String toString() {
		return "BookLibrary [items=" + items + "]";
	}
	
}
