package Day_20;

public class lad {
	public static void main(String[] args) {
		int a;
		int cnt=0;
		int val = 0;
		int []arr = {1,6,4,3,7,8,9};
		
		for(int i=0; i<arr.length; i++) {
			a = arr[i];
			int j;
			for(j=arr.length-1; j>i; j--) {
				if(a>arr[j]) {
					a = arr[j];		
					val =j;
				}
			}
			arr[val] = arr[i];
			arr[i] = a;
			cnt++;
			
		}
		
		
		for(int i=0; i<7; i++) {
			System.out.println(arr[i] +" "+cnt);
		}
	}
}
