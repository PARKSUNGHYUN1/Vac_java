package Day_15;
import java.util.Scanner;

public class Day_15 {
	
	static int BinarySerch(int arr[], int value) {
		int start = 0;
		int end = arr.length-1;
		int anw = arr[(start + end)/2];
		do {
			anw = (start + end)/2;
			if(arr[anw]<value) {
				start = anw + 1;
			}
			else if(arr[anw]>value) {
				end = anw -1;
			}
			else if(arr[anw] == value) {
				return anw;
			}
		}while(start<=end);
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		System.out.println("오름차순으로 입력하세요!");
		
		for(int i=0; i<num; i++) {
			System.out.print("숫자를 입력하세요");
			arr[i] = sc.nextInt();
		}
		System.out.println("검색할 값을 입력하세요!");
		int value = sc.nextInt();
		
		int a =BinarySerch(arr, value);
		if(a == -1) {
			System.out.println("그런 값 없습니다");
		}
		else {
			System.out.println("그런 값 있습니다");
		}
	}
}
