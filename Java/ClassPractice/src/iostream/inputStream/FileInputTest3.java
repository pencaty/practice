package iostream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest3 {

	public static void main(String[] args) throws IOException {

		try (FileInputStream fis = new FileInputStream("input2.txt")){ // try-with-resource 형식으로 FileInputTest1.java를 구현
			int i;
			byte[] bs = new byte[10]; // 10개씩 읽도록.
			while( (i = fis.read(bs)) != -1) { // EOF = -1
				/*
				for(byte b : bs) {
					System.out.print((char)b); // 마지막 QRST -> buffer에 남은 garbage
				}
				System.out.println();
				*/
				
				for(int j=0; j<i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
