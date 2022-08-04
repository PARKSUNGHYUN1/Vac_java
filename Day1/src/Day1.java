/* 1. 객체지향언어는 객체를 가지고 사용하는데 문법적으로 표현 -> class
 * 2. JAVA는 100% 상속구조! (객체끼리..)
 * 3. 클래스 외부에 작업 -> 1. package 2. import
 * 4. main함수 -> 프로그램의 시작과 끝을 담당
 * 	  Static 함수는 객체와 무관하게 미리 메로리에 생성이 된다. 
 *    	- 모든곳에서 공유한다. 즉 전체에서 오직 한개다.
 * 		- class이름. 으로 접근하는 방식은 static이다.
 * * 접근지정자
 * 	 1. private: 외부에서 절대로 접근이 불가능 -> field(멤버변수)
 *   2. default: 같은 패키지(폴더)내에서만 접근이 가능 -> field, method
 *   3. protected: 외부 패키지중 상속받은 자식객체만 접근가능 -> field, method
 *   4. public: 모두 접근가능 -> method
 *   * 접근지정자 표시하지 않을시 default로 해석 *
 *   
 * 이름 규칙
 * 1. 클래스명 -> 첫글자는 대문자로 !!(문법적인 약속)
 * 
 * 2. 함수명, 변수명 -> 첫글자부터 소문자
 * 3. 공통(1,2) -> 이름 + 이름 두번째 이름의 첫글자는 대문자로 적용(EX- blackWhite, BlackWhite)
 */
class Day1 {
	public static void main(String[] args) {
		int[][] arr = new int[][]{{5,40},{3,50},{1,30},{4,20},{2,10}};
		System.out.println(arr[3].length);
	}
}
