package Day_14;
import java.util.*;

public class pro3 {
	public static void main(String[] args) {
		int num;
		int bcout;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int cout = 0;
		
		for(int i=0; i<6; i++) {
			System.out.print(i+1+"번째 숫자를 입력하세요:  ");
			arr.add(sc.nextInt());
		}
//		Collections.sort(arr);
		for(int i=0; i<6; i++) {
			System.out.print(arr.get(i));
		}
		System.out.println();						// 만약 frequence함수를 이용하여 같은수가 3개이상 나오면 제거후 baby1 함수로 처리
		for(int i=0; i<10; i++) {
			if(Collections.frequency(arr, i) > 2) {
				for(int r=0; r<3; r++) {
					arr.remove(Integer.valueOf(i));
				}
				Collections.sort(arr);
				baby1(i, arr);
				break;
			}
			else {						// contains 함수를 이용하여 연속된 수가 3개이상 나오면 제거후 baby2 함수로 처리
				if(arr.contains(i) && arr.contains(i+1) && arr.contains(i+2)) {
					arr.remove(Integer.valueOf(i));
					arr.remove(Integer.valueOf(i+1));
					arr.remove(Integer.valueOf(i+2));
				}baby2(arr, i);
				break;
			}
			
		}
}
	
	public static void baby1(int c, ArrayList<Integer> arr) {	// triple -> run / triple의 경우
		try {
			for(int i=c; i<10; i++) {		// 남은 3개의 숫자중 for문을 이용하여 같은수가 3개면 baby-gin으로 판별
				if(Collections.frequency(arr, i) > 2) {
					System.out.println("baby-gin입니다!!");
					break;
				}
				else if(arr.get(0)+arr.get(2) == 2*arr.get(1)) {	// 남은 3개의 숫자중 양끝값을 더하여 중간값의 2배가 성립하면baby-gin으로 판별
					System.out.println("Baby-gin입니다!!");
					break;
				}
			}}catch(IndexOutOfBoundsException e) {
				System.out.println();
			}
		
	}
	
	public static void baby2(ArrayList<Integer> arr, int a) {	//run -> run / triple의 경우
		if(arr.get(0)+arr.get(2) == 2*arr.get(1)) {
			System.out.println("baby-gin입니다!!");		// 남은 3개의 숫자중 양끝값을 더하여 중간값의 2배가 성립하면baby-gin으로 판별
		}
		else if(arr.get(0) == arr.get(1) && arr.get(2) == arr.get(1)) {
			System.out.println("baby-gin입니다!!");		// 남은 3개의 숫자를 비교하여 같은수이면 baby-gin으로 판별
		}
	}
}