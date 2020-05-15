package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw"); // read/write 가능. C에서의 File과 유사 (Java의 File은 read/write 불가능)
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14);
		rf.writeUTF("안녕");
		
		rf.seek(0); // read/write하는 위치(pointer)를 처음 위치로 바꾸기
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		rf.close();
	}

}
