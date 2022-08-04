package Day_20;

import java.util.*;

abstract class 추상클래스{
	abstract void 추상메소드();
}

class 클래스 extends 추상클래스{
	final int a = 1;
	@Override
	void 추상메소드() {
		// TODO Auto-generated method stub
		
	}
}

class 파이널 extends 클래스{
	final int a = 2;
}



public class afa {
	public static void main(String[] args) {
		int value = 0;
		int cnt =0;
		int []arr = {1,6,4,3,7,8,9};
		for(int i=1; i<arr.length; i++) {
			for(int j=i; j>0 && arr[j] < arr[j-1]; j--) {
				value = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = value;
			}
			cnt++;
		}
		for(int i=0; i<7; i++) {
			System.out.println(arr[i] + " " + cnt);
		}
		
//		int [][] arr = new int[2][];
//		arr[0] = new int[]{1, 3, 5};
//		arr[1] = new int[]{7, 9};
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//		}
	
	}
}
