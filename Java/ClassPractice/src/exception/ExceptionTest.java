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
		finally { // finally : �׻� ����
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
		
		try(FileInputStream fis = new FileInputStream("b.txt")) { // try-with-resource -> ���� close ���� �ʾƵ� �ڵ����� close��
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
