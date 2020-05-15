package thread;

class Bank3 {
	private int money = 10000;
	
	public void saveMoney(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	public void minusMoney(int save) {
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

class Park3 extends Thread {
	public void run() {
		synchronized(SyncTest3.myBank) {
			System.out.println("start save");
			SyncTest.myBank.saveMoney(3000);
			System.out.println("save money = " + SyncTest.myBank.getMoney());
		}
	}
}

class ParkWife3 extends Thread {
	public void run() {
		synchronized(SyncTest3.myBank) { // 아래 부분이 돌아가는 동안 SyncTest3.myBank 에 접근 X
			System.out.println("start minus");
			SyncTest.myBank.minusMoney(1000);
			System.out.println("left money = " + SyncTest.myBank.getMoney());
		}
	}
}

public class SyncTest3 {
	
	public static Bank3 myBank = new Bank3(); // critical resource. Threads가 share -> synchronization 필요

	public static void main(String[] args) throws InterruptedException {

		Park3 p = new Park3();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife3 pw = new ParkWife3();
		pw.start();

	} 

}
