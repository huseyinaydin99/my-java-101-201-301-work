package com.huseyinaydin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//NOT.!!!
/*
 BufferedWriter'ın Buffer'ı dolduğunda veri dosyaya yazılır. Bu buffer sınırı 8192 BYTE'dır.
 Yahut close(); metodu çalıştığında yazılır.
 
 */

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("hello.txt");
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		Scanner scanner = new Scanner(System.in);
		String line = "";
		int count = 0;
		while(!(line = scanner.next()).equals("quit")) {
			System.out.println(count);
			System.out.println("Kelime gir: ");
			bufferedWriter.write(line + "\r\n");
			if(count >= 4)
				bufferedWriter.flush(); //flush'u görürse veriyi yazar.! hemde Close() çalışmadan ve buffer dolmadan.!
			count++;
		}
		scanner.close();
		bufferedWriter.close();
		fileWriter.close();
	}

}
