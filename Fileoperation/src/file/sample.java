package file;

import java.io.File;
import java.io.IOException;

public class sample {
	public static void main(String[] args) throws IOException {
//		File f = new File("C:\\Users\\shiva\\Documents\\aswin\\new txt\\");
		
//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);
//		
//		boolean mkdirs = f.mkdirs();
//		System.out.println(mkdirs);
//		
//		boolean newFile = f.createNewFile();
//		System.out.println(newFile);
//		
//		boolean directory = f.isDirectory();
//		System.out.println(directory);
//		
//		boolean file = f.isFile();
//		System.out.println(file);
		
//		String[] list = f.list();
//		
//		System.out.println("\nlist:");
//		
//		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
			
//			System.out.println("\nislistfiles:");
//		
//			File[] listFiles = f.listFiles();
//			
//			for (File file1 : listFiles) {
//				System.out.println(file1);
//			}
		
		File f = new File("C:\\Users\\shiva\\Documents\\hariha\\pavi");
		
//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);
		
//		boolean exists = f.exists();
//		System.out.println(exists);
		
		
//		boolean mkdirs = f.mkdirs();
//		System.out.println(mkdirs);

//		boolean newFile = f.createNewFile();
//		System.out.println(newFile);
		
//		boolean canWrite = f.canWrite();
//		System.out.println("write"+canWrite);
//		
//		boolean canRead = f.canRead();
//		System.out.println("read"+canRead);
//		
//		boolean canExecute = f.canExecute();
//		System.out.println("execute"+canExecute);
//		
//		
//		boolean directory = f.isDirectory();
//		System.out.println(directory);
//		
//		boolean file = f.isFile();
//		System.out.println(file);
//		
//		
//		String[] list = f.list();
//		for (int i = 0; i < list.length; i++){
//			System.out.println(list[i]);
//		}
		
		File[] listFiles = f.listFiles();
		
		for (File file : listFiles) {
			System.out.println(file);
		}
		
		
		
		
			
		}				

}
