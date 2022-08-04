package Day_3;
import java.util.Scanner;

public class Day_3 {

	public static void main(String[] args) {
		int i = 0;
		while(i<10) {
			int j = 2;
			i++;
			while(j<10) {
				System.out.print(j +"*"+ i + "=" +i*j);
				System.out.print("\t");
				j++;
			}
		System.out.println();
		}
		
		/*종이접기*/
		Scanner sc = new Scanner(System.in);
		
		int rect = 1;
		int count =0;
		while(rect<500) {
			count++;
			rect*=2;
			}
		System.out.println("count :" + count);
		System.out.println("rect :" + rect);
		
		/* 구구단 */
		System.out.print("구구단 입력: ");
		int num = sc.nextInt();
		int iu = 1;
		while(iu<10) {
			System.out.printf("\n%d * %d" + "=" + num*iu, num*iu);
			iu++;
			}
	}
	
	
}


