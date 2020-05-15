package thread.library;

import java.util.ArrayList;

class Library {
	public ArrayList<String> books = new ArrayList<String>();
	
	public Library() {
		books.add("book1");
		books.add("book2");
		books.add("book3");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		
		//if(books.size() == 0) { // notifyAll() 대신 notify()를 쓸 경우
		while(books.size() == 0) {
			System.out.println(t.getName() + " waiting starts");
			wait();
			System.out.println(t.getName() + " waiting ends");
		}
		
		String title = books.remove(0);
		System.out.println(t.getName() + " : " + title + " lend");
		return title;
	}
	
	public synchronized void returnBook(String title) {
		Thread t = Thread.currentThread();
		books.add(title);
		//notify(); // wait하고 있는 threads 중 임의의 하나를 깨운다 -> unfair 할 수도 있음 -> notifyAll을 하여 모든 thread를 꺠운 후 다시 scheduler에 의해 wait 상태로 되도록
		notifyAll();
		System.out.println(t.getName() + " : " + title + " return");
	}
}

class Student extends Thread {
	public void run() {
		try {
			String title = LibraryMain.library.lendBook();
			if(title == null) {
				return;
			}
			sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class LibraryMain {

	public static Library library = new Library(); // shared resource
	
	public static void main(String[] args) {

		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		Student std4 = new Student();
		Student std5 = new Student();
		Student std6 = new Student();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();

	}

}
