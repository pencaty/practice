package practice4;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student("Lee");
		Lee.addBook("�¹���1");
		Lee.addBook("�¹���2");
		Lee.showBookList();
		
		Student Kim = new Student("Kim");
		Kim.addBook("����1");
		Kim.addBook("����2");
		Kim.addBook("����3");
		Kim.showBookList();
		
		Student Park = new Student("Park");
		Park.addBook("�ظ�����1");
		Park.addBook("�ظ�����2");
		Park.addBook("�ظ�����3");
		Park.addBook("�ظ�����4");
		Park.addBook("�ظ�����5");
		Park.addBook("�ظ�����6");
		Park.showBookList();	

	}

}
