package Day_20;

public class CreatTh {
	public static void main(String[] args) {
		
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				int[] arr = {1,2,3,4,5};
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println("예외");
				}
				for(int i=0; i<arr.length; i++) {
					try {
					Thread.sleep(100);
					}catch(InterruptedException e) {
						System.out.println(arr[i]);
					}
				}
			}
		};
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				int[] arr1 = {5,4,3,2,1};
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println("예외");
				}
				for(int i=0; i<arr1.length; i++) {
					try {
					Thread.sleep(100);
					}catch(InterruptedException e) {
						System.out.println(arr1[i]);
					}
				}
				
			}
		};
		
		thread1.start();
		thread2.start();
		
	}
}
