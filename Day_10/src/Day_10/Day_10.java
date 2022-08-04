/*
 * 	인터페이스 
 * 	- 추상클래스를 더 추상화 시킨 구조.
 * 	- 구조: 상수 + 추상메소드
 * 
 * 	- 다중상속을 대체 .( 인터페이스를 여러개 받을 수 있다. )
 *  - implements 인터페이스명1, 인터페이스명2, ...
 * 	- 인터페이스는 동적바인딩이 가능.
 */
package Day_10;

interface A{
	static int a = 0; // final이 생략되어 있는 형태!!! => 상수
	
	public abstract void disp(); // abstract가 생략된 형태!!!  => 추상메소드
}

interface B{
	static int a = 0; // final이 생략되어 있는 형태!!! => 상수
	
	
	public void disp1(); // abstract가 생략된 형태!!!  => 추상메소드
}

interface C extends A, B{
	final static int a = 0; // final이 생략되어 있는 형태!!! => 상수
	
	public abstract void disp2(); // abstract가 생략된 형태!!!  => 추상메소드
}

public class Day_10 extends Object implements C{
	public static void main(String[] args) {
		A a = new Day_10();
		a.disp();
		
		C b = (C) a;// new Day_10();
		b.disp();
		b.disp1();
		b.disp2();
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Inter");
	}

	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		System.out.println("Inter1");
		
	}
	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("Inter2");
		
	}
}
