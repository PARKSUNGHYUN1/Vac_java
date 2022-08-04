package Day_19;

public class Selction {
	public static void main(String[] args) {
		int []arr = {1,6,4,3,7,8,9};
		int cnt=1;
		int value=0;
		for(int i=0; i<6; i++) {
			int s=arr[i];
			
			for(int j=cnt; j<7; j++) {
				if(s > arr[j]) {
					value = s;
					s = arr[j];
					arr[j] =value;
				}
				else {
					
				}
			}System.out.println(i);
			cnt++;
			arr[i]= s;
		}
		for(int i=0; i<7; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
