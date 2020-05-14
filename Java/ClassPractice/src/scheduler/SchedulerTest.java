package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("Select allocation method");
		System.out.println("R : RoundRobin");
		System.out.println("L : Least Job");
		System.out.println("P : priority Allocation");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r')
			scheduler = new RoundRobin();
		else if(ch == 'L' || ch == 'l')
			scheduler = new RoundRobin();
		else if(ch == 'P' || ch == 'p')
			scheduler = new RoundRobin();
		else {
			System.out.println("No function");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCalltoAgent();
		

	}

}
