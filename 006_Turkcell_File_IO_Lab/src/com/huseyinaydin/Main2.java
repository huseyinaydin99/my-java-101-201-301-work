package com.huseyinaydin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) throws IOException {
		File createdFile = new File("hello.txt");
		if(!createdFile.exists()) {
			System.out.println("Dosya yoktu oluşturuldu.!");
			createdFile.createNewFile();
		}
		else{
			// şu okunacak dosya
			File inputFile = new File("hello.txt");
			// bu yazılacak dosya
			File outputFile = new File("hello2.txt");
			// byte halinde okuma akışı nesnesi
			FileInputStream fileInputStream = new FileInputStream(inputFile);
			// byte halinde yazma akışı nesnesi
			FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
			int readedByte = 0;
			while ((readedByte = fileInputStream.read()) != -1) {
				System.out.println((char) readedByte);
				fileOutputStream.write(Character.toUpperCase((char)readedByte));
			}
			fileInputStream.close();
			fileOutputStream.close();
		}
	}

}
