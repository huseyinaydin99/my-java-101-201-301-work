package com.huseyinaydin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dosya yolu gir: ");
		String filePath = scanner.next();
		File file = new File(filePath);
		boolean fileStatu = false;
		if(!file.exists()) fileStatu = file.createNewFile();
		else System.out.println("Dosya zaten var.!");
		
		if(fileStatu) System.out.println("Dosya oluşturuldu.!");
		
		FileWriter fileWriter = new FileWriter(file);
		String line = null;
		do {
			line = scanner.nextLine();
			fileWriter.write(line+"\n");
			fileWriter.write(System.lineSeparator()); //işletim sisteminin satır ayracı.!
		}while(!line.equals("quit"));
		fileWriter.close();
		scanner.close();
		System.out.println("Program bitti.! Dosya kapandı.! Dosya boyutu bytes cinsinden: " + file.length() + " bytes");
	}

}
