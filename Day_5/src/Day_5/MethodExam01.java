/*
 * this()
 * : 생성자에서 오버로딩된 또다른 생성자를 호출할때 사용
 */

package Day_5;

public class MethodExam01 {
	
	int a;
	int b;
	
	public MethodExam01() {
		this.a =0;
		this.b =0;
	}
	public MethodExam01(int a) {
		this.a =a;
		this.b =0;
	}
	public MethodExam01(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return this.a;
	}
	public int getB() {
		return this.b;
	}
	
	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
		MethodExam01 me1 = new MethodExam01(10);
		MethodExam01 me2 = new MethodExam01(20,30);
		
		System.out.println(me.getA()+"\t"+me.getB());  // 0,0
		System.out.println(me.getA()+"\t"+me1.getB());  // 10, 0
		System.out.println(me.getA()+"\t"+me2.getB());  // 20, 30
	}
}
