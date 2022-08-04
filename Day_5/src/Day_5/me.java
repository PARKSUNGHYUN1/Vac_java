package Day_5;

public class me {

	
	// 필드
	private int a;
	
	public void setA(int a) { //(me this, int a)
		this.a = a; // 우선 순위는 지역변수(둘다 지역변수로 인식)
	}
	public int getA() {   // (me this)
		return this.a;
	}
	
	public me getObject() {
		return this;
	}
	
	public static void setAA(me m, int a) {
		// 필드 입력
		m.a = a;
	}
	public static int getAA(me m) {
		
		return m.a;
	}
	
	public static void main(String[] args) {
		
		me m = new me();
		// setter 호출 1000입력
		m.setAA(m, 1000);
		
		// getter 호출 1000출력
		
		System.out.println(m.getAA(m));
//		me me1 = new me();
//		
//		me.setA(1000);  // me.setA(me.1000)
//		System.out.println(me.getA());  // me.getA(me)
	}

}
