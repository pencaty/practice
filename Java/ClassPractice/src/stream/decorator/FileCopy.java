package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) throws IOException {

		long millisecond = 0;
		
		/*
		 try( FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")) { 
		 */
		
		try( FileInputStream fis = new FileInputStream("a.zip"); // 5KB ������ a.zip�� ���� �� ��������.
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis); // bufferedInputStream -> ���� stream
				BufferedOutputStream bos = new BufferedOutputStream(fos)) { // BufferedInput/OutputStream -> �ð� ���� (8K��ŭ�� buffer size)
			
			millisecond = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		Socket socket = new Socket();
		
		// ���� stream ���� ���� ��� stream�� ���δ� �� -> decorator pattern
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
		
		socket.close();
		
		System.out.println("Time : " + millisecond);

	}

}
