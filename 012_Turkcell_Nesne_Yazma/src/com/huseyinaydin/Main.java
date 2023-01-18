package com.huseyinaydin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("Ogrenci.dat")));
		objectOutputStream.writeObject(new Ogrenci(1, "Hüseyin"));
		objectOutputStream.close();
		
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("Ogrenci.dat")));
		Ogrenci ogr = (Ogrenci)objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(ogr);
	}

}
