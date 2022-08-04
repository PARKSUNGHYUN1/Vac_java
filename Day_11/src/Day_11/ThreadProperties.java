package Day_11;

public class ThreadProperties {
	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println("현재 동작하는 쓰레드의 이름 : " + thread.getName());
		System.out.println("현재 동작하는 쓰래드의 수 : "+ thread.activeCount());
	
	
	for(int i=0; i<3; i++) {
		System.out.println(thread.getName());
		thread.start();
	}
	
	for(int i=0; i<3; i++) {
		thread.setName("Thread"+i);
		System.out.pr
		intln(thread.getName());
		thread.start();
	}
	System.out.println("동작하는 쓰레드의 갯수: " + Thread.activeCount());
}
}
