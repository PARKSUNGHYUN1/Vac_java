package Day4;

import java.util.Scanner;

public class Day_4 {
	public static void main(String[] args) {
		String [][]name;
		int [][][]score;
		float [][]avg;
		int []classs;
		Scanner sc = new Scanner(System.in);
		System.out.print("반 수 입력 : ");
		int num1 = sc.nextInt();
		int num2;
		name = new String[num1][];
		score = new int[num1][][]; //[반] [학생] [성적]
		avg = new float[num1][];
		classs = new int [num1];
		
		String sub[] = {"국어","영어","수학"};
		
		
		for(int i=0; i<num1; i++) {
			System.out.print(i+1+"반학생 수 입력 : ");
			
			num2 = sc.nextInt();
			name[i] = new String[num2];
			
			
			score[i] = new int[num2][4];
			avg[i] = new float[num2];
		}
		
		for(int c=0; c<classs.length; c++) {
			System.out.println("반을 입력하세요!!");
			classs[c] = sc.nextInt();
			for(int i=0; i<score[c].length; i++) {
				System.out.println("이름을 입력하세요!!");
				name[c][i] = sc.next();
				for(int j=0; j<3; j++) {
					System.out.println(sub[j]+"을 입력하세요!!");
					score[c][i][j] = sc.nextInt();
					score[c][i][3] += score[c][i][j];
				}
				avg[c][i] = score[c][i][3] / 3.f;
			}
		}
		
		for(int c=0; c<num1; c++) {
			System.out.println("반: "+classs[c]+",");
		
			for(int i=0; i<score[c].length; i++) {
				System.out.print("이름: "+name[c][i]+",");
				for(int j=0; j<3; j++) {
					System.out.print(sub[j] +": "+score[c][i][j]+",");
				}
				System.out.println("총점: "+score[c][i][3]+" 평균: "+avg[c][i]);
			}		
		}
		
		
		
/*		score = new int[4];
		
		name = sc.next();
		
		for(int i=0; i<score.length-1; i++) {
			score[i] = sc.nextInt();
			
			score[3] += score[i];
		}
		
		avg = score[3]/ 3.f;

		
		System.out.println(name);
//		for(int i =0; i<score.length; i++) {
//			System.out.println(score[i]);
//		}
		
		for(int i:score) {
			System.out.println(i);
		}
		System.out.println(avg);
		*/
 	}
}
