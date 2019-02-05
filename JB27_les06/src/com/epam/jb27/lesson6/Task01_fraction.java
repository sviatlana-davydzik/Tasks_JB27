package com.epam.jb27.lesson6;

public class Task01_fraction {

	public static void main(String[] args) {
		
		Fraction[] k = new Fraction[3];
		
		k[0] = new Fraction(2,6);
		k[1] = new Fraction(1,5);
		k[2] = new Fraction(8,7);
		
		for (int i = 0; i< k.length; i++) {
			
		System.out.println("new value " + k[i]);
		
		}
	}

}
