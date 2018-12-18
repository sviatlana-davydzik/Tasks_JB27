package com.epam.jb27.lesson4;

public class Task04 {

	public static void main(String[] args) {
		
		int[] mas = new int[10];
		
		mas[0] = 0;
		mas[1] = 1;
		mas[2] = 2;
		mas[3] = 3;
		mas[4] = 4;
		mas[5] = 0;
		mas[6] = 1;
		mas[7] = 2;
		mas[8] = 3;
		
		int[] mas_result;
		
		int count = 0;
		
		for (int i = 0; i< mas.length; i++) {
			
			if (mas[i] == 0) {
				count ++;
			}		
			
		}
		
		mas_result = new int[count];
		
		count = 0;
		
		for (int i = 0; i< mas.length; i++) {
			if (mas[i] == 0) {
				mas_result[count] = i;
				count ++;
			}
		}	
		
		System.out.println("Массив с нулевыми элементами: ");
		
		for (int i = 0; i< mas_result.length; i++) {
			System.out.println("Нулевой элемент с номером: " + mas_result[i]);
		}
}
}