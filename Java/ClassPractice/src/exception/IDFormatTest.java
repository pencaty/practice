package exception;

public class IDFormatTest {

	private String userID;
	 
	
	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("ID cannot be null");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("ID length should be between 8 and 20");
		}
		
		this.userID = userID;
	}


	public static void main(String[] args) {

		IDFormatTest idTest = new IDFormatTest();
		String myID = null;
		
		try {
			idTest.setUserID(myID);
		}
		catch (IDFormatException e) { // custom exception / 사용자 정의 exception
			System.out.println(e);
		}
		
		myID = "abcabc";
		
		try {
			idTest.setUserID(myID);
		}
		catch (IDFormatException e) {
			System.out.println(e);
		}
	}

}
