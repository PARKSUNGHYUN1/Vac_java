package Day_14;
import java.util.*;

public class num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cal ca = new cal();
		
		System.out.print("Input X Number : ");
		int x = sc.nextInt();
		System.out.print("Input Y Number : ");
		int y = sc.nextInt();
		
		ca.result(x, y);
	}
}

class cal{
	public void result(int a, int b) {
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=a; i<b; i++) {	// a,i는 시작하는 숫자, b는 끝나는 숫자
			String str = String.valueOf(i);	// 시작하는 숫자 i를 스트링으로 형변환
			for(int j=0; j<str.length(); j++) {	//  숫자 하나의 문자열 길이만큼 반복
				if(j == str.length()-1) {	// 숫자비교는 길이의-1만큼 진행, 만약 for문을 다돌아 j가 숫자열 길이-1과 같아지면 arr배열에 추가
					if(str.charAt(j-2) == str.charAt(j-1)) {
						break;
					}
					else if(str.charAt(j-1) == str.charAt(j)){
						break;
					}
					arr.add(str);
				}
				else if(Character.compare(str.charAt(j), str.charAt(j+1)) >= 1) {	// 	compare메소드를 이용하여 앞뒤숫자 비교
					break;						// 앞숫자가 뒷숫자보다 작으면 -1, 같으면 0, 크면 1출력 앞숫자가 더크면 정돈이 안된것이므로 그 숫자는 배열에 추가 X
				}
			}
		}
		
		System.out.println("Count : "+ arr.size());
		System.out.print(arr);
	}
}
