package Salary_Management;

import java.util.Scanner;

public class iods {
//	iods io = new iods();
	Menu mn = new Menu();
	Scanner sc = new Scanner(System.in);
	
	static String []q = new String[7];
	static String []q1 = new String[7];
	static String []q2 = new String[6];
	public static RG []rgw = new RG[10];
	public static Nrg []nrgw = new Nrg[10];

	
	
	public iods() {
		for(int i=0; i<10; i++) {
			rgw[i] = new RG();
			nrgw[i] = new Nrg();}	}

	public static void nameSearch(String name1,RG[] rgw, Nrg[] nrgw) {
		iods io = new iods();
	
		io.rgw = rgw; 
		io.nrgw = nrgw;
		
		for(int j=0; j<rgw.length; j++) {
			if(io.rgw[j].getName().equals(name1)) {
			System.out.println("정규직");
			System.out.println("이름 : " + io.rgw[j].getName() + "전화번호 : " + io.rgw[j].getPhone() + "년차 : " + io.rgw[j].getRgYear()
					           + "직책 : " + io.rgw[j].getRgPosition() + "업무평가 : " + io.rgw[j].getRgGrade() + "계좌번호 : " + io.rgw[j].getAccount()
					           + "총 급여 : " + io.rgw[j].getRgpay());
			}else if(io.nrgw[j].getName().equals(name1)) {
				
				System.out.println("비정규직");
				System.out.println("이름 : " + io.nrgw[j].getName() + "전화번호 : " + io.nrgw[j].getPhone() + "근무 시간 : " + io.nrgw[j].getNrgtime()
						           + "근무 일수 : " + io.nrgw[j].getNrgday() + "계좌 번호 : " + io.nrgw[j].getAccount() + "총 급여 : " + io.nrgw[j].getnrgpay());		
				}
		}
	
	}

	public static void Allserch(RG[] rgw, Nrg[] nrgw) {
		iods io = new iods();
	
		io.rgw = rgw; 
		io.nrgw = nrgw;
		
		for(int j=0; j<rgw.length; j++) {
			if(io.rgw[j].getName() != null) {
			System.out.println("정규직");
			System.out.println("이름 : " + io.rgw[j].getName() + "전화번호 : " + io.rgw[j].getPhone() + "년차 : " + io.rgw[j].getRgYear()
					           + "직책 : " + io.rgw[j].getRgPosition() + "업무평가 : " + io.rgw[j].getRgGrade() + "계좌번호 : " + io.rgw[j].getAccount()
					           + "총 급여 : " + io.rgw[j].getRgpay());
			}else if(io.nrgw[j].getName() != null) {
				
				System.out.println("비정규직");
				System.out.println("이름 : " + io.nrgw[j].getName() + "전화번호 : " + io.nrgw[j].getPhone() + "근무 시간 : " + io.nrgw[j].getNrgtime()
						           + "근무 일수 : " + io.nrgw[j].getNrgday() + "계좌 번호 : " + io.nrgw[j].getAccount() + "총 급여 : " + io.nrgw[j].getnrgpay());		
				}
		}
	
	}
	
	public static void Nrgserch(RG[] rgw, Nrg[] nrgw) {
		iods io = new iods();
		io.rgw = rgw; 
		io.nrgw = nrgw;
		for(int j=0; j<io.nrgw.length; j++) {
			if(io.nrgw[j].getName() !=null) {
			System.out.println("비정규직");
			System.out.println("이름 : " + io.nrgw[j].getName() + "전화번호 : " + io.nrgw[j].getPhone() + "근무 시간 : " + io.nrgw[j].getNrgtime()
					           + "근무 일수 : " + io.nrgw[j].getNrgday() + "계좌 번호 : " + io.nrgw[j].getAccount() + "총 급여 : " + io.nrgw[j].getnrgpay());
			}
	}
}
	public static void Rgserch(RG[] rgw, Nrg[] nrgw) {
		iods io = new iods();
		io.rgw = rgw; 
		io.nrgw = nrgw;
		for(int j=0; j<io.rgw.length; j++) {
			if(io.rgw[j].getName() !=null) {
			System.out.println("정규직");
			System.out.println("이름 : " + io.rgw[j].getName() + "전화번호 : " + io.rgw[j].getPhone() + "년차 : " + io.rgw[j].getRgYear()
					           + "직책 : " + io.rgw[j].getRgPosition() + "업무평가 : " + io.rgw[j].getRgGrade() + "계좌번호 : " + io.rgw[j].getAccount()
					           + "총 급여 : " + io.rgw[j].getRgpay());

		
			}
	}
	}
	public static RG RGInput(int num2) {
		iods io = new iods();
		Scanner sc = new Scanner(System.in);
		Menu mn = new Menu();
		String []q = new String[7];
		String []q1 = new String[7];
		String []q2 = new String[6];
		q = mn.menulist();
		q1 = mn.rgQuestion();
		q2 = mn.nrgQuestion();
			
				System.out.print(q1[0]);
				io.rgw[num2].setName(sc.next());
				
				System.out.print(q1[1]);
				io.rgw[num2].setRgYear(sc.nextInt());
				
				System.out.print(q1[2]);
				io.rgw[num2].setRgPosition(sc.nextInt());
				
				System.out.print(q1[3]);
				io.rgw[num2].setPhone(sc.next());
				
				System.out.print(q1[4]);
				io.rgw[num2].setRgGrade(sc.nextFloat());
				
				System.out.print(q1[5]);
				io.rgw[num2].setAccount(sc.next());
				
				System.out.print(q1[6]);
				io.rgw[num2].setRgPassword(sc.nextInt());
			
		return rgw[num2];
		}
	
	public static Nrg NrgInput(int num2) {
		iods io = new iods();
		Scanner sc = new Scanner(System.in);
		Menu mn = new Menu();
		String []q = new String[7];
		String []q1 = new String[7];
		String []q2 = new String[6];
		
		q = mn.menulist();
		q1 = mn.rgQuestion();
		q2 = mn.nrgQuestion();
		

				System.out.print(q2[0]);
				io.nrgw[num2].setName(sc.next());
				
				System.out.print(q2[1]);
				io.nrgw[num2].setNrgtime(sc.nextInt());
				
				System.out.print(q2[2]);
				io.nrgw[num2].setNrgday(sc.nextInt());
				
				System.out.print(q2[3]);
				io.nrgw[num2].setPhone(sc.next());
				
				System.out.print(q2[4]);
				io.nrgw[num2].setAccount(sc.next());
				
				System.out.print(q2[5]);
				io.nrgw[num2].setPassword(sc.nextInt());
				
				return nrgw[num2];
	}
	
	public static void RGRetouch(String name2,RG[] rgw, Nrg[] nrgw) {			// 정규직 수정
		iods io = new iods();
		io.rgw = rgw; 
		io.nrgw = nrgw;
		Scanner sc = new Scanner(System.in);
		Menu mn = new Menu();
		String []q = new String[7];
		String []q1 = new String[7];
		String []q2 = new String[6];
		q = mn.menulist();
		q1 = mn.rgQuestion();
		q2 = mn.nrgQuestion();
		
			
			for(int j=0; j<io.rgw.length; j++) {
				if(name2.equals(io.rgw[j].getName())) {
			
					System.out.println("이름 : " + io.rgw[j].getName() + "전화번호 : " + io.rgw[j].getPhone() + "년차 : " + io.rgw[j].getRgYear()
					           + "직책 : " + io.rgw[j].getRgPosition() + "업무평가 : " + io.rgw[j].getRgGrade() + "계좌번호 : " + io.rgw[j].getAccount()
					           + "총 급여 : " + io.rgw[j].getRgpay());
					
					System.out.print(q1[0]);
					io.rgw[j].setName(sc.next());
					
					System.out.print(q1[1]);
					io.rgw[j].setRgYear(sc.nextInt());
					
					System.out.print(q1[2]);
					io.rgw[j].setRgPosition(sc.nextInt());
					
					System.out.print(q1[3]);
					io.rgw[j].setPhone(sc.next());
					
					System.out.print(q1[4]);
					io.rgw[j].setRgGrade(sc.nextFloat());
					
					System.out.print(q1[5]);
					io.rgw[j].setAccount(sc.next());
					
					System.out.print(q1[6]);
					io.rgw[j].setRgPassword(sc.nextInt());
				}
			}
		}
	public static void NRGRetouch(String name3,RG[] rgw, Nrg[] nrgw) {			// 비정규직 수정
		Scanner sc = new Scanner(System.in);
		iods io = new iods();
		io.rgw = rgw; 
		io.nrgw = nrgw;
		Menu mn = new Menu();
		String []q = new String[7];
		String []q1 = new String[7];
		String []q2 = new String[6];
		q = mn.menulist();
		q1 = mn.rgQuestion();
		q2 = mn.nrgQuestion();
		
		
		for(int j=0; j<io.nrgw.length; j++) {
			if(name3.equals(io.nrgw[j].getName())) {
				System.out.println("이름 : " + io.nrgw[j].getName() + "전화번호 : " + io.nrgw[j].getPhone() + "근무 시간 : " + io.nrgw[j].getNrgtime()
				           + "근무 일수 : " + io.nrgw[j].getNrgday() + "계좌 번호 : " + io.nrgw[j].getAccount() + "총 급여 : " + io.nrgw[j].getnrgpay());
				System.out.print(q2[0]);
				io.nrgw[j].setName(sc.next());
				
				System.out.print(q2[1]);
				io.nrgw[j].setNrgtime(sc.nextInt());
				
				System.out.print(q2[2]);
				io.nrgw[j].setNrgday(sc.nextInt());
				
				System.out.print(q2[3]);
				io.nrgw[j].setPhone(sc.next());
				
				System.out.print(q2[4]);
				io.nrgw[j].setAccount(sc.next());
				
				System.out.print(q2[5]);
				io.nrgw[j].setPassword(sc.nextInt());
			}
		}
	}
	
	public static void userSearch(String psw,RG[] rgw, Nrg[] nrgw) {		// 검색
		iods io = new iods();
		io.rgw = rgw; 
		io.nrgw = nrgw;
		{
            for(int j =0; j<io.rgw.length; j++) {
                if(psw.equals(io.rgw[j].getRgPassword())) {
                   System.out.println("이름 : " + io.rgw[j].getName() + "전화번호 : " + io.rgw[j].getPhone() + "년차 : " + io.rgw[j].getRgYear()
                              + "직책 : " + io.rgw[j].getRgPosition() + "업무평가 : " + io.rgw[j].getRgGrade() + "계좌번호 : " + io.rgw[j].getAccount()
                              + "총 급여 : " + io.rgw[j].getRgpay());
                } else if(psw.equals(io.nrgw[j].getNrgPassword())) {
                	System.out.println("이름 : " + io.nrgw[j].getName() + "전화번호 : " + io.nrgw[j].getPhone() + "근무 시간 : " + io.nrgw[j].getNrgtime()
					           + "근무 일수 : " + io.nrgw[j].getNrgday() + "계좌 번호 : " + io.nrgw[j].getAccount() + "총 급여 : " + io.nrgw[j].getnrgpay());
                }

             }
		}
	}

	public static void userRetouch(String psw,RG[] rgw, Nrg[] nrgw) {
		Scanner sc = new Scanner(System.in);
		iods io = new iods();
		io.rgw = rgw; 
		io.nrgw = nrgw;
		for(int j=0; j<1; j++) {
			if(psw.equals(io.rgw[j].getRgPassword())) {
				System.out.println("이름 : " + io.rgw[j].getName() + "전화번호 : " + io.rgw[j].getPhone() + "년차 : " + io.rgw[j].getRgYear()
				           + "직책 : " + io.rgw[j].getRgPosition() + "업무평가 : " + io.rgw[j].getRgGrade() + "계좌번호 : " + io.rgw[j].getAccount()
				           + "총 급여 : " + io.rgw[j].getRgpay());
				System.out.print(q1[5]);
				io.rgw[j].setAccount(sc.next());
			}else if(psw.equals(io.nrgw[j].getNrgPassword())) {
				System.out.println("이름 : " + io.nrgw[j].getName() + "전화번호 : " + io.nrgw[j].getPhone() + "근무 시간 : " + io.nrgw[j].getNrgtime()
				           + "근무 일수 : " + io.nrgw[j].getNrgday() + "계좌 번호 : " + io.nrgw[j].getAccount() + "총 급여 : " + io.nrgw[j].getnrgpay());
				System.out.print(q2[4]);
				io.nrgw[j].setAccount(sc.next());
		}
	}
	}
}