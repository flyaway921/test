package test;

import java.io.File;
import java.io.IOException;

public class TestDeleteFiles {
	public static void main(String[] args) throws IOException {
		File file = new File("/home/wcao/Pictures/temp");
		File[] files = file.listFiles();
		for(File f : files){
			System.out.println(f.toURI().getPath());
			f.delete();
		}
		System.out.println(file.list().length);
	}

}
