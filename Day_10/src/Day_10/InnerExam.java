///*

// *  inner class
// *  - 클래스내에 또다른 클래스를 구현
// *  	- Outer class
// *  	- Inner class
// *  - 종류
// *  	1. member inner class(주요) => 
// *  	2. static inner class
// *  	3. local inner class 메소드안에 만들떄
// *  	4. anonymous inner class(주요) => 이름없이 만들때
// *  

// *  - outer의 맴버를 자유롭게 사용이 가능
// *  - outer 객체를 생성 후 Inner class 객체를 생성한다!!
// *  	단!! static은 outer를 생성하지 않고 사용가능!!
// */

//package Day_10;
//
//public class InnerExam {
//	
//	private int a;
//	private int b;
//	private static int c;
//	
//	
//	public InnerExam() {
//		a =1;
//		b =2;
//		c =3;
//		
//	}
//	                                   
//	
////	class AInner{  // member Inner class, static inner class는 static만 관리
////		public void disp() {
////			System.out.println(a);
////			System.out.println(b);
////			System.out.println(c);
////		}
////	}
//	
//	public void output() {
//		
//		
//		
//		class LocalInner{
//			public void disp() {
//				System.out.println(a);
//				System.out.println(b);
//				System.out.println(c);
//			}
//		}
//		
//		LocalInner li = new LocalInner();
//		li.disp();
//	}
//	
//	public static void main(String[] args) {
////		InnerExam.AInner ie = new InnerExam().new AInner();
////		ie.disp();
//		
//		InnerExam ie = new InnerExam();
//		ie.output();
//		
//	}
//}

class A{
	static class B{
		
	}
}

public class InnerExam{
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
	}
}
