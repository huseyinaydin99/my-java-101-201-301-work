package com.huseyinaydin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//writeFile();
		readFile();
	}
	
	public static void writeFile() throws IOException {
		File file = new File("data.dat");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		Scanner scanner = new Scanner(System.in);
		String line = "";
		while(!line.equals("quit")) {
			System.out.println("Kelime gir: ");
			line = scanner.next();
			fileOutputStream.write(line.getBytes());
			System.out.println(line);
		}
		fileOutputStream.close();
	}
	
	public static void readFile() throws IOException {
		File file = new File("data.dat");
		FileInputStream fileInputStream = new FileInputStream(file);
		int c = 0;
		while ((c = fileInputStream.read()) != -1) {
			System.out.println((char)c);
		}
		fileInputStream.close();
	}
}
