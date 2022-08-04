package Day_18;
import java.util.Stack;

public class DFS {
	
	//지도
	public static int[][] map = 
			{{0,0,0,0,1,0,0,1,1,1,1,1,1,0,0,0},
			 {0,1,1,0,0,0,0,0,0,0,0,0,1,0,0,0},
			 {0,1,1,0,0,1,0,0,0,0,0,0,1,0,1,0},
			 {0,1,0,0,0,1,0,0,0,0,1,0,1,0,1,0},
			 {0,0,0,0,0,1,0,0,0,0,1,0,1,0,1,0},
			 {0,0,0,0,0,1,0,0,0,0,1,0,1,0,1,0},
			 {0,1,0,1,0,1,0,0,0,0,1,0,1,0,1,0},
			 {0,1,1,1,1,1,0,0,0,0,1,0,1,0,1,0},
			 {0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0},
			 {0,0,0,0,1,1,0,0,0,0,1,0,1,0,1,0},
			 {0,1,0,0,0,0,0,0,0,0,1,0,1,0,1,0},
			 {0,1,0,1,1,1,1,1,1,1,1,0,1,0,0,0},
			 {0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
			 {0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1},
			 {0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,0},
			 {0,1,0,1,0,0,0,1,0,1,0,0,0,0,0,0}};
			
	public static int size = map.length;
	
	//들린 곳 체크
	public static boolean[][] visit = new boolean[size][size];
	
	//인덱스를 저장하는 스택
	public static Stack<Index> ms = new Stack<>();
	
	//깊이우선탐색
	public static void dfs(int x, int y) { //시작 행, 열
		Index curr = new Index(x,y);
		visit[x][y] = true;
		
		while(true) {
			if(curr.getX()==size-1 && curr.getY()==size-1) { //맨 우측 하단에 도착하면
				System.out.println("미로탈출 완료!");
				break;
			} else {
				findWay(curr); //현재 위치를 기준으로 길 탐색
				Index temp = ms.pop();
				System.out.println(""+temp.getX()+" "+temp.getY()+"로 이동");
				curr.setX(temp.getX()); //현재 위치를 pop으로 변경
				curr.setY(temp.getY());
				visit[curr.getX()][curr.getY()] = true; // 이동했으니 true
			}
		}
	}
	
	// 상하좌우 탐색 메서드
	public static void findWay(Index curr) {
		// 위 탐색
		if (curr.getX() > 0) {
			if (map[curr.getX()-1][curr.getY()] != 1 && !visit[curr.getX()-1][curr.getY()]) { // 벽이 아니고 들린 적 없으면
				ms.push(new Index(curr.getX() - 1, curr.getY()));
			}
		}
		
		// 왼쪽 탐색
		if (curr.getY() > 0) {
			if (map[curr.getX()][curr.getY()-1] != 1 && !visit[curr.getX()][curr.getY() - 1]) { // 벽이 아니고 들린 적 없으면
				ms.push(new Index(curr.getX(), curr.getY()));
			}
		}
		
		// 오른쪽 탐색
		if (curr.getY() < size-1) {
			if (map[curr.getX()][curr.getY()+1] != 1 && !visit[curr.getX()][curr.getY()+1]) { // 벽이 아니고 들린 적 없으면
				ms.push(new Index(curr.getX(), curr.getY() + 1));
			}
		}

		// 아래 탐색
		if (curr.getX() < size-1) {
			if (map[curr.getX()+1][curr.getY()] != 1 && !visit[curr.getX() + 1][curr.getY()]) { // 벽이 아니고 들린 적 없으면
				ms.push(new Index(curr.getX() + 1, curr.getY()));
			}
		}
	}
	
	public static void main(String[] args) {
		// 현재는 map의 맨 좌촉 상단에서 맨 우측 하단에 도착하게 되어있다.
		dfs(0,0);
		
	}
}

//인덱스를 저장하는 클래스
class Index {
	private int x;
	private int y;
	
	public Index() {
	}
	
	public Index(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}