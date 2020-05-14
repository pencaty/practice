package iostream.inputStream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {

		Console console = System.console(); // Eclipse에서 호환 안됨. 콘솔창에서 가능
		
		System.out.println("Name : ");
		String name = console.readLine();
		System.out.println("Password : ");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
	}

}

