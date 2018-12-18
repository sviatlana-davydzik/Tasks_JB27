package com.epam.jb27.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
/*		int n = 3;
		Scanner sc = new Scanner(System.in);
		String first = "", second = "", third = "";
//		for (int i = 0; i < n; i++) {
//		System.out.print("> ");
		
		
		if (sc.first < sc.second, sc.first < sc.third, sc.second < sc.third) {
			System.out.println("Введенные данные идут по возрастающей");
			else if (first > second, first > third, second > third) {
				System.out.println("Введенные данные не идут по возрастающей");
			}*/
		
/*		double i;
		double[] ar = new double[3];
		Scanner sc = new Scanner(System.in);
		
		for (i=0; i < ar.length; i++) {
			System.out.println("ar[" + i + "]=>");
			ar[i] = sc.nextDouble();
			}
		
		}*/
		
		int[] mas = new int[3];
		enterArrayWithRandom(mas);
		printArray(mas); 
		
		boolean check = false;
		for (int i=0; i < mas.length-1; i++) {
			if(mas[i] > mas[i+1]) {check = true;
			break;
			}
		}
		if (check) {
			System.out.println("Массив не идет по возрастающей");
		} else {
			System.out.println("Массив идет по возрастающей");
		}
			
	}
		
		
/*		if (mas[0] < mas[1]; mas[0] < mas[2]; mas[1] < mas[2]) {
			System.out.println("Введенные данные идут по возрастающей");
			else if (first > second, first > third, second > third) {
				System.out.println("Введенные данные не идут по возрастающей");
			}
		}*/
	
		


	public static void enterArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
		mas[i] = rand.nextInt(100);
		}
		
	}	
	
	public static void printArray(int[] mas) {
		System.out.println("--------------------------------------------");
		for (int i = 0; i < mas.length; i++) {
		System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		}
		
}
