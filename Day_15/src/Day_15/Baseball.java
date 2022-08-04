package Day_15;

import java.util.*;

public class Baseball {
	public static ArrayList<Integer> start(ArrayList<Integer> arr) {
		int strike =0;
		int ball=0;
		if(arr.get(0) ==0 && arr.contains(0)) {
			strike ++;
		}
		else if(arr.get(0) !=0 && arr.contains(0)) {
			ball ++;
		}
		if(arr.get(1) ==1 && arr.contains(1)) {
			strike ++;
		}
		else if(arr.get(1) !=1 && arr.contains(1)) {
			ball ++;
		}
		if(arr.get(2) ==2 && arr.contains(2)) {
			strike ++;
		}
		else if(arr.get(2) !=2 && arr.contains(2)) {
			ball ++;
		}
		ArrayList<Integer> play = new ArrayList<Integer>();
		play.add(strike);
		play.add(ball);
		return play;
	}
	public static ArrayList<Integer> two(ArrayList<Integer> arr) {
		int strike =0;
		int ball=0;
		if(arr.get(0) ==0 && arr.contains(0)) {
			strike ++;
		}
		else if(arr.get(0) !=0 && arr.contains(0)) {
			ball ++;
		}
		if(arr.get(1) ==1 && arr.contains(1)) {
			strike ++;
		}
		else if(arr.get(1) !=1 && arr.contains(1)) {
			ball ++;
		}
		if(arr.get(2) ==2 && arr.contains(2)) {
			strike ++;
		}
		else if(arr.get(2) !=2 && arr.contains(2)) {
			ball ++;
		}
		ArrayList<Integer> play = new ArrayList<Integer>();
		play.add(strike);
		play.add(ball);
		return play;
	}
	
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static ArrayList<Integer> user = new ArrayList<Integer>();
	public static void main(String[] args) {
		ArrayList<Integer> fnum = new ArrayList<Integer>();
		
		ArrayList<Integer> snum = new ArrayList<Integer>();
		ArrayList<Integer> tnum = new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i=0; i<10; i++) {
			fnum.add(i);
			snum.add(i);
			tnum.add(i);
		}
		int strike =0;
		int ball=0;
		int cout=0;
		
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		int num3 = rand.nextInt(10);
		while(num1 == num2 || num1 == num3 || num2 == num3) {
			if(num1 == num2) {
				num2 = rand.nextInt(10);
			}
			else if(num2 == num3) {
				num3 =rand.nextInt(10);
			}
			else if(num1 == num3) {
				num1 =rand.nextInt(10);
			}
		}
		System.out.print(num1);
		System.out.print(num2);
		System.out.println(num3);
		arr.add(num1);
		arr.add(num2);
		arr.add(num3);
		
		start(arr);
		
		while(true) {
			if(start(arr).get(0) == 0 && start(arr).get(1) ==0) {	// 0 strike, 0 ball일때
				for(int i=0; i<3; i++) {
					fnum.remove(i);
					snum.remove(i);
					tnum.remove(i);
					user.add(i+3);
				}
				cout ++;
				two(user);
			}
			else if(start(arr).get(0) == 1 && start(arr).get(1) ==0) {	// 1 strike, 0 ball일때 
				cout ++;
			}
			else if(start(arr).get(0) == 0 && start(arr).get(1) ==1) {	// 0 strike, 1 ball일때 
				cout ++;
			}
			else if(start(arr).get(0) == 1 && start(arr).get(1) ==1) {	// 1 strike, 1 ball일때 
				cout ++;
			}
			else if(start(arr).get(0) == 1 && start(arr).get(1) ==2) {	// 1 strike, 2 ball일때 
				cout ++;
			}
			else if(start(arr).get(0) == 2 && start(arr).get(1) ==0) {	// 2 strike, 0 ball일때 
				cout ++;
			}
			else if(start(arr).get(0) == 2 && start(arr).get(1) ==1) {	// 2 strike, 1 ball일때 
				cout ++;
			}
			else if(start(arr).get(0) == 0 && start(arr).get(1) ==3) {	// 0 strike, 3 ball일때 
				cout ++;
			}
			else if(start(arr).get(0) == 3 && start(arr).get(1) ==0) {	// 3 strike, 0 ball일때 
				cout ++;
				System.out.println("3 strike입니다!!!");
				break;
			}
		}
	}
}
