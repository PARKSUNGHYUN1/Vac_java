package Day_17;
import java.util.*;

public class Generic {
	public static void main(String[] args) {
		Stack<String> num = new Stack<>();	// 숫자를 담는 스택배열
		Stack<String> oper = new Stack<>();	// 연산자를 담는 스택배열
		Stack<Integer> cal = new Stack<>();	// 숫자계산떄 숫자를 담는 스택배열
		List<String> oto = new ArrayList<String>();
		
		String opera= "113 + 11 - (32 - (9 - 2 + 6))";	
		opera = opera.replace("(", "( ");		
		opera = opera.replace(")", " )");
		String [] item = opera.split(" ");
		ArrayList<String> number = new ArrayList<String>(Arrays.asList(item));
		
		System.out.println();
		for(int i=0; i<number.size(); i++) {
			if(number.get(i) .equals("+") ||number.get(i) .equals("-")) {		// 연산자가 들어오면
				if(oper.size() !=0 &&!number.get(i).equals(oper.get(oper.size()-1))) {		// 연산자 스택배열이 비어있고 연산자 배열의 마지막 값과 number의 i번째가 같으면
					oto.add(oper.pop());		// 연산자 스택배열에서 팝된 값을 oto배열에 추가
					oper.push(number.get(i));	// 연산자 스택배열에 i번쨰 number값을 추가
				}
				else {
					oper.push(number.get(i));	// 들어온 연산자가 다른 값이면 i번째 number을 추가
				}
			}
			else if(number.get(i) .equals("(") || number.get(i) .equals(")")) {	// 괄호가 들어올때
				int opersize = oper.size();		
				if(number.get(i).equals("(")) {		// 열린 괄호의 경우 pass
					
				}
				else {
					for(int j=0; j<opersize; j++) {		// 닫힌 괄호의 경우 연산자배열을 pop 후 pop된 값을 oto배열에 추가
						oto.add(oper.pop());
					}
				}
			}
			else {
				num.push(number.get(i));		// 숫자가 들어온 경우 바로 숫자스택배열로 push 후 pop, oto배열에 pop값 추가
				oto.add(num.pop());
			}
	}	
		System.out.print("후위 계산식: ");
		for(int i=0; i<oto.size(); i++) {
			System.out.print(oto.get(i)+ " ");
		}
		
		
		for(int i=0; i<oto.size(); i++) {
			
			if(oto.get(i).equals("+") || oto.get(i).equals("-")) {
				switch(oto.get(i)) {
				case "+":{
					
						cal.push(cal.pop()+ cal.pop());
					
					break;
				}
				case "-":
					
					cal.push(-cal.pop() + cal.pop());
					
					break;
				}
			}
			else {
				cal.push((Integer.parseInt(oto.get(i))));
			}
		}
		System.out.print("= "+cal.get(0));
	}
}

class Stack1{
	List<Integer> arr = new ArrayList<Integer>();
	
	public void push(int a) {
		arr.add(a);
	}
	public int pop(){
		int save;
		save = arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		
		return save;
	}
	public boolean isempty() {
		if(arr.size() ==0) {
			return true;
		}
		else {
			return false;
		}
	}
}

