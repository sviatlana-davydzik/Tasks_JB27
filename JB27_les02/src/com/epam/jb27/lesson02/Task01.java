package com.epam.jb27.lesson02;

import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
	int n = 10;

	Scanner sc = new Scanner(System.in); //подключение класса Scanner, который позволяет ввод с клавиатуры
	String max = "", min = "", str = ""; //объявление переменных
	
	for (int i = 0; i < n; i++) { //объявление цикла с количеством повторений = n
		System.out.print("> ");
	if (sc.hasNextLine()) {  //метод проверяет, являются ли введенные данные строкой
		str = sc.nextLine(); //метод обращается к источнику данных, находит там следующую строку, возвращает ее из консоли
	if (i == 0) { //установка первого минимального значения
		min = str;
	}
	
	if (str.length() > max.length()) { 
		max = str; 								//если длина переменной str больше объявленной максимальной длины, то вывести в консоль, что переменная str - max
	} else if (str.length() < min.length()) {
		min = str;								// иначе вывести в консоль, что переменная str - min
	}
	}
	}
	System.out.println("max string = " + max + " length=" + max.length()); // вывод в консоль
	System.out.println("min string = " + min + " length=" + min.length());
	}
		

}
