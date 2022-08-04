package Day_16;

import java.util.Scanner;

public class Binary {
	static int BinarySerch(int []arr,int value, int a, int b) {
		int start = a;
		int end = b;
		int anw = (start + end)/2;
		
		if(arr[anw] < value) {		
			start = anw+1;
			if(arr[start] == value) {
				anw = arr[(start + end)/2];
				return anw-1;
			}
			else {
				return	BinarySerch(arr, value, start, end);
			}
		}
		else if(arr[anw] > value) {
			end = anw;
			if(arr[anw-1] == value) {
				anw = arr[(start + end)/2];
				return anw-1;
			}
			else {
				return BinarySerch(arr, value, start, end);
			}
		}
		else if(arr[anw] == value){
			return anw;
		}
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
		
		int a =BinarySerch(arr, value, 0, arr.length-1);
		if(a == -1) {
			System.out.println("값이 없습니다");
		}
		else {
			System.out.println("값이 X["+ a +"]에 있습니다");
		}
	}
}
