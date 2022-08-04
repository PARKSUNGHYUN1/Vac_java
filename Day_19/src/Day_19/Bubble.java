package Day_19;

public class Bubble {
	public static void main(String[] args) {
		int []arr = {1,6,4,3,7,8,9};
		int value;
		for(int i=0; i<7; i++) {
			int cnt=0;
			for(int j=arr.length-1; j>cnt && arr[j] < arr[j-1]; j--) {
				
					value = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = value;
					cnt++;
				
				
			}System.out.println(i);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
