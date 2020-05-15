package thread;
/*
class MyThread extends Thread {
	
	public void run() {
		int i;
		for(i=0; i<=200; i++) {
			System.out.print(i + "\t");
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
*/

class MyThread implements Runnable {

	@Override
	public void run() {
		int i;
		for(i=0; i<=200; i++) {
			System.out.print(i + "\t");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("Start");
		/*
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		*/
		
		MyThread runner1 = new MyThread();
		Thread th1 = new Thread(runner1);

		MyThread runner2 = new MyThread();
		Thread th2 = new Thread(runner2);
		
		th1.start();
		th2.start();
		
		/*
		 Thread t = Thread.currentThread();
		 System.out.println(t); // -> thread 이름 / thread priority/ 현재 thread가 어느 group에 속하는지
		 */
		
		System.out.println("End"); // 총 3개의 thread : Main, th1, th2
	}
	
}
