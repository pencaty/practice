package class_practice;

public class School {
	
	private static School instance = new School();
	
	private School() {}
	
	public static School getInstnace() { // �ܺο��� instance ������ ������� �ܺο��� ������ �� �ְ� �ϱ� ���� static
		if(instance == null)
			instance = new School();
		
		return instance;
	}
	
}
