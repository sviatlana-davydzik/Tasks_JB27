package com.epam.jb27.lesson01;

public class Task04 {

	public static void main(String[] args) {
		
		double a,b; // два катета
		double d; // гипотенуза
		double s; // площадь 
		
		a=2;
		b=3;
		
		s = 0.5 * a * b;
		d = Math.sqrt(a*a + b*b);
		
		System.out.println("Площадь: " + s);
		System.out.println("Гипотенуза: " + d);
		
		
	}
}
