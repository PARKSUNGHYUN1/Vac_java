import java.util.Scanner;

/* < , > <= >=, == !=(a =!b; => !위치 유의할것)
 * 
 * 삼항 연산자(조건 연산자) 참거짓 조건 ? 참일때 결과 : 거짓일때 결과 ;
 * 
 */
public class Day2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num1;
		float num2;
		
		
		System.out.println("첫번째 숫자를 입력하세요!");
		num1 = sc.nextFloat();
		System.out.println("연산기호를 입력하세요!");
		char sum = sc.next().charAt(0);
		System.out.println("두번째 숫자를 입력하세요!");
		num2 = sc.nextFloat();
		
		switch(sum) {
		case '+':
			System.out.println(num1 + "" + sum + "" + num2 + "=" +(num1 + num2));
			break;
		case '-':
			System.out.println(num1 + "" + sum + "" + num2 + "=" +(num1 + num2));
			break;
		case '*':
			System.out.println(num1 + "" + sum + "" + num2 + "=" +(num1 + num2));
			break;
		case '/':
			System.out.println(num1 + "" + sum + "" + num2 + "=" +(num1 + num2));
			break;
		default: System.out.println("잘못된 입력입니다!");
		}
	
		
		
	
	}
}
