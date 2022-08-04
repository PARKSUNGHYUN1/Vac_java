package Day_13;

import java.util.Map.Entry;
import java.security.KeyStore.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Map {
	public static void main(String[] args) {
		int keyv;
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Students> student = new HashMap<Integer, Students>();

		while(true) {
			System.out.print("학번을 입력하세요:  ");
			int pwd = sc.nextInt();
			System.out.println("--------------------------------------------------------------------");
			if(pwd == 123) {
				System.out.println("1. 학생입력 |  2. 학생출력 |  3. 학생검색(성적별) |  4. 학생삭제  |  5. 종료");
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
					
					System.out.print("키 값을 입력하세요");
					keyv = sc.nextInt();
					System.out.println();

					student.put(keyv, new Students(name, classnum,cla, kor, eng, math));
					break;
					
				case 2:
					System.out.println("1. 전체출력  | 2. 반별출력  | 3. 개별검색");
					int num1 = sc.nextInt();
					if(num1 == 1) {
						for(Integer key : student.keySet()) {
							student.get(key).dp();
						}break;
						}

					else if(num1 == 2) {
						System.out.println("몇반을 출력하시겠습니까??");
						int cnum = sc.nextInt();
						for(Integer key : student.keySet()) {
							if(student.get(key).getCla() == cnum) {
								student.get(key).dp();
							}
						}break;
					}
					else if(num1 ==3) {
						System.out.println("학번을 입력해주세요! ");
						int cnnum = sc.nextInt();
						for(Integer key : student.keySet()) {
							if(student.get(key).getClassnum() == cnnum) {
								student.get(key).dp();
							}
						}break;
					}
				case 3:
					System.out.println("1. 국어  | 2. 수학  | 3. 영어  | 4. 총점");
					int snum = sc.nextInt();
					if(snum == 1) {
						System.out.println("국어 순 오름차순");
						List<Entry<Integer, Students>> kor_list = new ArrayList<Entry<Integer, Students>>(student.entrySet());
						
						Collections.sort(kor_list, new Comparator<Entry<Integer, Students>>() {
							// compare로 값을 비교
							
							
							public int compare(Entry<Integer, Students> obj1, Entry<Integer, Students> obj2) {
								
								Students s1 = obj1.getValue();
								Students s2 = obj2.getValue();
								
								if (s1.getKor() < s2.getKor()) {
						            return 1;
						        } else if (s1.getKor() > s2.getKor()) {
						            return -1;
						        }
						        return 0;
						    }
							}
						);
						for(Entry<Integer, Students> entry : kor_list) {
							entry.getValue().dp();
						}}
					
					else if(snum == 2) {
					System.out.println("수학 순 오름차순");
					List<Entry<Integer, Students>> math_list = new ArrayList<Entry<Integer, Students>>(student.entrySet());
					
					Collections.sort(math_list, new Comparator<Entry<Integer, Students>>() {
						// compare로 값을 비교
						
						
						public int compare(Entry<Integer, Students> obj1, Entry<Integer, Students> obj2) {
							
							Students s1 = obj1.getValue();
							Students s2 = obj2.getValue();
							
							if (s1.getMath() < s2.getMath()) {
					            return 1;
					        } else if (s1.getMath() > s2.getMath()) {
					            return -1;
					        }
					        return 0;
					    }
						}
					);
					for(Entry<Integer, Students> entry : math_list) {
						entry.getValue().dp();
					}break;}
					
					else if(snum == 3) {
						System.out.println("영어 순 오름차순");
						List<Entry<Integer, Students>> eng_list = new ArrayList<Entry<Integer, Students>>(student.entrySet());
						
						Collections.sort(eng_list, new Comparator<Entry<Integer, Students>>() {
							// compare로 값을 비교
							
							
							public int compare(Entry<Integer, Students> obj1, Entry<Integer, Students> obj2) {
								
								Students s1 = obj1.getValue();
								Students s2 = obj2.getValue();
								
								if (s1.getEng() < s2.getEng()) {
						            return 1;
						        } else if (s1.getEng() > s2.getEng()) {
						            return -1;
						        }
						        return 0;
						    }
							}
						);
						for(Entry<Integer, Students> entry : eng_list) {
							entry.getValue().dp();
						}}
				case 4:
					System.out.println("삭제할 학번을 입력해주세요! ");
					int dnum = sc.nextInt();
					for(Integer key : student.keySet()) {
						if(student.get(key).getClassnum() == dnum) {
							student.remove(key);
						}
					}break;
					
					
				case 5:
					System.exit(-1);
			}	
			}
			else {
				for(Integer key : student.keySet()) {
					if(pwd == student.get(key).getClassnum()) {
						student.get(key).dp();
					}break;
					
				}
				}
		}
		}
}

