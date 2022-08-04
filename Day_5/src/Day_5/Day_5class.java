/*
 * 클래스의 구성요소
 * 
 * 1. field
 * : data
 * - 외부에서 객체를 사용할떄 지속적으로 사용되어져야 하는 데이터.
 * - 접근지정자는 주로 private 지정
 * - instance field, static field
 * - field 사용은 항상 메소드를 통해서 사용하게 해라..
 * 
 * 2. constructor: 객체 생성시 자동 호출되어진다. 이때 한번!!
 * - (생성자자함수)
 * - 디폴트기능: 객체등록 (생성자가 호출이 안될경우 객체를 생성할수 없다. )
 * 		    -> 생성자를 명시적으로 만들지 않을 경우 디폴트 생성자를 제공해준다. 
 * - 오버로딩이 가능하다( 객체를 다양하게 만들수 있다.)
 * - 리턴 타입이 없다!!
 * - 함수명도 무조건 클래스명과 동일하게 만들어야 한다.
 * - 기능: 객체 생성시-> 필드초기화 
 * - 접근 지정자는 주로 public으로 사용한다.(외부에서 사용이 용이하기 때문에)
 * 
 * 3. method
 * - 외부에서 필드 접근의 목적
 * - public으로 주로 지정
 * - method 생성시 세분화 중요!
 * 
 * 상속구조
 * 
 * - 최상위 클래스 Object
 */

package Day_5;

public class Day_5class {
	// 필드
			int a = 10; // 상수일때만 이런 표현식을 사용 final
			int b;
			
			// 생성자
			public Day_5class() { // default 생성자
				System.out.println("default");
			}
			private Day_5class(int aa, int bb) {
				a = aa;
				b = bb;
			}
			
			
			// 메소드
			// getter method: 외부에서 현재 field값을 알고 싶을때
			public int getA() {
				return a;
			}
			public int getB() {
				return b;
			}
			
			// setter method: 외부에서 field값을 가져올수 있는 메소드
			
			public void setA(int aa) {
				a = aa;
			}
			public void setB(int bb) {
				b = bb;
			}


	public static void main(String[] args) {
		
		Day_5class d5 = new Day_5class();  // 객체생성 (생성자 호출)
//		System.out.println(d5); // Object 안에 있는 것을 toString(생략된 형태)	
		
		Day_5class d51 = new Day_5class(100, 200);  // 객체생성 (생성자 호출)
		
		System.out.println(d5.getA());
		System.out.println(d5.getB());
		
		System.out.println(d51.getA());
		System.out.println(d51.getB());
		
		d5.setA(30); // me.a = 30;
		d5.setB(40);
		
//		String str = new String("superman");
//		System.out.println(str.toString());
		}
}


