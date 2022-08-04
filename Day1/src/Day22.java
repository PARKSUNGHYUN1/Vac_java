import java.util.Iterator;
import java.util.Scanner;

public class Day22 {
	public static void main(String[] args) {
		/*종이접기*/
		Scanner sc = new Scanner(System.in);
		
		int count;
		int rect = 1;

		for(count =1;rect<500; count++) {
			rect*=2;
			}
		System.out.println("count :" + count);
		System.out.println("rect :" + rect);
		/* 구구단*/
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j +"*"+ i + "=" +i*j);
				System.out.print("\t");
			}
		System.out.println();
		}
		}
		
		}


