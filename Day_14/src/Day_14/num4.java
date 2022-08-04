package Day_14;
import java.util.*;

public class num4 {
	
	static void permutation(int[] arr, int depth, int n, int r) {	// 순열로 경우의 수를 프린트해주는 메소드(순열로 각각 경우를 뽑은뒤 정렬된 0번째 인덱스가 0이 아니면 출력)
	    if (depth == r) {
	        print(arr, r);
	        return;
	    }
	 
	    for (int i=depth; i<n; i++) {
	        swap(arr, depth, i);
	        permutation(arr, depth + 1, n, r);
	        swap(arr, depth, i);
	    }
	}
	static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++)
        	if(arr[0] !=0) {
        		System.out.print(arr[i] + " ");
        	}
        System.out.println();
    }
	 
	static void swap(int[] arr, int depth, int i) {
	    int temp = arr[depth];
	    arr[depth] = arr[i];
	    arr[i] = temp;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int ca;
		int num = rand.nextInt(9000)+1000;
		System.out.println("변경전 값: " + num);
		int f_num = num/1000;
		int s_num = (num - f_num * 1000) / 100;
		int t_num = (num - (f_num * 1000)- (s_num * 100))/10;
		int fu_num = (num - (f_num * 1000)- (s_num * 100)- (t_num *10));
		
		arr.add(f_num);
		arr.add(s_num);
		arr.add(t_num);
		arr.add(fu_num);
		int []perCheck = new int[arr.size()];
		
		int [] iarr = new int[arr.size()];
		for (int i = 0 ; i < arr.size() ; i++) {
	        iarr[i] = arr.get(i).intValue();
		}
		permutation(iarr, 0, 4, 4);
		
		Collections.sort(arr);
		if(arr.get(0).equals(0)) {
			fu_num = arr.get(0);
			s_num = arr.get(2);
			t_num = arr.get(3);
			f_num = arr.get(1);
			if(arr.get(1).equals(0)) {
				fu_num = arr.get(0);
				t_num = arr.get(1);
				f_num = arr.get(2);
				s_num = arr.get(3);
				if(arr.get(2).equals(0)) {
					fu_num = arr.get(0);
					t_num = arr.get(1);
					s_num = arr.get(2);
					f_num = arr.get(3);
				}
			}
		}else {
			f_num = arr.get(0);
			s_num = arr.get(1);
			t_num = arr.get(2);
			fu_num = arr.get(3);
		}
			
		System.out.println("변경후 값: " + (f_num)+(s_num)+(t_num)+fu_num);
	}
}


