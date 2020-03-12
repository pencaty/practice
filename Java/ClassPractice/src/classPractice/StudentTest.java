package classPractice;

public class StudentTest {
	
	public static int calcSum() {
		int sum = 0, i;
		
		for(i=0; i<=100;i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {

		Student Lee = new Student("Lee");
		
		Lee.setKoreaSubject("korea", 81);
		Lee.setMathSubject("math", 79);
		
		Lee.showStudentInfo();
		
		Student Son = new Student("Son");
		Son.showStudentInfo();
		
		Son.setKoreaSubject("korea", 100);
		Son.setMathSubject("math", 95);
		
		Student No = new Student();
		No.showStudentInfo();
		
		System.out.println(calcSum());
		
		Lee.showStudentScore();
		Son.showStudentScore();
		
	}

}
