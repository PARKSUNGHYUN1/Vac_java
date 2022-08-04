package Day_17;
import java.util.*;

class stack{ 			// 후위연산 숫자를 담는 스텍 클래스
	static ArrayList<String> arr = new ArrayList<String>();
	
	public static void push(String num) {
		arr.add(num);
	}
	
	public static String pop() {
		String a;
		a = arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		return a;
	}
}
class stack2{		// 후위연산 연산자를 담는 클래스
	static ArrayList<String> arr = new ArrayList<String>();
	
	public static void push(String num) {
		arr.add(num);
	}
	
	public static String pop() {
		String a;
		a = arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		
		return a;
	}
}

class stack3{		// int형으로 변환한 숫자를 담아 계산을 도와주는 클래스
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public static void push(int num) {
		arr.add(num);
		System.out.println("push: "+num);
	}
	
	public static int pop() {
		int a;
		a = arr.get(arr.size()-1);
		int b =a;
		arr.remove(arr.size()-1);
		System.out.println("pop: "+a);
		
		return a;
	}
}
public class Day_17 {
	
	public static void main(String[] args) {
		stack st1 = new stack();
		stack2 st2 = new stack2(); 
		stack3 st3 = new stack3();
	
		ArrayList<String> oto = new ArrayList<String>();
		//113 + 11 - (32 - (9 - 2 + 6))
		String oper= "113 + 11 - (32 - (9 - 2 + 6))";	
		oper = oper.replace("(", "( ");		// 연산자 괄호 재배치
		oper = oper.replace(")", " )");
		String [] item = oper.split(" ");
		ArrayList<String> number = new ArrayList<String>(Arrays.asList(item));	// 입력받은 값을 스트링의 배열로 담는다
//		for(int i=0; i<number.size(); i++) {
//			System.out.println(number.get(i));
//		}
		System.out.println();
		for(int i=0; i<number.size(); i++) {
			if(number.get(i) .equals("+") ||number.get(i) .equals("-")) {		// 연산자가 들어오면
				if(st2.arr.size() !=0 &&!number.get(i).equals(st2.arr.get(st2.arr.size()-1))) {		// 연산자 스택배열이 비어있고 연산자 배열의 마지막 값과 number의 i번째가 같으면
					oto.add(st2.pop());		// 연산자 스택배열에서 팝된 값을 oto배열에 추가
					st2.push(number.get(i));	// 연산자 스택배열에 i번쨰 number값을 추가
				}
				else {
					st2.push(number.get(i));	// 들어온 연산자가 다른 값이면 i번째 number을 추가
				}
			}
			else if(number.get(i) .equals("(") || number.get(i) .equals(")")) {	// 괄호가 들어올때
				int opersize = st2.arr.size();		
				if(number.get(i).equals("(")) {		// 열린 괄호의 경우 pass
					
				}
				else {
					for(int j=0; j<opersize; j++) {		// 닫힌 괄호의 경우 연산자배열을 pop 후 pop된 값을 oto배열에 추가
						oto.add(st2.pop());
					}
				}
			}
			else {
				st1.push(number.get(i));		// 숫자가 들어온 경우 바로 숫자스택배열로 push 후 pop, oto배열에 pop값 추가
				oto.add(st1.pop());
			}
		}
		ArrayList<String> arr = new ArrayList<String>();
		
		System.out.println(oto);
		System.out.println();
		for(int i=0; i<oto.size(); i++) {
			
			if(oto.get(i).equals("+") || oto.get(i).equals("-")) {
				switch(oto.get(i)) {
				case "+":{
					
						st3.push(st3.pop()+ st3.pop());
					
					break;
				}
				case "-":
					
					st3.push(-st3.pop() + st3.pop());
					
					break;
				}
			}
			
			else {
				st3.push((Integer.parseInt(oto.get(i))));
			}
		}
		System.out.print("= "+st3.arr.get(0));
	}	
}

