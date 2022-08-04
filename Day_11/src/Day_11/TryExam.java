package Day_11;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * throws는 항상 뒤에 작성
 */

class MyException extends Exception{
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}
}

class MyRTException extends RuntimeException{
	public MyRTException() {
		super();
	}
	public MyRTException(String message) {
		super(message);
	}
}

class A{
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외처리 메시지");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외처리 메시지");
	
	void abc_1(int num) {
		try {
			if(num>70) {
				System.out.println("정상 작동");
			}
			else
				throw me1;
		}catch(MyException e) {
			System.out.println("예외처리 1");
		}
	}
	void bcd_1() {
		abc_1(65);
	}
	
	void abc_2(int num) throws MyException{
		if(num>70)
			System.out.println("정상작동");
		else
			throw me1;	
	}
	
	void bcd_2() {
		
	}
}




public class TryExam {
	public static void main(String[] args){
		
		
		try (Scanner sc = new Scanner(System.in);){
		int num2 = Integer.parseInt("10!"
				+ "");
		int num1 = sc.nextInt();
		System.out.println(num1/num2);
		
		}catch(ArithmeticException | NumberFormatException ae){ // 명확하게 에러를 잡고 싶을때!
			System.out.println("0으로 나누지 말라고....");
		}
		finally {
			System.out.println("End....");
		}
		
	
	}
}
