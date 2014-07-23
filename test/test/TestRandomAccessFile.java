package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
	public static void main(String[] args) {
		try {
			RandomAccessFile file = new RandomAccessFile("/home/wcao/Pictures/rfile.dat", "rw");
			for(int i = 0; i < 10; i ++)
				file.write(i);
			file.close();
			RandomAccessFile file2 = new RandomAccessFile("/home/wcao/Pictures/rfile.dat", "rw");
			for(int i = 0; i < 10; i ++){
				int temp = file2.read();
				System.out.println(temp);
				
			}
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
