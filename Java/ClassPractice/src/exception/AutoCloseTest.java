package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()) { // obj�� �ڵ����� close��
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
