package classPractice;

public class Student {
	
	//public int studentID;
	public int id;
	public String studentName;
	public String address;
	public boolean graduated;
	
	Subject korea;
	Subject math;
	
	public Student() {
		this(0, "No Name");
	}
	
	public Student(int id, String name) {
		//studentID = id;
		this.id = id;
		studentName = name;
		address = "No Address";
		
		korea = new Subject();
		math = new Subject();
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
		System.out.println(studentName + "," + address);
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점");
	}
	
	public String getStudentName() {
		return studentName;
	}

	
}
