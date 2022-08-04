package Day_11;

class abc extends Thread{
	@Override
	public void run() {
		String []strArray = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(10);}catch(InterruptedException ie) {}
		for(int i=0; i<strArray.length; i++) {
			System.out.println(" - (자막번호)"+ strArray[i]);
			try {Thread.sleep(200);}catch(InterruptedException ie) {}
		}
	}
}

class cba extends Thread{
	@Override
	public void run() {
		int[] intArray = {1,2,3,4,5,};
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println("(비디오 프레임) "+ intArray[i]);
			try {Thread.sleep(200);}catch(InterruptedException ie) {}
		}
	}
}

public class SMIFileThread {
	public static void main(String[] args) {
		Thread abc = new abc();
		Thread cba = new cba();
		
		abc.start();
		cba.start();
	}
}
