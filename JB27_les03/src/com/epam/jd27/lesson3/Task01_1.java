package com.epam.jd27.lesson3;

import java.util.Scanner;

public class Task01_1 {

	// Примените при решении задач из листингов l3-5, l3-6, l3-7, l3-8 процедурную
	//декомпозицию – оформите решения как совокупность взаимоствязанных методов,
	//каждый из которых выполняет одно действие
	
	
	
	public static void main(String[] args) {
		int n = 10;
		String max = "", min = "", str = "";
		
		for (int i = 0; i < n; i++) {
		System.out.print("> ");
		
		str = reader();
		
		if (i == 0) {
		min = str;
		}
		
		max = getMax(max, str);
		
		
		min = getMin(min, str);
		
		}
				
		infoMessage(min, max);
				
		}
	
	public static String reader() {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextLine()) 
		return sc.nextLine();
		
		return "";
		
	}
	
	public static String getMax(String max, String str) {
		
		if (str.length() > max.length()) {
		max = str;
		} 
		
		return max;
	}
	
	public static String getMin(String min, String str) {
		
		if (str.length() < min.length()) {
		min = str;
		} 
		
		return min;
	}
	
	public static void infoMessage(String min, String max) {
		
		System.out.println("max string = " + max + " length=" + max.length());
		System.out.println("min string = " + min + " length=" + min.length());
		
	}
	
}
