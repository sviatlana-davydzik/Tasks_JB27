package com.epam.jb27.lesson02;

import java.util.Scanner;

public class Task01 {
	
	public static void main(String[] args) {
	int n = 10;

	Scanner sc = new Scanner(System.in); //����������� ������ Scanner, ������� ��������� ���� � ����������
	String max = "", min = "", str = ""; //���������� ����������
	
	for (int i = 0; i < n; i++) { //���������� ����� � ����������� ���������� = n
		System.out.print("> ");
	if (sc.hasNextLine()) {  //����� ���������, �������� �� ��������� ������ �������
		str = sc.nextLine(); //����� ���������� � ��������� ������, ������� ��� ��������� ������, ���������� �� �� �������
	if (i == 0) { //��������� ������� ������������ ��������
		min = str;
	}
	
	if (str.length() > max.length()) { 
		max = str; 								//���� ����� ���������� str ������ ����������� ������������ �����, �� ������� � �������, ��� ���������� str - max
	} else if (str.length() < min.length()) {
		min = str;								// ����� ������� � �������, ��� ���������� str - min
	}
	}
	}
	System.out.println("max string = " + max + " length=" + max.length()); // ����� � �������
	System.out.println("min string = " + min + " length=" + min.length());
	}
		

}
