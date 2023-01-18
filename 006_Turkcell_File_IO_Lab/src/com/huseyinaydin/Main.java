package com.huseyinaydin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File outputFile = new File("hello.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
		fileOutputStream.write("Merhaba Hüseyin gardaş nassın hıdır?".getBytes());
		fileOutputStream.close();
		
		File inputFile = new File("hello.txt");
		FileInputStream fileInputStream = new FileInputStream(inputFile);
		int c = 0;
		while((c = fileInputStream.read()) != -1) {
			System.out.println((char) c);
		}
		fileInputStream.close();
		
		
	}

}
