/*
 * 추상클래스
 * 	- 특정 부분이 구체화가 되지 않은 클래스
 * 	- 객체를 생성할 수 없고 상속을 목적으로 한다!!
 * 	- 추상메소드 하나이상 가지고 있는 클래스
 * 
 * 		- 추상 메소드는 이름만 정의하고 바디가 없는 메소드 ( 함수 선언 )
 * 		- 추상 클래스를 상속받는 서브 클래스는 추상메소드를 꼭 오버라이딩을 해야한다!
 * 		  만약!! 오버라이딩을 하지 않을경우 서브클래스도 추상클래스화 되서 객체를 생성할 수 없다!!
 * 
 * 
 * 
 * 		- final를 붙일 수 있는것들
 * 			1. field => 상수화(바꿀수가 없다!)
 * 			2. method => 오버라이딩 금지!
 * 			3. class => 상속 금지 (has ~ a로만 사용!!)
 * 
 * 
 * 		동적바인딩
 * 		- 상속관계시 부모의 래퍼런스로 자식객체를 접근하는 방식!!
 * 		- 분모의 레퍼런스로 인식할수 있는 범위는 부모의 원래 알고 있는 것까지만....
 * 
 * 
 * 		- anonymous inner class로 만들 경우에는 객체생성이 가능!!
 */
package Day_8;

abstract class Abs{ // 추상클래스
	
	public abstract void draw();  // 추상클래스
	{
		System.out.println("star");
	}
	
}

class Rect extends Abs{
//	@Override
	public void draw() {  // => 정적바인딩 : 내 래퍼런스로 내 타입의 객체를 접근하는 방식
		System.out.println("rect");
	}
}

class Tri extends Abs{
//	@Override
	public void draw() {
		System.out.println("tri");
		
	}
}

class Cir extends Abs{

//	@Override
	public void draw() {
		System.out.println("cir");
		// TODO Auto-generated method stub
		
	}
//	@Override
//	public void draw() {
//		System.out.println("cir");
//	}
}

public class A {
	public static void main(String[] args) {
		Abs abs;
		
		Rect rect = new Rect();
		rect.draw();
		
		Tri tri = new Tri();
		tri.draw();
		
		Cir cir = new Cir();
		cir.draw();
		
		abs = rect; // 동적바인딩.
		abs.draw();
		
		abs = tri;
		abs.draw();
		
		abs = cir;
		abs.draw();
	}
}
