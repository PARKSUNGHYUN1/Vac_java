import java.util.Scanner;
public class Day2_sub {
	public static void main(String[] args) {
		
// 1번: 2중 for문을 이용하여 가로 j개에 별을찍은뒤 i만큼 세로로도 별을 찍었습니다.
		System.out.println("-----1-----------------------");
		for(int i=1; i<4;i++) {
			for(int j=1; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		System.out.println("-----2-----------------------");
		
// 2번: 2중 for문을 이용하여 j를 x축 i를 y축이라 생각했을때 x의 값이 y의 값보다 작거나 같은 같만 별을 찍었습니다.
		for(int i=1; i<4; i++) {
			for(int j=1; j<4; j++) {
				if(j<=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("-----3-----------------------");
		
/* 3번: 2중 for문을 이용하여 j를 x축 i를 y축이라고 생각했을때 y축 값은 1씩 줄고 x축 값은 1씩 늘어 날때 x축 값이 y축보다 크거나 값은 값만
 		별을 찍어 두었습니다. */		
		for(int i=4; i>1; i--) {
			for(int j=1; j<5; j++) {
				if(j>=i) {
					System.out.print("*");
			}
				else {
					System.out.print(" ");
				}
		}
			System.out.println();
	}
	System.out.println("-----4-----------------------");
		
/* 4번: 처음 공백을 의미하는 bl변수에 첫줄 공백값을 넣어두고 i는 별의 갯수로 생각하고 공백과 별을 repeat을 
	이용하여 찍고 공백을 1씩 줄여가고 별은 2씩 늘려갔습니다.*/
		int bl = 2;
		
		for(int i=1; i<=5; i+=2) {
			System.out.print(" ".repeat(bl));
			System.out.print("*".repeat(i));
			System.out.println();
			bl--;
			
		}
		System.out.println("-----5------------------------");
		
/* 5번: 마름모를 위아래 두개의 삼각형으로 분할하여 생각한뒤 4번과 마찬가지로 공백값 j를 설정하고 i를 별로 생각하여 윗 삼각형을 작성
  	 	아랫 삼각형은 a를 공백 b를 별로 생각하여 작성하였습니다.*/
		int j=2;
		
		for(int i=1; i<=5; i+=2) {
			System.out.print(" ".repeat(j));
			System.out.print("*".repeat(i));
			System.out.println();
			j--;
			}
		
		int a = 1;
		for(int b=3; b>0; b-=2) {
			System.out.print(" ".repeat(a));
			System.out.print("*".repeat(b));
			System.out.println();
			a++;
		}
		System.out.println("-----6------------------------");
		
/* 6번: 5번처럼 다이아몬드를 분할하여 생각하였다. 먼저 다이아몬드의 중앙값을 star로 받아와 첫번째 공백과 중앙값 사이 관계가 /2라는 사실을 알고 
 * 공백에 star/2를 해준뒤 윗삼각형 별은 i 공백은 blank로 설정한뒤 윗삼각형을 작성하였고 아랫 삼각형도 같은 원리로 공백과 별을 설정해둔뒤 
 * for문 조건부분에 마지막 별하나가 찍히기 위해 star2>=i-s처럼 s변수를 하나 만든뒤 빼주었다.*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다이아몬드의 중앙값을 입력하세요!!");
		int star =sc.nextInt();
		int blank = star/2;
		
		for(int i=1; i<=star; i+=2) {
			System.out.print(" ".repeat(blank));
			System.out.print("*".repeat(i));
			System.out.println();
			blank--;
		}
		int star2 = star-2;
		int s= 1;
		for(int i=1; star2>=i-s; i+=1) {
			System.out.print(" ".repeat(i));
			System.out.print("*".repeat(star2));
			System.out.println();
			star2-=2;
			s+=1;
		}
	}
}


