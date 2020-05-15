package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable { // Serialization : ����ȭ. �ν��Ͻ� ���� �״�� ����/���� �� deserialization(����)�ϴ� ��.
// class Person implements Externalizable { // object�� �а� ���� ���� ���� ������ �� ����	
	String name;
	String job;
	//transient String job; // transient : serialization(����ȭ) ���� �ʴ� ����
	
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
		Person Kim = new Person("Kim", "teacher"); // instance ����
		
		try (FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) { // ���� stream
			oos.writeObject(Lee);
			oos.writeObject(Kim);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		try (FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) { // ���� stream
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
