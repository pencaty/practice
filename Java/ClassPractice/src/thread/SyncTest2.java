package thread;

class Bank2 {
	private int money = 10000;
	
	public void saveMoney(int save) {
		synchronized(this) {
			int m = this.getMoney();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney(m + save);
		}
	}
	
	public void minusMoney(int save) {
		synchronized(this) {
			int m = this.getMoney();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney(m - save);
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

class Park2 extends Thread {
	public void run() {
		System.out.println("start save");
		SyncTest.myBank.saveMoney(3000);
		System.out.println("save money = " + SyncTest.myBank.getMoney());
	}
}

class ParkWife2 extends Thread {
	public void run() {
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(1000);
		System.out.println("left money = " + SyncTest.myBank.getMoney());
	}
}

public class SyncTest2 {
	
	public static Bank2 myBank = new Bank2(); // critical resource. Threads�� share -> synchronization �ʿ�

	public static void main(String[] args) throws InterruptedException {

		Park2 p = new Park2();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife2 pw = new ParkWife2();
		pw.start();

	} 

}
