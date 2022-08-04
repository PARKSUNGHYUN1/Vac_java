/*
 * 오버라이딩
 * - 상관 관계시 superclass의 메소드를 재정의 하는것 !
 * - 부모가 제공하는 기능이 나에게 맞지 않아서 재정의
 * 		- 완전 재가공
 * 		- 확장 ( 내 기능 추가 )
 * 
 *  - 오버라이딩 하는 이유!!!
 *  	-> 동적 바인딩을 하기 위해서 !!
 */

package Day_8;

public class B {
	public String toString() {
        return toString()+"bbbbb"; // this.toString(평소에 이상태), super.toString(부모클래스의 함수 호출시)
    }
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.toString());
		
		String str = new String("Superman");
		System.out.println(str.toString());
	}
}
