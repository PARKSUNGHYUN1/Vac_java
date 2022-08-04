
package Day_9;
import java.util.Scanner;


abstract class Memory{
	protected int[] num;
	protected int count;
	
	
	public Memory() {
		num = new int[5];
		count = 0;
	}
	
	public void push(int a) {
		if(num[5] != 0) {
			num[count] = a;
			count ++;
		}
	}

	public abstract int pop();
	
}

class MyStack extends Memory{
	@Override
	public int pop() {
		int result = num[count];
		num[count] = 0;
		count--;
		return result;
	}
}

class MyQueue extends Memory{
	int num0;
	@Override
	public int pop() {
		num0 = num[0];
		
		for(int i = 0; i<count; i++) {
			num[i] = num[i+1];
		}
		count--;
		System.out.println(num[0]);
		return num0;
	}
}


public class Day_9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Memory me;
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
						System.out.println(ms.num);
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
						System.out.println(mq.num0);
					}
				}
			}
		}
	}
}

