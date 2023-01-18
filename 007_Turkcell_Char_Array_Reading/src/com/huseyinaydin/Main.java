package com.huseyinaydin;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		int count = 0;
		File file = new File("hello.txt");
		FileReader fileReader = new FileReader(file);
		int c = 0;
		long now = System.currentTimeMillis();
		char[] buffer = new char[1024];
		int length = 0;
		StringBuilder builder = new StringBuilder();
		while (count < 1000) {
			
			while ((length = fileReader.read(buffer)) != -1) {
				// builder.append(buffer); --boş karakter okumayı önleme amaçlı.!
				builder.append(Arrays.copyOfRange(buffer, 0, length));
			}
			System.out.println(builder.toString());
			builder.delete(0, builder.length());
			System.out.println(System.currentTimeMillis() - now);
			count++;
			System.out.println("---- ---- ---- ----");
		}
		fileReader.close();
	}

}
