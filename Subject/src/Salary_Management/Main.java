package Salary_Management;

import java.util.Scanner;

public class Main {
	private static 
[] nrgw;
	static iods id = new iods();
	
	public Main() {
		rgw = new RG[10];
		nrgw = new Nrg[10];
		for(int i=0; i<10; i++) {
			rgw[i] = new RG();
			nrgw[i] = new Nrg();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main ma = new Main();
		Menu mn = new Menu();
		String []q = new String[7];
		String []q1 = new String[7];
		String []q2 = new String[6];
		q = mn.menulist();
		q1 = mn.rgQuestion();
		q2 = mn.nrgQuestion();
		int num1 = 0, num = 0;

		for(int i = 0; i<1; i++) {
		System.out.print("1. 관리자 모드  2. 사용자 모드 : ");
		int a = mn.requs1(1);
		if(a == 2) {
			System.out.print(q[0] + " : ");
			a = mn.requs2(a);
			
			if(a == 4) {
				System.out.print("1. 입력  2. 검색  3.수정  4.삭제 : ");
				a = mn.requs1(a);
				if(a == 8) {
					System.out.print("1. 정규직  2. 비정규직 : ");
					a = mn.requs1(a);
					if(a == 16) {
						
						rgw[num] = id.RGInput(num);
						num++;
						a=1;
						i--;
					}else if(a == 24) {
						nrgw[num1] = id.NrgInput(num1) ;
						a=1;
						i--;
					}
				}else if(a == 12) {
					System.out.print("1. 전체 검색  2. 정규직만 검색  3.비정규직만 검색  4.개별 검색 : ");
					a = mn.requs1(a); 
					if(a == 24) {
						///기능///
						id.Allserch(rgw,nrgw);
						a = 1;
						i--;
					}if(a == 36) {
						///기능///
						id.Rgserch(rgw,nrgw);
					}if(a == 60) {
						///기능///
						id.Nrgserch(rgw,nrgw);
						
					}else if(a == 84) {
						///기능///
						String name1 = sc.next();
						id.nameSearch(name1, rgw, nrgw);
						a = 1;
						i--;
					}
				}
					else if(a == 20) {
						System.out.print("1. 정규직  2. 비정규직 : ");
						a = mn.requs1(a);
						if(a == 40) {
							///기능///
							String name2 = sc.next();
							id.NRGRetouch(name2, rgw, nrgw);
							a=1;
							i--;
						}else if(a == 60) {
							String name3 = sc.next();
							id.RGRetouch(name3, rgw, nrgw);
						}
						a=1;
						i--;
					}
				else if(a == 28) {
					String name6 = sc.next();
						for(int j = 0; j <ma.rgw.length; j++) {
							if(ma.rgw[j].getName()==name6)  {
								ma.rgw[j] = null;
						}else if(ma.nrgw[j].getName() ==name6) {
							ma.nrgw[j] = null;
						}
							a=1;
							i--;
							}		
						}
				}
		else if (a == 3) {
			System.out.println("사용자의 패스워드를 입력하세요! ");
            String psw = sc.next();
            id.userSearch(psw, rgw, nrgw);
            a=6;
			if(a == 6) {
			System.out.print("1. 조회  2. 수정 : ");
			a = mn.requs1(a);
			if(a == 12) {
				id.userSearch(psw, rgw, nrgw);
	                a=1;
					i--;
			}if(a ==18) {
						for(int j=0; j<1; j++) {
							if(psw.equals(ma.rgw[j].getRgPassword())) {
								System.out.println("이름 : " + ma.rgw[j].getName() + "전화번호 : " + ma.rgw[j].getPhone() + "년차 : " + ma.rgw[j].getRgYear()
								           + "직책 : " + ma.rgw[j].getRgPosition() + "업무평가 : " + ma.rgw[j].getRgGrade() + "계좌번호 : " + ma.rgw[j].getAccount()
								           + "총 급여 : " + ma.rgw[j].getRgpay());
								System.out.print(q1[5]);
								ma.rgw[j].setAccount(sc.next());
							}else if(psw.equals(ma.nrgw[j].getNrgPassword())) {
								System.out.println("이름 : " + ma.nrgw[j].getName() + "전화번호 : " + ma.nrgw[j].getPhone() + "근무 시간 : " + ma.nrgw[j].getNrgtime()
								           + "근무 일수 : " + ma.nrgw[j].getNrgday() + "계좌 번호 : " + ma.nrgw[j].getAccount() + "총 급여 : " + ma.nrgw[j].getnrgpay());
								System.out.print(q2[4]);
								ma.nrgw[j].setAccount(sc.next());
						}
						a=1;
						i--;
				}
			}	
		}
		}
	}
	}

	}
}
	
	




