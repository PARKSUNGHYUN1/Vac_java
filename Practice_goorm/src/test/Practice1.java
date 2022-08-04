package test;

interface A{
	public abstract void abc();
}

class C{
	void cde(A a) {	// 의존성 주입
		a.abc();
	}
	class D{
		void n() {
			System.out.println("하이");
		}
	}
}

class B implements A{
	
	public void abc() {
		System.out.println("dd");
	}
}



public class Practice1 {
	
	public static void main(String[] args) {
		C c = new C();
		
		C.D d = c.new D();
		
		C.D dd = new C.D();
		
		A a1 = new B();
		c.cde(a1);
		
		c.cde(new B());
		
		A a = new A() {
			public void abc() {
				
			}
		};
	}
}