package com.epam.jd27.lesson3;

import java.util.Scanner;

public class Task01_3 {
	
	public static void main(String[] args) {

		int year = 0, month = 0, col_day = 0;
		Scanner sc = new Scanner(System.in);
		
		year = enterYear(sc);
		
		month = enterMonth(sc);
		
		col_day = cases(month, year);
		
		
		System.out.println("Количество дней равно - " + col_day);
		}
		
	
	public static int enterYear(Scanner sc) {
		
		System.out.print("Введите год: ");
		if (sc.hasNextInt()) {
		return sc.nextInt();
		}
		return 0;
	}
	
	public static int enterMonth(Scanner sc) {
		System.out.print("Введите номер месяца: ");
		if (sc.hasNextInt()) {
		return sc.nextInt();
		}		
		return 0;
	}
	
	public static int cases(int month, int year) {
		int term = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			term = 31;
		break;
		case 2:
		if (year % 4 == 0) {
			term = 29;
		} else {
			term = 28;
		}
		break;
		case 4:
		case 6:
		case 9:
		case 11:
			term = 30;
		break;
		}
		return term;
	}
}
