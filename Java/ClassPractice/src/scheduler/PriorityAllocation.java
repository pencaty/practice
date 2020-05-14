package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("bring customer with high grade");
		
	}

	@Override
	public void sendCalltoAgent() {
		System.out.println("allocate to high-level employee");
		
	}

}
