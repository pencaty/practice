package iostream.inputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIntest {

	public static void main(String[] args) {

		System.out.println("INPUT");
		
		try {
			int i;
			
			InputStreamReader isr = new InputStreamReader(System.in);
			
			/*
			while((i = System.in.read()) != 'A') {
				System.out.println((char)i);
			}
			*/
			
			while((i = isr.read()) != 'A') {
				System.out.println((char)i);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
