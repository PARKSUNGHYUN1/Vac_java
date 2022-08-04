package Day_7;

import java.util.Scanner;



public class Main {
   private RG[] rgw;
   private Nrg[] nrgw;

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
      int countnm;
      for(int i = 0; i<1; i++) {
      System.out.print("1. 관리자 모드  2. 사용자 모드 : ");
      int a = mn.requs1(1);
      if(a == 2) {
         System.out.print(q[0] + " : ");
         a = mn.requs2(a);
         System.out.println(a);
         if(a == 4) {
            System.out.print("1. 입력  2. 검색  3.수정  4.삭제 : ");
            a = mn.requs1(a);
            if(a == 8) {
               System.out.print("1. 정규직  2. 비정규직 : ");
               a = mn.requs1(a);
               if(a == 16) {
                  ma.input();
                  a=1;
                  i--;
               }else if(a == 24) {
                  int num1 = 0;
                  System.out.print(q2[0]);
                  ma.nrgw[num1].setNrgName(sc.next());
                  
                  System.out.print(q2[1]);
                  ma.nrgw[num1].setNrgtime(sc.nextInt());
                  
                  System.out.print(q2[2]);
                  ma.nrgw[num1].setNrgday(sc.nextInt());
                  
                  System.out.print(q2[3]);
                  ma.nrgw[num1].setNrgPhone(sc.next());
                  
                  System.out.print(q2[4]);
                  ma.nrgw[num1].setNrgAccount(sc.next());
                  
                  System.out.print(q2[5]);
                  ma.nrgw[num1].setPassword(sc.next());
                  num1++;
                  a=1;
                  i--;
               }
            }else if(a == 12) {
               System.out.print("1. 전체 검색  2. 정규직만 검색  3.비정규직만 검색  4.개별 검색 : ");
               a = mn.requs1(a); 
               
               if(a == 24) {
                  ///기능///
                  for(int j=0; j<ma.rgw.length; j++) {
                     if(ma.rgw[j].getRgName() !=null) {
                     System.out.println("정규직");
                     System.out.println("이름 : " + ma.rgw[j].getRgName() + "전화번호 : " + ma.rgw[j].getRgPhone() + "년차 : " + ma.rgw[j].getRgYear()
                                      + "직책 : " + ma.rgw[j].getRgPosition() + "업무평가 : " + ma.rgw[j].getRgGrade() + "계좌번호 : " + ma.rgw[j].getsRgAccount()
                                      + "총 급여 : " + ma.rgw[j].getRgpay());
      
                     } else if(ma.nrgw[j].getNrgName() !=null) {
                        
                     System.out.println("비정규직");
                     System.out.println("이름 : " + ma.nrgw[j].getNrgName() + "전화번호 : " + ma.nrgw[j].getNrgPhone() + "근무 시간 : " + ma.nrgw[j].getNrgtime()
                                      + "근무 일수 : " + ma.nrgw[j].getNrgday() + "계좌 번호 : " + ma.nrgw[j].getNrgAccount() + "총 급여 : " + ma.nrgw[j].getnrgpay());
                  
                     } 
                  }
               }
               }else if(a == 36) {
                  ///기능///
                  for(int j=0; j<ma.rgw.length; j++) {
                     if(ma.rgw[j].getRgName() !=null) {
                     System.out.println("정규직");
                     System.out.println("이름 : " + ma.rgw[j].getRgName() + "전화번호 : " + ma.rgw[j].getRgPhone() + "년차 : " + ma.rgw[j].getRgYear()
                                      + "직책 : " + ma.rgw[j].getRgPosition() + "업무평가 : " + ma.rgw[j].getRgGrade() + "계좌번호 : " + ma.rgw[j].getsRgAccount()
                                      + "총 급여 : " + ma.rgw[j].getRgpay());
      
                     }
                  }
               }else if(a == 60) {
                  ///기능///
                  for(int j=0; j<ma.nrgw.length; j++) {
                     if(ma.nrgw[j].getNrgName() !=null) {
                     System.out.println("비정규직");
                     System.out.println("이름 : " + ma.nrgw[j].getNrgName() + "전화번호 : " + ma.nrgw[j].getNrgPhone() + "근무 시간 : " + ma.nrgw[j].getNrgtime()
                                      + "근무 일수 : " + ma.nrgw[j].getNrgday() + "계좌 번호 : " + ma.nrgw[j].getNrgAccount() + "총 급여 : " + ma.nrgw[j].getnrgpay());
                  
                     }
                  }
                  
               }else if(a == 84) {
                  ///기능///
                  String name1 = null;
                  for(int j=0; j<1; j++) {
                     if(ma.rgw[j].getRgName().equals(name1)) {
                        System.out.println("이름 : " + ma.rgw[j].getRgName() + "전화번호 : " + ma.rgw[j].getRgPhone() + "년차 : " + ma.rgw[j].getRgYear()
                                   + "직책 : " + ma.rgw[j].getRgPosition() + "업무평가 : " + ma.rgw[j].getRgGrade() + "계좌번호 : " + ma.rgw[j].getsRgAccount()
                                   + "총 급여 : " + ma.rgw[j].getRgpay());
                     }
                     else if(ma.nrgw[j].getNrgName().equals(name1)) {
                        System.out.println("이름 : " + ma.nrgw[j].getNrgName() + "전화번호 : " + ma.nrgw[j].getNrgPhone() + "근무 시간 : " + ma.nrgw[j].getNrgtime()
                                   + "근무 일수 : " + ma.nrgw[j].getNrgday() + "계좌 번호 : " + ma.nrgw[j].getNrgAccount() + "총 급여 : " + ma.nrgw[j].getnrgpay());
                     }   
                  }
               }
               else if(a == 20) {
                  System.out.print("1. 정규직  2. 비정규직 : ");
                  a = mn.requs1(a);
                  if(a == 40) {
                     ///기능///
                     System.out.println(a);
                     String name2 = sc.next();
                     
                     for(int j=0; j<1; j++) {
                        if(ma.rgw[j].getRgName().equals(name2)) {
                           System.out.println("이름 : " + ma.rgw[j].getRgName() + "전화번호 : " + ma.rgw[j].getRgPhone() + "년차 : " + ma.rgw[j].getRgYear()
                                      + "직책 : " + ma.rgw[j].getRgPosition() + "업무평가 : " + ma.rgw[j].getRgGrade() + "계좌번호 : " + ma.rgw[j].getsRgAccount()
                                      + "총 급여 : " + ma.rgw[j].getRgpay());
                           
                           System.out.print(q1[0]);
                           ma.rgw[j].setRgName(sc.next());
                           
                           System.out.print(q1[1]);
                           ma.rgw[j].setRgYear(sc.nextInt());
                           
                           System.out.print(q1[2]);
                           ma.rgw[j].setRgPosition(sc.nextInt());
                           
                           System.out.print(q1[3]);
                           ma.rgw[j].setRgPhone(sc.next());
                           
                           System.out.print(q1[4]);
                           ma.rgw[j].setRgGrade(sc.nextFloat());
                           
                           System.out.print(q1[5]);
                           ma.rgw[j].setRgAccount(sc.next());
                           
                           System.out.print(q1[6]);
                           ma.rgw[j].setRgPassword(sc.next());
                        }
                        
                        
                     }
                     a=1;
                     i--;
                  }else if(a == 60) {
                     String name3 = sc.next();
                     for(int j = 0; j<1; j++){
                        if(ma.nrgw[j].getNrgName().equals(name3)) {
                           System.out.println("이름 : " + ma.nrgw[j].getNrgName() + "전화번호 : " + ma.nrgw[j].getNrgPhone() + "근무 시간 : " + ma.nrgw[j].getNrgtime()
                                      + "근무 일수 : " + ma.nrgw[j].getNrgday() + "계좌 번호 : " + ma.nrgw[j].getNrgAccount() + "총 급여 : " + ma.nrgw[j].getnrgpay());
                           System.out.print(q2[0]);
                           ma.nrgw[j].setNrgName(sc.next());
                           
                           System.out.print(q2[1]);
                           ma.nrgw[j].setNrgtime(sc.nextInt());
                           
                           System.out.print(q2[2]);
                           ma.nrgw[j].setNrgday(sc.nextInt());
                           
                           System.out.print(q2[3]);
                           ma.nrgw[j].setNrgPhone(sc.next());
                           
                           System.out.print(q2[4]);
                           ma.nrgw[j].setNrgAccount(sc.next());
                           
                           System.out.print(q2[5]);
                           ma.nrgw[j].setPassword(sc.next());
                        }   
                     }
                  }
                  a=1;
                  i--;
               }
//            else if(a == 28) {
//               System.out.print("1. 정규직 \t 2. 비정규직 : ");
//               a = mn.requs1(a);
//               if(a == 56) {
//                  ///기능///
//                  System.out.print("삭제할 직원을 입력하세요 : ");
//                  String name4 =sc.next();
//                  int sel;
//                  for(int j=0; j<9; j++) {
//                     if(ma.rgw[j].getRgName().equals(name4)) {
//                     System.out.println("정규직");
//                     System.out.println("이름 : " + ma.rgw[j].getRgName() + "전화번호 : " + ma.rgw[j].getRgPhone() + "년차 : " + ma.rgw[j].getRgYear()
//                                      + "직책 : " + ma.rgw[j].getRgPosition() + "업무평가 : " + ma.rgw[j].getRgGrade() + "계좌번호 : " + ma.rgw[j].getsRgAccount()
//                                      + "총 급여 : " + ma.rgw[j].getRgpay());
//                     System.out.println("자를래?(1,2) : ");
//                     sel =sc.nextInt();
//                     if(sel == 1) {
//                        System.out.print(q1[0]);
//                        ma.rgw[j] = new RG();
//                        ma.rgw[j].setRgName("");
//                        
//                        System.out.println(ma.rgw[j].getRgName());
//                        
//                        
//                        for(int k = 0; k<9; k++) {
//                           System.out.print("fe");
//                           if(ma.rgw[k].getRgName() == NULL) {
//                              System.out.print("fe");
//                              ma.rgw[k] = new RG();
//                              ma.rgw[k] = ma.rgw[k+1];
//                           }
//                        }
//                        
//                        
//                     }else if(sel == 2) {
//                        System.out.println("처음으로");
//                     }
//                     a=1;
//                     i--;
//                     }
//                  }
//               }else if(a == 84) {
//                  ///기능///
//               }
//            }
//         }
//         }
      else if (a == 3) {
         System.out.println(q[1]);
         a = mn.requs2(a);
         if(a == 6) {
         System.out.print("1. 조회  2. 수정 : ");
         a = mn.requs1(a);
         if(a == 12) {
            System.out.print("1. 정규직 \t 2. 비정규직");
            a = mn.requs1(a);
            if(a == 24) {
            System.out.println("사용자의 패스워드를 입력하세요! ");
            	String psw = sc.next();
            	for(int ii =0; ii<1; ii++) {
            		if(ma.rgw[ii].getRgPassword().equals(psw)) {
            			System.out.println("이름 : " + ma.rgw[ii].getRgName() + "전화번호 : " + ma.rgw[ii].getRgPhone() + "년차 : " + ma.rgw[ii].getRgYear()
                                + "직책 : " + ma.rgw[ii].getRgPosition() + "업무평가 : " + ma.rgw[ii].getRgGrade() + "계좌번호 : " + ma.rgw[ii].getsRgAccount()
                                + "총 급여 : " + ma.rgw[ii].getRgpay());
            		}
            		a=1;
        			ii--;
            	}}
        			else {
        				System.out.print("다시입력하세요!!");
        				a=1;
        			}
            	}
               }
            }else if(a ==36) {
            	System.out.println("사용자의 패스워드를 입력하세요! ");
            	int psw2 = sc.nextInt();
            	for(int ii =0; ii<1; ii++) {
            		if(ma.nrgw[ii].getPassword()=psw2) {
            			System.out.println("이름 : " + ma.nrgw[ii].getNrgName() + "전화번호 : " + ma.nrgw[ii].getNrgPhone() + "근무 시간 : " + ma.nrgw[ii].getNrgtime()
                                + "근무 일수 : " + ma.nrgw[ii].getNrgday() + "계좌 번호 : " + ma.nrgw[ii].getNrgAccount() + "총 급여 : " + ma.nrgw[ii].getnrgpay());
            		}
            		a=1;
        			ii--;
            	}}
        			else if{
        				System.out.print("다시입력하세요!!");
        				a=1;
        			}
            }
         }else if(a ==18) {
            System.out.print("1. 정규직 \t 2. 비정규직");
            a = mn.requs1(a);
            if(a == 36) {
               ///기능///
            }else if(a == 54) {
               ///기능///
            }
         }
         }}}}
      
      
      
      void input() {
         Scanner sc = new Scanner(System.in);
         Menu mn = new Menu();
      
         String []q = new String[7];
         String []q1 = new String[7];
         String []q2 = new String[6];
         q1 = mn.rgQuestion();
         q2 = mn.nrgQuestion();
         int num2 =0;
         
         System.out.print(q1[0]);
         rgw[num2].setRgName(sc.next());
         
         System.out.print(q1[1]);
         rgw[num2].setRgYear(sc.nextInt());
         
         System.out.print(q1[2]);
         rgw[num2].setRgPosition(sc.nextInt());
         
         System.out.print(q1[3]);
         rgw[num2].setRgPhone(sc.next());
         
         System.out.print(q1[4]);
         rgw[num2].setRgGrade(sc.nextFloat());
         
         System.out.print(q1[5]);
         rgw[num2].setRgAccount(sc.next());
         
         System.out.print(q1[6]);
         rgw[num2].setRgPassword(sc.next());
         
         num2 ++;
   }}
   
   



