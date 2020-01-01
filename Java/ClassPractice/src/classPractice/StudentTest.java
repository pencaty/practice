package classPractice;

public class StudentTest {
	
	public static int addNum(int num1, int num2) {
		return num1+num2;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0, i;
		
		for(i=0; i<=100;i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {

		Student Lee = new Student();
		Lee.studentName = "Lee";
		Lee.address = "Daejeon";
		
		Lee.showStudentInfo();
		
		Student Son = new Student(172, "Son");
		Son.showStudentInfo();
		
		System.out.println(addNum(3,5));
		
		sayHello("Hello Java");
		
		System.out.println(calcSum());
		
	}

}
