package com.epam.jd27.lesson3;

public class Task02 {

	public static void main(String[] args) {
		
		double a = 0; //������ �������
		double b = 6; //����� �������
		double c = 1; //���
		int i = 1; //����� ����
		double x; //������� �������� ���������
		double F;
		
		for (x=a; x<=b; x= x + c) {
			
		        F=2*Math.tan(x/2) + 1;
		        
		        System.out.println(x + " | result: " + F);
		            
		}
		
	}
	
}
