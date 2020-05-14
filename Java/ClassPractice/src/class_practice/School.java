package class_practice;

public class School {
	
	private static School instance = new School();
	
	private School() {}
	
	public static School getInstnace() { // 외부에서 instance 생성과 상관없이 외부에서 가져올 수 있게 하기 위해 static
		if(instance == null)
			instance = new School();
		
		return instance;
	}
	
}
