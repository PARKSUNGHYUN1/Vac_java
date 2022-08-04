package Day_8;

/*
   상속(확장성 유지보수성을 위해 사용)
   
  - is ~ a 관계 ( is like a 관계는 사용금지)
  - 상속해주는 클래스 -> super class
  	- sub class의 공통된 부분을 작성
  	
  - 상속받는 클래스 -> sub class
  	- 순수하게 자기 기능만 생각해서 확장
  	
  - 클래스간의 상속은 단일상속만 가능한다.
  
  - sub class명 뒤에 extends 사용 
 */
class A{
	private String name;
	
	public A() {
		// super();
		System.out.println("수퍼클래스 생성자");
	}
	public A(String name) {
		this.name =name;
		System.out.println("또다른 슈퍼 생성자");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}


class Test extends A{
	int a;
	
	public Test(String str, int in) {
		//super(str); // => 부모의 생성자를 호출, 항상 sub class의 첫번째 라인에 존재
		setName(str);
		a = in;
		System.out.println("서브 클래스 생성자");
	}
	public void setA(int in) {
		this.a = in;
	}
	
	public int getA() {
		return a;
	}
	public static void main(String[] args) {
		Test test = new Test("superman", 1000);
		// test.toString();
		
		System.out.println(test.getName());
		System.out.println(test.getA());
	}
}


public class Day_8 {
	public int aa(int ...) {
		
	}
}

class C{
	public int a(int a) {
		System.out.println("기본생성자");
	}
}

class D extends C{
	super();
	
}
