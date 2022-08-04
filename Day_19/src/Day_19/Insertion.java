package Day_19;

public class Insertion {
	public static void main(String[] args) {
		int []arr = {6,4,3,7,1,9,8};
		int value;
		int com=0;	// 비교횟수
		int cnt=0;	// 교환
		
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			for(int j=i; j> 0 && arr[j-1] > temp; j--) {
				value = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = value;
				com++;
			}
			cnt++;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.print("비교횟수 : "+ com + " ");
		System.out.print("교환횟수 : "+ cnt);
	}
}
