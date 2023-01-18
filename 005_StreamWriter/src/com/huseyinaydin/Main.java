package com.huseyinaydin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws IOException {
		/*writeFile();
		readFile();
		
		Abc a = new Abc();
		a.yaz(n->{
			Integer a = 5;
			return a * n;
		});
		FileReader fileReader = new FileReader(new File(""));*/
		
		Iterator<String> iterator = Arrays.asList("t","v","a").iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
	}
	
	private static void writeFile() throws IOException {
		File file = new File("hello.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//bu dönüştürücü
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);//karakterden byte'a dönüştürerek yazıyor.!
		outputStreamWriter.write("Merhaba dünya.!");
		outputStreamWriter.close();
	}
	
	private static void readFile() throws IOException {
		File file = new File("hello.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		//bu dönüştürücü
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);//karakterden byte'a dönüştürerek okuyor.!
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line = "";
		while((line = bufferedReader.readLine()) != null) {
			System.err.print(line);
			System.out.print(" - ");
			System.out.print(line);
			System.out.println(System.lineSeparator());
		}
		bufferedReader.close();
		inputStreamReader.close();
		fileInputStream.close();
		
	}
	@FunctionalInterface
	interface Araba{
		float uygula(int n);
	}
	
	class Abc{
		public float yaz(Araba araba) {
			return araba.uygula(5);
		}
	}
	


}
