package com.epam.jb27.lesson4;

import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		
		int k = 2;
		double w;
		int[] ar = new int[5];
		double sum = 0;
		Scanner sc = new Scanner(System.in);
	
		for (int i=0; i < ar.length; i++) {
			System.out.print("¬ведите значение: ");
			if (sc.hasNextInt()) {
			ar[i] = sc.nextInt();
			}
		}
		
		for (int i=0; i < ar.length; i++) {
		if (ar[i]%k == 0) {
			sum = sum + ar[i];
		}
		}	
		System.out.println("Sum = " +sum);
	}
	

}
