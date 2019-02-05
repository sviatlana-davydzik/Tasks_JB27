package com.epam.jb27.lesson12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		
		List<String> library = new ArrayList<String>();

		File file = new File("test.txt");

		String text = "Book, Ivanova, 2015, 10, English, A1, \r\n" + "Book, Petrova, 2016, 15, Math, A2\r\n"
				+ "Book, Sidorova, 2017, 20, History, B1";

		try (FileWriter fw = new FileWriter(file)) {
			
			fw.write(text);
			
		} catch (IOException e) {
			
			System.out.println(e);
			
		}
		
		try (FileReader fr = new FileReader(file)) {
			
			Scanner sc = new Scanner(fr);

			while (sc.hasNextLine()) {

				library.add(sc.nextLine());

			}
			
		} catch (IOException e) {
			
			System.out.println(e);
			
		}
			
		System.out.println(library);

	}

}
