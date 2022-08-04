package Day_13;
import java.util.*;

public class Set {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Students> student = new TreeSet<Students>(new ClassnumComparator());

		while(true) {
			System.out.print("학번을 입력하세요:  ");
			int pwd = sc.nextInt();
			System.out.println("---------------------------------------------------------------------------------");
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

					System.out.print("학번을 입력하세요(*중복이 허용되지 않습니다*)");
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

					student.add(new Students(name, classnum,cla, kor, eng, math));
					break;
				case 2:
					System.out.println("1. 전체출력  | 2. 반별출력  | 3. 개별검색");
					int num1 = sc.nextInt();
					if(num1 ==1) {
						Iterator<Students> iter = student.iterator();
						while(iter.hasNext()) {
							Students std = iter.next();
							std.dp();
							if(std.getAvg() >= 90) {
								System.out.println("A등급 입니다!!");
							}
							else if(std.getAvg()<90 && std.getAvg() >= 80) {
								System.out.println("B등급 입니다!!");
							}
							else if(std.getAvg()<80 && std.getAvg() >= 70) {
								System.out.println("C등급 입니다!!");
							}
							else if(std.getAvg()<70 && std.getAvg() >= 60) {
								System.out.println("D등급 입니다!!");
							}
							else {
								System.out.println("F등급 입니다!!");
							}
							
						}break;
					}
					else if(num1 ==2) {
						Iterator<Students> iter = student.iterator();
						System.out.println("몇반을 출력하시겠습니까?");
						int cnum = sc.nextInt();
						while(iter.hasNext()) {
							Students std = iter.next();
							if(std.getCla() == cnum) {
								std.dp();
								if(std.getAvg() >= 90) {
									System.out.println("A등급 입니다!!");
								}
								else if(std.getAvg()<90 && std.getAvg() >= 80) {
									System.out.println("B등급 입니다!!");
								}
								else if(std.getAvg()<80 && std.getAvg() >= 70) {
									System.out.println("C등급 입니다!!");
								}
								else if(std.getAvg()<70 && std.getAvg() >= 60) {
									System.out.println("D등급 입니다!!");
								}
								else {
									System.out.println("F"
											+ "등급 입니다!!");
								}
							}
						}break;
					}
					else if(num1 ==3) {
						Iterator<Students> iter = student.iterator();
						System.out.println("학번을 입력해주세요! ");
						int cnnum = sc.nextInt();
						while(iter.hasNext()) {
							Students std = iter.next();
							if(std.getClassnum() == cnnum) {
								std.dp();
								if(std.getAvg() >= 90) {
									System.out.println("A등급 입니다!!");
								}
								else if(std.getAvg()<90 && std.getAvg() >= 80) {
									System.out.println("B등급 입니다!!");
								}
								else if(std.getAvg()<80 && std.getAvg() >= 70) {
									System.out.println("C등급 입니다!!");
								}
								else if(std.getAvg()<70 && std.getAvg() >= 60) {
									System.out.println("D등급 입니다!!");
								}
								else {
									System.out.println("F등급 입니다!!");
								}
							}
						}break;
					}
				case 3:
					System.out.println("1. 국어  | 2. 수학  | 3. 영어  | 4. 총점");
					int snum = sc.nextInt();
					if(snum == 1) {
						TreeSet<Students> student1 = new TreeSet<Students>(new KorComparator());
						student1.addAll(student);
						Iterator<Students> iter = student1.iterator();
						System.out.print("몇점 이상으로 출력할까요? :  ");
						int ssnum = sc.nextInt();
						while(iter.hasNext()) {
							Students std = iter.next();
							if(ssnum < std.getKor()) {
								System.out.println("국어 순 오름차순");
								std.dp();
							}
							}break;
						}
					
					else if(snum == 2) {
						System.out.println("수학 순 오름차순");
						TreeSet<Students> student1 = new TreeSet<Students>(new MathComparator());
						student1.addAll(student);
						Iterator<Students> iter = student1.iterator();
						System.out.print("몇점 이상으로 출력할까요? :  ");
						int ssnum = sc.nextInt();
						while(iter.hasNext()) {
							Students std = iter.next();
							if(ssnum < std.getKor()) {
								System.out.println("수학 순 오름차순");
								std.dp();
							}
							}break;
						}
					
					else if(snum == 3) {
						System.out.println("영어 순 오름차순");
						TreeSet<Students> student1 = new TreeSet<Students>(new EngComparator());
						student1.addAll(student);
						Iterator<Students> iter = student1.iterator();
						System.out.print("몇점 이상으로 출력할까요? :  ");
						int ssnum = sc.nextInt();
						while(iter.hasNext()) {
							Students std = iter.next();
							if(ssnum < std.getEng()) {
								System.out.println("영어 순 오름차순");
								std.dp();
							}
							}break;
						}
					
					else if(snum == 4) {
						System.out.println("총점 순 오름차순");
						TreeSet<Students> student1 = new TreeSet<Students>(new TotalComparator());
						student1.addAll(student);
						Iterator<Students> iter = student1.iterator();
						System.out.print("몇점 이상으로 출력할까요? :  ");
						int ssnum = sc.nextInt();
						while(iter.hasNext()) {
							Students std = iter.next();
							if(ssnum < std.getTotal()) {
								System.out.println("총점 순 오름차순");
								std.dp();
							}
							}break;
						}
				case 5:
					System.out.println("삭제할 학번을 입력해주세요! ");
					int dnum = sc.nextInt();
					Iterator<Students> iter = student.iterator();
					while(iter.hasNext()) {
						Students std = iter.next();
						if(std.getClassnum() == dnum) {
							student.remove(std);
						}
					}break;
					
				case 6:
					System.exit(-1);
					
				case 4:
					System.out.println("수정할 학번을 입력해주새요! ");
					int cnum = sc.nextInt();
					Iterator<Students> iter1 = student.iterator();
					while(iter1.hasNext()) {
						Students std = iter1.next();
						if(std.getClassnum() == cnum) {
							student.remove(std);
							System.out.print("수정할 반을 입력하세요");
							int cla1 = sc.nextInt();
							System.out.println();

							System.out.print("수정할 이름을 입력하세요");
							String name1 = sc.next();
							System.out.println();

							System.out.print("수정할 학번을 입력하세요(*중복이 허용되지 않습니다*)");
							int classnum1 = sc.nextInt();
							System.out.println();

							System.out.print("수정할 국어성적을 입력하세요");
							int kor1 = sc.nextInt();
							System.out.println();

							System.out.print("수정할 수학성적을 입력하세요");
							int math1 = sc.nextInt();
							System.out.println();

							System.out.print("수정할 영어성적을 입력하세요");
							int eng1 = sc.nextInt();
							System.out.println();
							
							System.out.println("수정이 완료 되었습니다!!!");

							student.add(new Students(name1, classnum1, cla1, kor1, eng1, math1));
						}
					}break;
			}	
			}
			else {
				Iterator<Students> iter = student.iterator();
				while(iter.hasNext()) {
					Students std = iter.next();
					if(std.getClassnum() == pwd) {
						std.dp();
						if(std.getAvg() >= 90) {
							System.out.println("A등급 입니다!!");
						}
						else if(std.getAvg()<90 && std.getAvg() >= 80) {
							System.out.println("B등급 입니다!!");
						}
						else if(std.getAvg()<80 && std.getAvg() >= 70) {
							System.out.println("C등급 입니다!!");
						}
						else if(std.getAvg()<70 && std.getAvg() >= 60) {
							System.out.println("D등급 입니다!!");
						}
						else {
							System.out.println("F등급 입니다!!");
						}
					}break;
				}
			}
		}
	}

	
}
				

										