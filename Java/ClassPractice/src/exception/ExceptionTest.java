package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {

		/*
		FileInputStream fis = null;
		try {
			//fis = new FileInputStream("a.txt");
			fis = new FileInputStream("b.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		finally { // finally : 항상 실행
			try {
				fis.close();
				System.out.println("finally");
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("END");
		*/
		
		try(FileInputStream fis = new FileInputStream("b.txt")) { // try-with-resource -> 따로 close 하지 않아도 자동으로 close됨
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
