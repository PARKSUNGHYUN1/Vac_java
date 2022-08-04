package Day_11;

public class SingleTheadEX implements Runnable{//extends Thread{
	private int[] temp;
	static SingleTheadEX st = new SingleTheadEX();
	static Thread th = new Thread(st);
	
	public SingleTheadEX() {
		Thread thread = new Thread();
		temp = new int[10];
		for(int start=0; start<temp.length; start++) {
			temp[start] = start;
		}
	}
	@Override
	public void run() {
		for(int start : temp) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("Thread : %s ,", Thread.currentThread());
			System.out.printf("temp value : %d %n",start);
		}
	}
	public static void main(String[] args) {
		SingleTheadEX st = new SingleTheadEX();
		Thread th = new Thread(st, "First");
		th.setName("first");
		th.start();
	}
}
