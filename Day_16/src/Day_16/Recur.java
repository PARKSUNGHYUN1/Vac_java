package Day_16;

public class Recur {
	int a = 3;
	boolean aa;
	
	void work() {
		System.out.print(a);
		System.out.print(aa);
	}
	public static void main(String[] args) {
		Recur re = new Recur();
		int b = 2;
		re.a= b;
		re.work();
	}
}
