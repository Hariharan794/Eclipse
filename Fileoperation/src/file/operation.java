package file;

import java.io.File;
import java.io.IOException;


public class operation {
public static void main(String[] args) throws IOException {
		
		File f  = new File("C:\\Users\\shiva\\Documents\\file operation\\operations\\ppt.txt");
		
//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);
		
//		boolean mkdirs = f.mkdirs();
//		System.out.println(mkdirs);
		
//		boolean newFile = f.createNewFile();
//		System.out.println(newFile);
		
//		String[] list = f.list();
//		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//		}
		
//		File[] listFiles = f.listFiles();
//		for (int i = 0; i < listFiles.length; i++) {
//			System.out.println(listFiles[i]);
//		}
		
		boolean directory = f.isDirectory();
		System.out.println(directory);
		
//		boolean file = f.isFile();
//		System.out.println(file);
		
		
		
		
		
		
	
	}

}
