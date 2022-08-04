package Day_19;

public class Shell {
	public static void main(String[] args) {
		int []arr = {8,1,4,2,7,6,3,5};
		int c = arr.length/2;
		
		for(int i=c; i<arr.length; i/=2) {
			for(int j=i; j<c; j++) {
				int k;
				int temp = arr[j];
				for(k = j-i; k>=0 && arr[k] > temp; k-=i) {
					arr[i + k] = arr[k];
					arr[i + k] =temp;
				}
			}
		}
	
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
}
