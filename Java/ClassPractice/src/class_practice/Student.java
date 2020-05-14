package class_practice;

public class Student {
	
	public int studentID;
	public String studentName;
	public boolean graduated;
	
	private static int id = 1000;
	
	Subject korea;
	Subject math;
	
	public Student() {
		this("No Name");
	}
	
	public Student(String name) {
		studentID = id;
		studentName = name;
		id++;
		
		korea = new Subject();
		math = new Subject();
	}
	

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Student.id = id;
	}

	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentInfo() { // method
		System.out.println(studentName + "," + this.id);
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점");
	}
	
	public String getStudentName() {
		return studentName;
	}

	
}
