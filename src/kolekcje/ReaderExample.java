package kolekcje;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File source = new File("C:/lab/projects/travel/from.txt");
		File dest = new File("C:/lab/projects/travel/to.txt");
		
		FileReader reader = new FileReader(source);
		FileWriter writer = new FileWriter(dest);
				
		int a = 0;
		
		try {
		
			while (++a < source.length()) {
					
					
				
				writer.write(reader.read());
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			
			reader.close();
			writer.close();
		}
	}

}
