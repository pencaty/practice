package iostream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) throws IOException {

		try (FileInputStream fis = new FileInputStream("input.txt")){ // try-with-resource 형식으로 FileInputTest1.java를 구현
			int i;
			while( (i = fis.read()) != -1) { // EOF = -1
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("END");
	}

}
