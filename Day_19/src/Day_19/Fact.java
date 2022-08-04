package Day_19;

public class Fact {
	public static void main(String[] args) {
		int num = 5;

		System.out.println(fac(num));
	}
	public static int fac(int num) {
		
		if(num > 0
				) {
			return num * fac(num-1);
		}
		return 1;
	}
}
