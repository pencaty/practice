package interface_practice.book;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("book1");
		bookQueue.enQueue("book2");
		bookQueue.enQueue("book3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());

	}

}
