package Day_6;
import java.util.Scanner;

public class Students {
	private sub[] stu;

	
	public Students(int num) {
		stu = new sub[num];
		for(int i=0;i<num;i++) {
			stu[i] = new sub();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수: ");
		int stu_num = sc.nextInt();
		Students st = new Students(stu_num);
		
		for(int i=0; i < stu_num; i++) {
			System.out.print("이름 입력: ");
			st.stu[i].setName(sc.next());
			
			System.out.print("국어점수 입력: ");
			st.stu[i].setkor(sc.nextInt());
			
			System.out.print("영어점수 입력: ");
			st.stu[i].seteng(sc.nextInt());
			
			System.out.print("수학점수 입력: ");
			st.stu[i].setmath(sc.nextInt());
		}
		
		for(int i=0; i < st.stu.length; i++) {
			System.out.println("이름: "+ st.stu[i].getName()+" 국어: " +st.stu[i].getkor()+
					" 수학: " +st.stu[i].getmath()+" 영어: " +st.stu[i].geteng()+" 총점: " +st.stu[i].getTotal()
					+ " 평균: " +st.stu[i].getAvg());
		}
		
		
	}

}
