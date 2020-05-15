package stream.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt"); // 1 byte�� ����. multi-byte(�ѱ�) �������� FileInputReader �̿�
			
			int i;
			while( (i = fis.read()) != -1) { // EOF = -1
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("END");
	}

}
