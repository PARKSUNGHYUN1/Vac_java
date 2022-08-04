package Day_18;
import java.util.*;

public class Dfs_Stack {
	
	static int [][] arr = {{00, 10, 99, 99, 99, 50, 99},
						  	{01, 11, 99, 99, 41, 51, 99},
						  	{02, 12, 22, 32, 42, 99, 99},
						  	{03, 99, 99, 99, 43, 53, 99},
						  	{04, 99, 24, 34, 44, 99, 99},
						  	{05, 15, 25, 99, 45, 55, 65},
						  	{06, 16, 26, 99, 46, 56, 66}};
	static Stack<Integer> st = new Stack<Integer>();
	static int[] valX = new int[7];
	static int[] valY = new int[7];
	static boolean[][] log = new boolean[7][7];
	
	public static void DFS(int x, int y) {
		valX[x] = x;
		valY[y] = y;
		log[x][y] = true;
		st.push(arr[x][y]);
		
		while(valX[x] !=6 && valY[y] !=6) {
			System.out.println("현재위치: "+ valX[x]+ ","+ valY[y]);
			st.pop();
			if(arr[x][y] >0 && arr[x+1][y] != 99) {
				x++;
				st.push(arr[x][y]);
				log[x][y] = true;
			}
			else if(arr[x][y] >0 && arr[x][y+1] != 99) {
				y++;
				st.push(arr[x][y]);
				log[x][y] = true;
			}
			else if(arr[x][y] >0 && arr[x-1][y] != 99) {
				y++;
			}
			else if(arr[x][y] >0 && arr[x][y-1] != 99) {
				y++;
			}
			else if(arr[x][y] ==0 && arr[x+1][y] != 99) {
				
			}
			else if(arr[x][y] ==0 && arr[x][y+1] != 99) {
				
			}
			else if(arr[x][y]>0 && arr[x][y])
		}
	}
	
		
	
	
	
	public static void main(String[] args) {
		DFS(0,0);
	}


}