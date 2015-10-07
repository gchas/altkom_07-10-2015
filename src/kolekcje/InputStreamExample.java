package kolekcje;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File source = new File("C:/lab/projects/travel/from.txt");
		File dest = new File("C:/lab/projects/travel/to.txt");
		
		InputStream in = new FileInputStream(source);		
		OutputStream out = new FileOutputStream(dest);
		
		int a = -1;
		
		try {
		
			while ((a = in.read()) != -1) {
				
				out.write(a);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			
			in.close();
			out.close();
		}
		
	}

}
