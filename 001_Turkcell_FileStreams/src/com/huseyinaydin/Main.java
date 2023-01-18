package com.huseyinaydin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		writeFile("C:\\Users\\husey\\Desktop", "hello.txt", "Selamlar");
		String readedFileString = readFile("C:\\\\Users\\\\husey\\\\Desktop", "hello.txt");
		System.out.println(readedFileString);
	}
	
	private static void writeFile(String filePath, String fileName, String fileContent) {
		File file = new File(filePath + fileName);
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(fileContent.getBytes());
		} catch (IOException e) {
			System.err.println(e.getMessage());
			if(fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e1) {
					System.err.println(e1.getMessage());
				}
			}
		}
	}
	
	private static String readFile(String filePath, String fileName) {
		File file = new File(filePath + fileName);
		FileInputStream fileInputStream = null;
		int readed = 0;
		int readedTotal = 0;
		String totalString = "";
		System.out.println("ASCII AMERICAN STANDART CODE FOR INFORMATIN INTERCHANGE");
		try {
			fileInputStream = new FileInputStream(file);
			while ((readed = fileInputStream.read()) != -1) {
				readedTotal += readed;
				System.out.println(("Karakter: " + (char)readed) + " Karakter ASCII karşılığı: " + readed);
				totalString += (char) readed;
			}
			System.out.println((char) readedTotal);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e1) {
					System.err.println(e1.getMessage());
				}
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
			try {
				fileInputStream.close();
			} catch (IOException e1) {
				System.err.println(e1.getMessage());
			}
		}
		return totalString;
	}

}
