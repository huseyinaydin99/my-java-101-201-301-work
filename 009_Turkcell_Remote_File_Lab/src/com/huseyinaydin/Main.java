package com.huseyinaydin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.apache.org/licenses/LICENSE-2.0.txt");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		FileOutputStream fileOutputStream = new FileOutputStream(new File("yazilan.txt"));
		char[] buffer = new char[1024];
		StringBuilder builder = new StringBuilder();
		int length = 0;
		while ((length = inputStreamReader.read()) != -1) {
			char[] readed = Arrays.copyOfRange(buffer, 0, length);
			builder.append(readed);
			fileOutputStream.write(String.valueOf(readed).getBytes());
		}
		System.out.println(builder.toString());
		inputStreamReader.close();
	}

}
