package schePractice;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("bring customer in order");
		
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("allocate to least work employee");
		
	}

}
