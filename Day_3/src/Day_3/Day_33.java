package Day_3;
import java.util.Scanner;
public class Day_33 {
	public static void main(String[] args) {
		
		
		
		int ie = 10;
		while(ie>0) {
			System.out.println(ie);
			ie-=2;
		}
		
		Scanner sc = new Scanner(System.in);

		int num = 0; // local variable
		
		int []arr; //reference variable
		arr = new int[4]; // array alloc
		 
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
		
		
		int[][]arr = new int[2][];
		arr[0]= new int[4];
		arr[1]= new int[2];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
				}
			}
		
		String str1= new String("Superman");
		String str2= new String("Superman");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Diff");
		}
		
		if(str1.equals(str2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Diff");
		}
		
		String str3= "Superman2";
		String str4= "Superman2";
		
		str3= "Batman";
		
		System.out.println(str3);
		System.out.println(str4);
		
		if(str3 == str4) {
			System.out.println("Same");
		}
		else {
			System.out.println("Diff");
		}
		
		if(str3.equals(str4)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Diff");
		}
		
/* 한사람의 성적 처리프로그램
 * 입력: 이름, 국어, 영어, 수학
 * 연산: 총점, 평균
 * 출력: 이름, 국어, 영어, 수학, 총점, 평균
 * 
*/
	
		String name; //name
		int []score; //kor, eng, mat, total
		float avg; //aver
		score = new int[4];
		String sub[] = {"국어","수학","영어"};
		
		System.out.print("이름을 입력하세요!");
		name = sc.next();
		
		int total = 0; 
		for(int i=0; i<3; i++) {
			System.out.println(sub[i]+"성적을 입력하세요!");
			score[i] = sc.nextInt();
			total += score[i];
		}
		score[3]=total;
		avg = score[3]/3;
		System.out.println("이름: " +name+" 국어: "+ score[0]+ " 영어: "+ score[1]+ " 수학: "+ score[2] + " 총점: "+ score[3] + " 평균: "+ avg);
		
			
		char a;
		float num1;
		float num2;
		
		do {
			System.out.println("첫번째 숫자를 입력하세요!");
			num1 = sc.nextFloat();
			System.out.println("연산기호를 입력하세요!");
			char sum = sc.next().charAt(0);
			System.out.println("두번째 숫자를 입력하세요!");
			num2 = sc.nextFloat();
		
			switch(sum) {
			case '+':
				System.out.println(num1 + "" + sum + "" + num2 + "=" +(num1 + num2));
				break;
			case '-':
				System.out.println(num1 + "" + sum + "" + num2 + "=" +(num1 - num2));
				break;
			case '*':
				System.out.println(num1 + "" + sum + "" + num2 + "=" +(num1 * num2));
				break;
			case '/':
				System.out.println(num1 + "" + sum + "" + num2 + "=" +(num1 / num2));
				break;
			default: System.out.println("잘못된 입력입니다!");
			}
			System.out.print("계속하시겠습니까??(y/n) ");
			a = sc.next().charAt(0);
		}while(a == 'y'||a =='Y');
	}
}

