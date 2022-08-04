package Day4;
import java.util.Scanner;
import java.util.Comparator;

public class Day_44 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int [][][]score;
		String name[][];
		float [][]avg;
		int [][]arr;
		
		System.out.println("학교에 몇반있습니까?");
		int num=sc.nextInt();
		
		score = new int[num][20][4];// 반:5/ 학생수:20 / 성적
		name = new String[num][20];
		avg = new float[num][20];
		arr = new int[20][1];
		
		
		 while(true) {
			System.out.println("1: 입력  2: 출력  3: 검색  4. 종료");
			int control = sc.nextInt();
			
			if(control ==1) {
				System.out.print("몇반으로 하시겠습니까?");			
				int num1 = sc.nextInt();
				
				for(int i=0; i<name[num1].length; i++) {
					if(name[num1-1][i] == null) {
						System.out.print("이름이 뭐에요?");			
						name[num1-1][i] = sc.next();
						
						System.out.print("국어성적을 입력하세요!");								
						score[num1-1][i][0] = sc.nextInt();
						score[num1-1][i][3] += score[num1-1][i][0];
						arr[i][0] += score[num-1][i][0];
						
						System.out.print("수학성적을 입력하세요!");								
						score[num1-1][i][1] = sc.nextInt();
						score[num1-1][i][3] += score[num1-1][i][1];
						arr[i][0] += score[num-1][i][1];
						
						System.out.print("영어성적을 입력하세요!");								
						score[num1-1][i][2] = sc.nextInt();
						score[num1-1][i][3] += score[num1-1][i][2];
						arr[i][0] += score[num-1][i][2];
						
						avg[num1-1][i] = score[num1-1][i][3]/3.f;
						
						break;
					}
					}
				}
		 	else if(control ==2) { 
				System.out.print("1: 전체출력  2: 반별출력");
				int output = sc.nextInt();
				if(output==1) {
					for(int i=0; i<name.length; i++) {
						System.out.println(i+1+"반");
						for(int j=0; j<name[i].length; j++) {
							System.out.print("이름: "+ name[i][j]);
							System.out.println("성적" + arr[j]);
					}
				}
				}
				else if(output == 2){
					System.out.println("몇반을 출력하시겠습니까?");
					int cout = sc.nextInt()-1;
					for(int i=0; i<score.length; i++) {
						if(score[cout] != null) {
							System.out.print("이름: "+ name[cout][i]);
						}
						for(int j=0; j<3; j++) {
							System.out.print(" 점수: " + score[cout][i][j]);
						}
						System.out.print(" 총점: "+ score[cout][i][3]);
						System.out.println(" 평균: "+ avg[cout][i]);
					}
				}
			}
			else if(control ==3) {
				System.out.print("1. 이름검색  2. 성적검색");
				int serch = sc.nextInt();
				if(serch == 1) {
					System.out.print("정확한 이름을 입력해주세요!");
					String sern = sc.next();
					for(int i=0; i<5; i++) {
						for(int j=0; j<20; j++) {
							if(sern.equals(name[i][j])) {
								System.out.println(name[i][j] + " ");
							}
						}
					}
				}
				else if(serch == 2) {
					System.out.print("성적을 입력해주세요!");
					int serc = sc.nextInt();
				}
			}
			else if(control ==4) {
				System.exit(-1);
			}
		}
	}
}
