package Day_18;

import java.util.LinkedList;
import java.util.Queue;

public class BfsQueue {
	public static int[][] map = 
		{{0,0,0,-1,0,0,0,-1}, 
		 {0,-1,0,-1,0,-1,0,-1}, 
		 {0,-1,0,-1,-1,-1,0,-1}, 
		 {0,0,0,0,0,0,0,-1}, 
		 {-1,-1,-1,0,-1,-1,-1,-1}, 
		 {0,0,-1,0,-1,0,0,-1}, 
		 {-1,0,0,0,-1,0,-1,-1}, 
		 {-1,-1,-1,0,0,0,0,0}};
	public static void main(String[] args) {
		// 7,7을 찾을때 까지 너비우선탐색
		bfs(0,0);
	}
		
	public static int size = map.length;
	
	//들린 곳 체크
	public static boolean[][] visit = new boolean[size][size];
	
	//인덱스를 저장하는 큐
	public static Queue<Index> mq = new LinkedList<>();
	
	//너비우선탐색
	public static void bfs(int x, int y) { //시작 행, 열
		Index curr = new Index(x,y);
		map[x][y] = 1; // 첫 위치 visist설정
		
		while(true) {
			if(curr.getX() == size - 1 && curr.getY() == size - 1) { // 골인지점 설정
				System.out.println("미로탈출 완료!");
				break;
			} else {
				findWay(curr); // 현재 위치를 기준으로 길 탐색
				Index temp = mq.poll();
				visit[temp.getX()][temp.getY()] = true; // 이동했으니 true
				System.out.println("" + temp.getX() + " " + temp.getY() + "로 이동");
				curr.setX(temp.getX()); // 현재 위치를 poll으로 변경
				curr.setY(temp.getY());
			}
		}
	}
	
	
	// 현재위치에서 탐색해주는 메서드
	public static void findWay(Index curr) {
		int x = curr.getX();
		int y = curr.getY();
		
		// 위 탐색
		if (x > 0) {
			if (map[x-1][y] != 1) { //벽이 아니면 추가
				mq.offer(new Index(x - 1, y));
				map[x-1][y] = 1; //추가하고 벽으로 만들어버림
			}
		}
		
		// 왼쪽 탐색
		if (y > 0) {
			if (map[x][y-1] != 1) { 
				mq.offer(new Index(x, y-1));
				map[x][y-1] = 1;
			}
		}
		
		// 오른쪽 탐색
		if (y < size-1) {
			if (map[x][y+1] != 1 && !visit[x][y+1]) { 
				mq.offer(new Index(x, y + 1));
				map[x][y+1] = 1;
			}
		}

		// 아래 탐색
		if (x < size-1) {
			if (map[x+1][y] != 1) { 
				mq.offer(new Index(x + 1, y));
				map[x+1][y] = 1;
			}
		}
	}
}
