package com.huseyinaydin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("hello.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line = "";
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
		inputStreamReader.close();
	}

}
