package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()) { // obj가 자동으로 close됨
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
