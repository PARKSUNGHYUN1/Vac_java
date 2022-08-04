
package Day_5;

import java.util.Scanner;

public class cal {
	int a, b;
	char cal, anw;

	public char input(Scanner sc) {
		System.out.println("첫번째 숫자를 넣으세요!");
		a = sc.nextInt();
		System.out.println("연산자를 넣으세요!");
		cal = sc.next().charAt(0);
		System.out.println("두번째 숫자를 넣으세요!");
		b = sc.nextInt();

		return cal;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cal cl = new cal();
		char anw;
		do {
			cl.print(cl.input(sc));
			System.out.print("계속하시겠습니까??(y/n) ");
			anw = sc.next().charAt(0);
		}while(anw == 'y'||anw =='Y');

	}


	public void print(char cal) {
		cal cl = new cal();
		cl.setA(a);
		cl.setB(b);
		cl.setCal(cal);
		switch (cal) {
		case '+':
			System.out.println(cl.sum(a, b));
			break;
		case '-':
			System.out.println(cl.sub(a, b));
			break;
		case '*':
			System.out.println(cl.mul(a, b));
			break;
		case '/':
			System.out.println(cl.div(a, b));
			break;
		default:
			System.out.println("잘못된 입력입니다!");
		}

	}

	public float sum(int a, int b) {
		return a + b;
	}

	public float sub(int a, int b) {
		return a - b;
	}

	public float mul(int a, int b) {
		return a * b;
	}

	public float div(int a, int b) {
		if (a == 0) {
			System.out.println("잘못된 값입니다!!");
		} else if (b == 0)
			System.out.println("잘못된 값입니다!!");
		else
			;
		return a / b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public char getCal() {
		return cal;
	}

	public void setA(int aa) {
		a = aa;
	}

	public void setB(int bb) {
		b = bb;
	}

	public void setCal(char call) {
		cal = call;
	}

}
