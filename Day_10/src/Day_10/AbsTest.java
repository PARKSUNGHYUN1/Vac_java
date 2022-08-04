package Day_10;

//abstract class Abs{
//	abstract void disp();
//}

class A{
	int m = 3;
}

class B extends A{
	int m = 4;
}

public class AbsTest { 
	public static void main(String[] args) {
		
//		new Abs() {
//			void disp() {
//				System.out.println("Abs");
//			}
//		}.disp();
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);
	}
}
