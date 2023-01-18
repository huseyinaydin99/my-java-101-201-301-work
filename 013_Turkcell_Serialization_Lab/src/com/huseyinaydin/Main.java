package com.huseyinaydin;

import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		/*ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("Ogrenci.dat")));
		objectOutputStream.writeObject(new Araba(1, "Hüseyin", new Motor(1)));
		objectOutputStream.close();
		
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("Ogrenci.dat")));
		Araba ogr = (Araba)objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(ogr);*/
		
		/*LinkedList<String> myList = new LinkedList<>();

		String first = myList.peek();
		System.out.println(first);*/
		
		/*Console console = System.console();
		System.out.println(console);
		char[] pass = System.console().readPassword("Şifre giriniz: ");
		System.out.println(String.valueOf(pass));*/
	}

}
