package com.epam.jd27.lesson3;

import java.util.Scanner;

public class Task01_4 {

	public static void main(String[] args) {
		
		int number = 0;
		int digit = 0;		
		
		number = reader(number);
		
		
		
		while (number != 0) {
		digit = digit(number);
		number = number / 10;
		
		
		if (isEven(digit)) {
		System.out.println("В числе есть четная цифра.");
		return;
		}
		}
		System.out.println("В числе нет четных цифр.");
		}
	
	public static int reader(int number) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число: ");
		if (sc.hasNextInt())
		number = sc.nextInt();
		return number;
	}
	
	public static int digit(int number) {
		
		return number % 10;

	}
	
	public static boolean isEven(int digit) {
		return digit % 2 == 0;
	}
}
