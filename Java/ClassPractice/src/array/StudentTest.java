package array;

public class StudentTest {

	public static void main(String[] args) {
		
		Student Lee = new Student(1001, "Lee");
		Lee.addSubject("Math", 95);
		Lee.addSubject("English", 95);
		
		Student Kim = new Student(1002, "Kim");
		Kim.addSubject("Korean", 100);
		Kim.addSubject("Math", 85);
		Kim.addSubject("English", 95);
		
		Lee.showStudentInfo();
		Kim.showStudentInfo();

	}

}
