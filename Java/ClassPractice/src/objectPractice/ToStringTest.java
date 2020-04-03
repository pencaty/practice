package objectPractice;

class Book implements Cloneable {
	String title;
	String author;
	
	public Book (String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() { // Object class 내에 있는 method (최상위 클래스)
		//return super.toString();
		return author + "," + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book = new Book("book1", "Ann");
		
		System.out.println(book);
		
		String str = new String("book1");
		System.out.println(str);
		System.out.println(str.toString());
		
		Book book2 = (Book) book.clone();
		System.out.println(book2);

	}

}
