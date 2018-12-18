package com.epam.jd27.lesson3;

import java.util.Scanner;

public class Task01_2 {
	
		public static void main(String[] args) {
		
		int number = 0;
		int poslZifra;
		int poslZifraKv;	
			
		number = reader(number);
		
		
		poslZifra = number % 10;
		
		poslZifraKv = cases(poslZifra);
		
		System.out.println("Квадрат числа " + number + " равняется " + poslZifraKv);
		}

		public static int reader(int number) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Введите число: ");
			if (sc.hasNextInt()) {
			number = sc.nextInt();
			}
			return number;
		}
		
		public static int cases(int poslZifra) {
			int term = 0;
			switch (poslZifra) {
			case 0:
				term = 0;
			break;
			case 1:
				term = 1;
			break;
			case 2:
				term = 4;
			break;
			case 3:
				term = 9;
			break;
			case 4:
				term = 6;
			break;
			case 5:
				term = 5;
			break;
			case 6:
				term = 6;
			break;
			case 7:
				term = 9;
			break;
			case 8:
				term = 4;
			break;
			case 9:
				term = 1;
			break;
			default:
			System.out.println("Что-то не то с программой.");
			}
			return term;
		}
		
}
