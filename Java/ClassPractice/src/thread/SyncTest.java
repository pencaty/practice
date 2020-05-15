package thread;

class Bank {
	private int money = 10000;
	
	//public void saveMoney(int save) {
	public synchronized void saveMoney(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	//public void minusMoney(int save) {
	public synchronized void minusMoney(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m - save);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

class Park extends Thread {
	public void run() {
		System.out.println("start save");
		SyncTest.myBank.saveMoney(3000);
		System.out.println("save money = " + SyncTest.myBank.getMoney());
	}
}

class ParkWife extends Thread {
	public void run() {
		System.out.println("start minus");
		SyncTest.myBank.minusMoney(1000);
		System.out.println("left money = " + SyncTest.myBank.getMoney());
	}
}

public class SyncTest {
	
	public static Bank myBank = new Bank(); // critical resource. Threads°¡ share -> synchronization ÇÊ¿ä

	public static void main(String[] args) throws InterruptedException {

		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		pw.start();

	} 

}
