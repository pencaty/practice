package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {

		ThrowException test = new ThrowException();
		
		try {
			//test.loadClass("a.txt", "java.lang.string");
			//test.loadClass("b.txt", "java.lang.string");
			test.loadClass("except_test.txt", "java.lang.String");
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		catch (Exception e) { // 최상위 exception (default exception) --> multiple exceptions 중 가장 뒤
			System.out.println(e);
		}
		
		System.out.println("End");
	}

}
