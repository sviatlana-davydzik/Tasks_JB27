package com.epam.jd27.lesson3;

public class Task02 {

	public static void main(String[] args) {
		
		double a = 0; //начало отрезка
		double b = 6; //конец отрезка
		double c = 1; //шаг
		int i = 1; //номер шага
		double x; //текущее значение аргумента
		double F;
		
		for (x=a; x<=b; x= x + c) {
			
		        F=2*Math.tan(x/2) + 1;
		        
		        System.out.println(x + " | result: " + F);
		            
		}
		
	}
	
}
