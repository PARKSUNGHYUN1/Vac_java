package Day_16;
import java.util.*;

public class Day_16 {
	static int fact(int n) {
		if(n>0) {
			return n * fact(n-1);
		}
		else {
			return 1;
		}
	}
	static int fact2(int n) {
		int cal =1;
		for(int i=n; i>0; i--) {
			cal = cal*i;
		}
		return cal;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("! 해줄 수를 입력하세요");
		int num = sc.nextInt();
		System.out.println(num+"! 값은 "+fact(num)+"입니다!!");
		
		System.out.println("! 해줄 수를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println(num1+"! 값은 "+fact2(num1)+"입니다!!");
	}
}
