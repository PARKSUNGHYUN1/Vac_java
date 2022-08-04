package Day_12;

class Ao{
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue());
	}
}

interface MyInterface{
	public abstract void print();
}

class Bo{
	public <T extends MyInterface> void method1(T t) {
		t.print();
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		Ao a = new Ao();
		a.method1(5);
		
		Bo b = new Bo();
		b.method1(new MyInterface(){
			@Override
			public void print() {
				System.out.println("print 구현");
			}
		});
	}
}
