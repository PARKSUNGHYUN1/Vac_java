package Day_13;
import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Students> student = new ArrayList<Students>();
	
		while(true) {
			System.out.print("학번을 입력하세요:  ");
			int pwd = sc.nextInt();
			System.out.println("---------------------------------------------------------------------");
			if(pwd == 123) {
				System.out.println("1. 학생입력 |  2. 학생출력 |  3. 학생검색(성적별) |  4. 학생수정  |  5. 학생삭제  |  6. 종료");
				int num = sc.nextInt();
				switch(num) {
				case 1:
					System.out.print("반을 입력하세요");
					int cla = sc.nextInt();
					System.out.println();
					
					System.out.print("이름을 입력하세요");
					String name = sc.next();
					System.out.println();
					
					System.out.print("학번을 입력하세요");
					int classnum = sc.nextInt();
					System.out.println();
					
					System.out.print("국어성적을 입력하세요");
					int kor = sc.nextInt();
					System.out.println();
					
					System.out.print("수학성적을 입력하세요");
					int math = sc.nextInt();
					System.out.println();
					
					System.out.print("영어성적을 입력하세요");
					int eng = sc.nextInt();
					System.out.println();
					
				for(int i=0; i<1;i++ ) {
					student.add(new Students(name, classnum,cla, kor, eng, math));
				}break;
				case 2:
					System.out.println("1. 전체출력  | 2. 반별출력  | 3. 개별검색");
					int num1 = sc.nextInt();
					if(num1 ==1) {
						for(int i =0; i<student.size(); i++) {
							System.out.println("반: " + student.get(i).getCla());
							System.out.print(" |이름: " + student.get(i).getName());
							System.out.print(" |학번: " + student.get(i).getClassnum());
							System.out.print(" |국어: " + student.get(i).getKor());
							System.out.print(" |영어: " + student.get(i).getEng());
							System.out.print(" |수학: " + student.get(i).getMath());
							System.out.print(" |총점: " + student.get(i).getTotal());
							System.out.print(" |평균: " + student.get(i).getAvg()+"\n" );
							if(student.get(i).getAvg() >= 90) {
								System.out.println("A등급 입니다!!");
							}
							else if(student.get(i).getAvg()<90 && student.get(i).getAvg() >= 80) {
								System.out.println("B등급 입니다!!");
							}
							else if(student.get(i).getAvg()<80 && student.get(i).getAvg() >= 70) {
								System.out.println("C등급 입니다!!");
							}
							else if(student.get(i).getAvg()<70 && student.get(i).getAvg() >= 60) {
								System.out.println("D등급 입니다!!");
							}
							else {
								System.out.println("F등급 입니다!!");
							}
						}break;
					}
					else if(num1 ==2) {
						System.out.println("몇반을 출력하시겠습니까?");
						int cnum = sc.nextInt();
						for(int i=0; i<student.size(); i++) {
							if(cnum == student.get(i).getCla()) {
								System.out.println(cnum+"반");
								System.out.print(" |이름: " + student.get(i).getName());
								System.out.print(" |학번: " + student.get(i).getClassnum());
								System.out.print(" |국어: " + student.get(i).getKor());
								System.out.print(" |영어: " + student.get(i).getEng());
								System.out.print(" |수학: " + student.get(i).getMath());
								System.out.print(" |총점: " + student.get(i).getTotal());
								System.out.print(" |평균: " + student.get(i).getAvg()+"\n" );
							}
						}break;
					}
					else if(num ==3) {
						System.out.println("학번을 입력해주세요! ");
						int cnnum = sc.nextInt();
						for(int i=0; i<student.size(); i++) {
							if(cnnum == student.get(i).getClassnum()) {
								System.out.println("반: " + student.get(i).getCla());
								System.out.print(" |이름: " + student.get(i).getName());
								System.out.print(" |학번: " + student.get(i).getClassnum());
								System.out.print(" |국어: " + student.get(i).getKor());
								System.out.print(" |영어: " + student.get(i).getEng());
								System.out.print(" |수학: " + student.get(i).getMath());
								System.out.print(" |총점: " + student.get(i).getTotal());
								System.out.print(" |평균: " + student.get(i).getAvg()+"\n" );
							}
						}break;
					}
				case 3:
					System.out.println("1. 국어  | 2. 수학  | 3. 영어  | 4. 총점");
					int snum = sc.nextInt();
					if(snum == 1) {
						student.sort(new KorComparator());
				        System.out.println("국어 순 오름차순 ");
				        for(int i =0; i<student.size(); i++) {
							System.out.println("반: " + student.get(i).getCla());
							System.out.print(" |이름: " + student.get(i).getName());
							System.out.print(" |학번: " + student.get(i).getClassnum());
							System.out.print(" |국어: " + student.get(i).getKor());
							System.out.print(" |영어: " + student.get(i).getEng());
							System.out.print(" |수학: " + student.get(i).getMath());
							System.out.print(" |총점: " + student.get(i).getTotal());
							System.out.print(" |평균: " + student.get(i).getAvg()+"\n" );
						}break;
				        
					}
					else if(snum == 2) {
						student.sort(new MathComparator());
				        System.out.println("수학 순 내림차순 ");
				        for(int i =0; i<student.size(); i++) {
							System.out.println("반: " + student.get(i).getCla());
							System.out.print(" |이름: " + student.get(i).getName());
							System.out.print(" |학번: " + student.get(i).getClassnum());
							System.out.print(" |국어: " + student.get(i).getKor());
							System.out.print(" |영어: " + student.get(i).getEng());
							System.out.print(" |수학: " + student.get(i).getMath());
							System.out.print(" |총점: " + student.get(i).getTotal());
							System.out.print(" |평균: " + student.get(i).getAvg()+"\n" );
						}break;
					}
					else if(snum == 3) {
						student.sort(new EngComparator());
				        System.out.println("영어 순 내림차순 ");
				        for(int i =0; i<student.size(); i++) {
							System.out.println("반: " + student.get(i).getCla());
							System.out.print(" |이름: " + student.get(i).getName());
							System.out.print(" |학번: " + student.get(i).getClassnum());
							System.out.print(" |국어: " + student.get(i).getKor());
							System.out.print(" |영어: " + student.get(i).getEng());
							System.out.print(" |수학: " + student.get(i).getMath());
							System.out.print(" |총점: " + student.get(i).getTotal());
							System.out.print(" |평균: " + student.get(i).getAvg()+"\n" );
						}break;
					}
					else if(snum == 4) {
						student.sort(new TotalComparator());
				        System.out.println("총점 순 내림차순 ");
				        for(int i =0; i<student.size(); i++) {
							System.out.println("반: " + student.get(i).getCla());
							System.out.print(" |이름: " + student.get(i).getName());
							System.out.print(" |학번: " + student.get(i).getClassnum());
							System.out.print(" |국어: " + student.get(i).getKor());
							System.out.print(" |영어: " + student.get(i).getEng());
							System.out.print(" |수학: " + student.get(i).getMath());
							System.out.print(" |총점: " + student.get(i).getTotal());
							System.out.print(" |평균: " + student.get(i).getAvg()+"\n" );
						}break;
					}
				case 5:
					System.out.println("삭제할 학번을 입력해주세요! ");
					int dnum = sc.nextInt();
					for(int i =0; i<student.size(); i++) {
						if(dnum == student.get(i).getClassnum()) {
							student.remove(i);
							System.out.println("학생삭제가 완료 되었습니다!!");
						}break;
					}
				case 6:
					System.exit(-1);
					
				case 4:
					System.out.println("수정할 학번을 입력해주세요! ");
					Students stu = new Students();
					int ssnum = sc.nextInt();
					for(int i=0; i<student.size(); i++) {
						if(ssnum == student.get(i).getClassnum()) {
							System.out.println("수정후 학번을 입력해주세요!! ");
							student.remove(i);
						}
					}
			}	
			}
			else {
				for(int i=0; i<student.size(); i++) {
					if(pwd == student.get(i).getClassnum()) {
						System.out.println("반: " + student.get(i).getCla());
						System.out.print(" |이름: " + student.get(i).getName());
						System.out.print(" |학번: " + student.get(i).getClassnum());
						System.out.print(" |국어: " + student.get(i).getKor());
						System.out.print(" |영어: " + student.get(i).getEng());
						System.out.print(" |수학: " + student.get(i).getMath());
						System.out.print(" |총점: " + student.get(i).getTotal());
						System.out.print(" |평균: " + student.get(i).getAvg()+"\n" );
					}
				}
			}
		}
	}
}
  