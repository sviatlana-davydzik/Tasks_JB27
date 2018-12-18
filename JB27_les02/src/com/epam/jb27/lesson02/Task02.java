package com.epam.jb27.lesson02;

public class Task02 {

	public static void main (String[] args) {
		
		double a, b, c, d, e;
		a = 1.1;
		b = 2.3;
		c = 1.5;
		e = 3;
		
		double temp = Math.sqrt(b * b + 4 * a * b) ;
		
		double pow = Math.pow(a, e);
		
		if (a != 0) {
			d = b/(2*a) + temp/(2*a) - pow * c + b;
			} else {
			System.out.println("Знаменатель равен нулю.");
			d = Double.NaN;
			}
		
		System.out.println("result = " + d);
		
	}
	
}
