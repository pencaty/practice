package practice4;

import java.util.ArrayList;

public class Student {
	String name;
	
	ArrayList<Book> booklist;
	
	public Student(String name) {
		this.name = name;
		
		booklist = new ArrayList<Book>();
	}
	
	public void addBook(String title) {
		Book book = new Book();
		
		book.setTitle(title);
		booklist.add(book);
		
	}
	
	public void showBookList() {
		System.out.print(this.name + "�л��� ���� å : ");
		for(Book book : booklist) {
			System.out.print(book.getTitle() + " ");
		}
		System.out.println("�Դϴ�.");
	}
}
