package Day_12;

import static java.lang.System.out;

class MyClass<T>{
	private T t;
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}

public class SingleGenericArument {
	public static void main(String[] args) {
		MyClass<String> mc1 = new MyClass<>();
		mc1.set("안녕");
		out.println(mc1.get());
		
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.set(100);
		out.println(mc2.get());
	}
}
