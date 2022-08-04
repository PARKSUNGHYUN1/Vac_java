package Day_11;

class OA{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("아");
		}
	}
}

public class ThrowException {
	public static void main(String[] args) {
		OA a = new OA();
		a.abc();
	}
}
