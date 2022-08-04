package Day_14;
import java.util.*;
public class Day_14 {
	
	public static void combination(int[] comarr, int n, int r, int index, int target, int[] arr) { 
		if (r == 0) {
			for(int i=0; i<index; i++) {
				System.out.print(arr[comarr[i]]+ " ");
			}
			System.out.println();
		}else if(target == n) {
			return;
		}else {
			comarr[index] =target;
			combination(comarr, n, r-1, index+1, target+1, arr);
			combination(comarr, n, r, index, target+1, arr);	
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
		int[] roto = new int[7];
		int[] user = new int[6];
		int n = roto.length;
		int[] comarr = new int[n];
		int couttt=1;
		int cout=1;
		
		for(int i=0; i<6; i++) {
			roto[i] = 1+rand.nextInt(45);
			for(int j=0; j<cout; j++) {
				if(roto[j] == roto[cout]) {
					roto[j] = 1+rand.nextInt();
				}
			}cout++;
			}
			
		
		for(int i=6; i<7; i++) {
			roto[i] = 1+rand.nextInt(45);
			for(i=0; i<7; i++) {
				if(roto[6] == roto[i]) {
					roto[6] = 1+rand.nextInt(45);
				}
			}
		}
		while(true) {
			System.out.println("1. 등수별 번호 출력  | 2. 로또 번호 입력");
			int num1 = sc.nextInt();
			switch(num1) {
			case 1:
				System.out.println("1등입니다!");
				for(int i=0; i<6; i++) {
					System.out.print(roto[i]+ " ");
				}
				System.out.println("");
				System.out.println("");
				System.out.println("2등입니다!");
				for(int ii=0; ii<6; ii++) {
					int num = roto[ii];
					roto[ii] = roto[6];
					for(int j=0; j<6; j++) {
						System.out.print(roto[j]+ " ");
					}
					System.out.println("");
					roto[ii] = num;
				}
				System.out.println("");
				System.out.println("3등입니다!");
				for(int i=0; i<5; i++) {
					int num = roto[i]; 
					roto[i] = 0;
					for(int j=0; j<5; j++) {
						System.out.print(roto[j]+" ");
					}
					System.out.println("");
					roto[i] = num;
				}
				System.out.println("");
				System.out.println("4등입니다!");
				combination(comarr, n, 4, 0, 0,roto);
				System.out.println("");
				System.out.println("5등입니다!");
				combination(comarr, n, 3, 0, 0,roto);
				break;
			case 2:
				for(int na=0; na<6; na++) {
					System.out.print("번호를 입력해주세요");
					user[na] = sc.nextInt();
					for(int us=0; us<roto.length-1; us++) {
						if(roto[us]==user[na]) {
							couttt++;
							break;
						}
					}
				}
				System.out.println(couttt);
				for(int aa=0;aa<6;aa++) {
					System.out.println(user[aa]);
				}
				if(couttt == 7) {
					System.out.println("축하합니다 1등입니다!!!");
				}
				else if(couttt == 5) {
					for(int a=0; a<6; a++) {
						if(roto[6] == user[a]) {
							System.out.println("축하합니다 2등입니다!!!");
							couttt =0;
						}
						else {
							System.out.println("축하합니다 3등입니다!!!");
							couttt =0;
						}
					}
				}
				else if(couttt == 4) {
					System.out.println("축하합니다 4등입니다!!!");
					couttt =0;
				}
				else if(couttt == 3) {
					System.out.println("축하합니다 5등입니다!!!");
					couttt =0;
				}
				else {
					System.out.println("꽝 입니다!!!");
					couttt =0;
				}
			}
		}
	}
}
