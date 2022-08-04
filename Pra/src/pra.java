abstract class AA{
	abstract void abc();
}
class A extends AA{

	@Override
	void abc() {
		// TODO Auto-generated method stub
		
	}

}
default final class B extends A{
	
	static int a=1;
	
	
	void bcd() {
		System.out.println("bye");
	}
}
public class pra {
	public static void main(String[] args) {
		B b1 = new B();
		A b2 = new B();
		
		System.out.println(A.a);
		System.out.println(b1.a);
		
//		System.out.println(b1.a);
//		b1.abc();
//		
//		System.out.println(b2.a);
//		b2.abc();
	}
}
