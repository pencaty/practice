package practice4;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student("Lee");
		Lee.addBook("태백산맥1");
		Lee.addBook("태백산맥2");
		Lee.showBookList();
		
		Student Kim = new Student("Kim");
		Kim.addBook("토지1");
		Kim.addBook("토지2");
		Kim.addBook("토지3");
		Kim.showBookList();
		
		Student Park = new Student("Park");
		Park.addBook("해리포터1");
		Park.addBook("해리포터2");
		Park.addBook("해리포터3");
		Park.addBook("해리포터4");
		Park.addBook("해리포터5");
		Park.addBook("해리포터6");
		Park.showBookList();	

	}

}
