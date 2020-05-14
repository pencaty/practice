package object;

class Student {
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		//return super.equals(obj); // 두 개의 address를 비교
		if(obj instanceof Student) {
			Student std = (Student) obj;
			return (this.studentNum == std.studentNum);
		}
		return false;
	}

	@Override
	public int hashCode() {
		//return super.hashCode();
		return studentNum;
		
	}	
}

public class EqualTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // compare memory location
		System.out.println(str1.equals(str2));

		Student Lee = new Student(100, "lee");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "lee");
		
		System.out.println(Lee == Shin);
		System.out.println(Lee.equals(Shin));
		
		System.out.println(Lee);
		System.out.println(Lee.hashCode()); // Java 내 동일한 개체 : equals가 true, hashCode가 같은 값 리턴
		System.out.println(Shin.hashCode());
		
		System.out.println("~~~");
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	}

}
