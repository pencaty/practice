package classPractice;

public class SchoolTest {
	public static void main(String[] args) {
		School school1 = School.getInstnace(); // singleton pattern - �ϳ��� �־�� �ϴ� ���
		School school2 = School.getInstnace();
		
		System.out.println(school1);
		System.out.println(school2);
		
	}	
}
