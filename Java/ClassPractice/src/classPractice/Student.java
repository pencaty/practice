package classPractice;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	public boolean graduated;
	
	public Student() {}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "No Address";
	}
	
	public void showStudentInfo() { // method
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
}
