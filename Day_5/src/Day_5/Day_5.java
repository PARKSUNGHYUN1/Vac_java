/*
 *  모듈화
 * 1. call by name
 * 2. call by value
 * 3. call by reference
 * 
 * =>  call by address => C언어
 * 
 * static method
 * - instance field를 메소드 내에서 사용불가.
 * - static field를 사용할수있다.
 * 
 * instance method
 * - static field를 사용할수 있다.
 * - instance field를 사용할수 있다.
 * 
 * Overloading(오버로딩)
 * 1. 동일한 함수명으로 여러개의 함수를 제공
 * 2. 매개변수의 타입이 다를경우
 * 3. 매개변수의 갯수가 다를경우
 * 4. 2, 3번중 하나만 달라도 가능
 * 5. 목적: 편의(다형성)
 * 6. 같은 목적으로 사용하는 것끼리만 만들어야함(주의사항)
 * 7. 같은 클래스내에서 사용.
 * 
 * this
 * : 항상 인스턴스 메소드의 첫번째 멤버변수로 항상 존재하고 있다. 
 * 사용만 가능, 만들수 없다!!
 * - 객체를 구별해준다. | 메모리 절약효과
 */


package Day_5;
import java.util.Scanner;
public class Day_5 {
	
	private int a ;
	private char op;
	private int b;
	private float result;
	
	// 생성자
	public Day_5() {
		
	}
	
	public Day_5(int aa, char opp, int bb) {
		a = aa;
		op = opp;
		b = bb;
	}
	
	public void setA(int aa) {a =aa;}
	public void setB(int bb) {b =bb;}
	public void setOp(char opp) {op =opp;}
	
	public int getA() {return a;}
	public int getB() {return b;}
	public char getOp() {return op;}
//	public float getResult() {return 
//			return result;}
	
	// 연산함수
	
	public char input(Scanner sc) {
		int a = sc.nextInt();
		char giho = sc.next().charAt(0);
		int b = sc.nextInt();
		return giho;
	}
	
	public float plus(int a, int b) {
		return result = a+b;
	}
	public float div(int a, int b) {
		return result = a-b;
	}
	public float mul(int a, int b) {
		return result = a*b;
	}
	public float divide(int a, int b) {
		return result = a/b;
	}
	

//	public static void display() {
//		System.out.println("Hello");
//	}
//	public void display2() {
//		System.out.println("Hello");
//	}
//	public void display3(int a) { //call by value
//		System.out.println(a);
//	}
//	public int display4() { //call by value
//		return 10;
//	}
//	public int display5(int a) { //call by value
//		return 20;
//	}
//	public static float display(int a, int b) { //call by value
//		return a+b; // (리턴 타입은 한가지만 가능)
//	}
	
	
//	public void cal1(float a, float b) {
//		float cal11 = a+b;
//	}
//	public void cal2(float a, float b) {
//		float cal22 = a-b;
//	}
//	public void cal3(float a, float b) {
//		float cal33 = a*b;
//	}
//	public void cal4(float a, float b) {
//		float cal44 = a/b;
//	}
//	public static float num(Scanner sc) {
//		float num = sc.nextFloat();
//		return num;
//	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Day_5 d5= new Day_5();
		d5.setA(3);
		d5.setOp('+');
		d5.setB(10);
		
		System.out.println(d5.plus());
		
		Day_5 d55= new Day_5(3, '+', 10);
		System.out.println(d5.plus());

		
//		Day_5.display(); 	//함수 호출
		
		// 객체 생성
//		Day_5 me01;
//		me01 = new Day_5();
		
		
		
//		me01.display2();
//		me01.display(); // 인스턴스와 스태딕 메소드의 구분을 위한 코딩!!
//		me01.display3(200);
//		int data = me01.display4();
//		System.out.println(data);
//		int data2 = me01.display5(0);
//		System.out.println(data2);
		
		
		
			
	
		do {
			num1 = Day_5.num(num);
			System.out.println("연산기호를 입력하세요!");
			char sum = sc.next().charAt(0);
			num2 = Day_5.num(num);
		
			switch(sum) {
			case '+':
				Day_5.cal1(num1, num2);
				break;
			case '-':
				Day_5.cal2(num1, num2);
				break;
			case '*':
				Day_5.cal3(num1, num2);
				break;
			case '/':
				Day_5.cal4(num1, num2);
				break;
			default: System.out.println("잘못된 입력입니다!");
			}
			System.out.print("계속하시겠습니까??(y/n) ");
			a = sc.next().charAt(0);
		}while(a == 'y'||a =='Y');
	}

	

}

