package com.huseyinaydin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\husey\\Desktop\\pro.png");
		if(file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] buffer = new byte[1024];
			int length = 0;
			while((length = fileInputStream.read(buffer)) != -1) {
				System.out.println(Arrays.toString(buffer));
			}
			if(fileInputStream != null)
				fileInputStream.close();
		}
	}
}
