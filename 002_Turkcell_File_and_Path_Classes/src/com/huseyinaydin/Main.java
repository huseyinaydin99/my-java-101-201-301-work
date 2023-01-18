package com.huseyinaydin;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<Object, Object> map = getFileInfo("C:\\Users\\husey\\Desktop\\", "hello.txt");
		for (Map.Entry<Object, Object> entry : map.entrySet()) {
			Object key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(key + " " + val);
		}
		
		//--
		
		/*if(deleteFile("C:\\Users\\husey\\Desktop\\", "hello.txt"))
			System.out.println("İlgili dosya silindi.!");
		else
			System.err.println("İlgili dosya silinemedi.!");*/
		
		//--
		
		for (String content : getDirectoryInFoldersAndFiles("C:\\Users\\husey\\Desktop\\")) {
			System.out.println(content);
		}
		
		//--
		
		System.out.println(createFile("C:\\Users\\husey\\Desktop\\", "hello.txt") ? "Dosya oluşturuldu.!" : "Dosya oluşturulamadı.!");
	}
	
	private static Map<Object, Object> getFileInfo(String filePath, String fileName){
		File file = new File(filePath + fileName);
		return Map.of("DosyaYol:",file.getAbsoluteFile(),
				"KlasorYol:",file.getAbsolutePath(),
				"Calistirilabilirmi:",file.canExecute(),
				"Okunabilirmi:", file.canRead(),
				"Yazılabilirmi:",file.canWrite(),
				"Mevcutmu:",file.exists(),
				"Ustklasoru", file.getParent(),
				"Boyutu", file.length(),
				"Sondegismetarihi", new Date(file.lastModified())
		);
		
	}
	
	private static boolean deleteFile(String filePath, String fileName) {
		File file = new File(filePath + fileName);
		return file.delete();
	}
	
	private static String[] getDirectoryInFoldersAndFiles(String directoryPath) {
		File file = new File(directoryPath);
		String[] contents = file.list();
		return contents;
	}
	
	private static boolean createFile(String filePath, String fileName) {
		File file = new File(filePath + fileName);
		if(!file.exists()) {
			try {
				return file.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return false;
	}

}
