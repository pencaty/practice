package iostream.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest2 {

	public static void main(String[] args) {

		//try(FileOutputStream fos = new FileOutputStream("output.txt", true)) { // 이어서 쓰기
		try(FileOutputStream fos = new FileOutputStream("output.txt")) {
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}
		catch (IOException e) {
			System.out.println(e);
		}

	}

}
