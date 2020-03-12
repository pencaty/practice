package classPractice;

public class SchoolTest {
	public static void main(String[] args) {
		School school1 = School.getInstnace(); // singleton pattern - 하나만 있어야 하는 경우
		School school2 = School.getInstnace();
		
		System.out.println(school1);
		System.out.println(school2);
		
	}	
}
