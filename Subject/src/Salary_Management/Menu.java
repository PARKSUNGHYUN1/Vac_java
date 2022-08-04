package Salary_Management;

import java.util.Scanner;

public class Menu {
	
	static char select(){
		char menu;
		Scanner sc = new Scanner(System.in);
		menu = sc.next().charAt(0);
		return menu;
	}
	
	static int requs1(int a){
		char menu, menu2;
		menu = select();
		Menu menulist = new Menu();
		Menu mn = new Menu();
		String []q = new String[7];
		q = menulist();
		for(int i = 0; i<1; i
				
				++) {
			if(menu == 49) {
				a *= 2;
			}else if(menu == 50) {
				a *= 3;
			}else if(menu == 51) {
				a *= 5;
			}else if(menu == 52) {
				a *= 7;
			}if(menu < 49 || menu > 53) {
				System.out.print("다시 입력해주세요");
				i--;
				menu = select();
			}
		}
		return a;

	}
	static int requs2(int a){
		Scanner sc = new Scanner(System.in);
		char menu;
		String pw;
		pw = sc.next();

		String []q = new String[7];
		q = menulist();
		for(int i = 0; i<1; i++) {
		if(pw.equals("abc123")) {
			Menu menulist = new Menu();
			Menu mn = new Menu();
			a *= 2;
		}if(!pw.equals("abc123")) {
			System.out.println("다시 입력해주세요");
			i--;
			pw = sc.next();
		}
		}
		return a;

	}
	static String[] menulist(){
		String []q = new String[2];
	
		q[0] = "Admin의 비밀번호를 입력하세요";
		q[1] = "사용자의 비밀번호를 입력하세요 : ";

			return q;	
	}
	
	static String[] rgQuestion() {
		String []q1 = new String[7];
		
		q1[0] = "1. 이름을 입력하세요. : ";
		q1[1] = "2. 년차(숫자)를 입력하세요. : ";
		q1[2] = "3. 직책을 입력하세요. (ex) 부장(1), 차장(2), 과장(3), 대리(4), 사원(5) : ";
		q1[3] = "4. 전화번호를 입력하세요. : ";
		q1[4] = "5. 업무평가점수를 입력하세요. : 1. A  2. B  3. C ";
		q1[5] = "6. 계좌번호를 입력하세요. : ";
		q1[6] = "7. 설정하실 비밀번호를 입력하세요. : ";
		
			return q1;
	}

	static String[] nrgQuestion() {
		String []q2 = new String[7];
		q2[0] = "1. 이름을 입력하세요. : ";
		q2[1] = "2. 한달 근무일수(숫자)를 입력하세요. : ";
		q2[2] = "3. 하루 근무시간(숫자)을 입력하세요. : ";
		q2[3] = "4. 전화번호를 입력하세요. : ";
		q2[4] = "5. 계좌번호를 입력하세요. : ";
		q2[5] = "6. 설정하실 비밀번호를 입력하세요. : ";
				
			return q2;
	}
}
