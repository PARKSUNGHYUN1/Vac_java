package Day_12;
import java.util.Scanner;

abstract class Memoory<T>{
	protected T[] num;
	protected int count;
	
	
	public Memoory() {
		num = (T[]) new Integer[5];
		count = 0;
	}
	
	public void push(T t) {
		if(num[count] == null) {
			num[count] = t;
			count ++;
		}
	}

	public abstract Integer pop();
	
}

class MyStack<T> extends Memoory<T>{
	@Override
	public Integer pop() {
		Integer result = (Integer) num[count];
		num[count] = null;
		count--;
		return result;
	}
}

class MyQueue<T> extends Memoory<T>{
	Integer num0;
	@Override
	public Integer pop() {
		num0 = (Integer) num[0];
		
		for(int i = 0; i<count; i++) {
			num[i] = num[i+1];
		}
		count--;
		System.out.println(num[0]);
		return num0;
	}
}


public class Memory {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Memoory me;
		MyStack ms = new MyStack();
		MyQueue mq = new MyQueue();
		
		while(true) {
			System.out.println("1. Stack | 2. Queue");
			int al = sc.nextInt();
			if(al ==1) {
				me = ms;
				for(int i = 0; i<100; i++) {
					System.out.println("1. push  |  2. pop");
					int cont = sc.nextInt();
					if(cont == 1) {
						me.push(1);
					
					}
					else if(cont == 2) {
						me.pop();
						System.out.println("pop된 값: "+ms.pop());
					}
				}
			}
			else if(al ==2) {
				me = mq;
				for(int i =0; i<100; i++) {
					System.out.println("1. psuh | 2. pop ");
					int cont1 = sc.nextInt();
					if(cont1 == 1) {
						me.push(1);
					}
					else if(cont1 == 2) {
						me.pop();
						System.out.println(mq.pop());
					}
				}
			}
		}
	}
}
