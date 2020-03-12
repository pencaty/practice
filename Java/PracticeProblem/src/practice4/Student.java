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
		System.out.print(this.name + "학생이 읽은 책 : ");
		for(Book book : booklist) {
			System.out.print(book.getTitle() + " ");
		}
		System.out.println("입니다.");
	}
}
