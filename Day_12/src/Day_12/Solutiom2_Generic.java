package Day_12;

class Apple{}
class Pencil{}
class Goods<T>{
	private T t;
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t ;
	}
}
public class Solutiom2_Generic {
	public static void main(String[] args) {
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple1 = goods1.get();
				
	}
}
