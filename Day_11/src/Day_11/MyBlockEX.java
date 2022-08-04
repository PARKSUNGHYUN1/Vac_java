package Day_11;

import java.awt.dnd.DropTargetDragEvent;

class ATM implements Runnable{
	private long depositeMoney = 10000;
	
	public void run() {
		synchronized (this) {
			for(int i=0; i<10; i++) {
				try {
					Thread.sleep(1000);
					notify();
					wait();
					
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				if(getDepositeMonety() <= 0)
					break;
				withDraw(1000);
			}
		}
	}
	public void withDraw(long howMuch) {
		if(getDepositeMonety() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName()+ " , ");
			System.out.printf("pay : %d  %n", getDepositeMonety());
		}else {
			System.out.print(Thread.currentThread().getName()+ " , ");
			System.out.println("end.");
		}
	}
	public long getDepositeMonety() {
		return depositeMoney;
	}
}

public class MyBlockEX {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		
		mother.start();
		son.start();
	}
}
