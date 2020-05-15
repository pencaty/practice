package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable { // Serialization : 직렬화. 인스턴스 상태 그대로 저장/전송 후 deserialization(복원)하는 것.
// class Person implements Externalizable { // object를 읽고 쓰는 것을 직접 구현할 수 있음	
	String name;
	String job;
	//transient String job; // transient : serialization(직렬화) 되지 않는 변수
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
}

public class SerializationTest {

	public static void main(String[] args) {

		Person Lee = new Person("Lee", "engineer");
		Person Kim = new Person("Kim", "teacher"); // instance 상태
		
		try (FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) { // 보조 stream
			oos.writeObject(Lee);
			oos.writeObject(Kim);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		try (FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) { // 보조 stream
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		}
		catch (IOException e) {
			System.out.println(e);
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
