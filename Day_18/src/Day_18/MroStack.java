package Day_18;
import java.util.ArrayList;
import java.util.Arrays;

public class MroStack {
    static int[][] map = {{0,0,0,-1,0,0,0,-1}, 
    					 {0,-1,0,-1,0,-1,0,-1}, 
    					 {0,-1,0,-1,-1,-1,0,-1}, 
    					 {0,0,0,0,0,0,0,-1}, 
    					 {-1,-1,-1,0,-1,-1,-1,-1}, 
    					 {0,0,-1,0,-1,0,0,-1}, 
    					 {-1,0,0,0,-1,0,-1,-1}, 
    					 {-1,-1,-1,0,0,0,0,0}};
    static String[] stack = new String [5];
    
    static ArrayList<String> log = new ArrayList<String>();
    static int cnt;
    static String start = "0,0";
    static String exit = "7,7";
    static String temp = "";

    public static void main(String[] args) throws OverflowIntStackException {
    	
        push(start);
        log.add(start);
        while(!exit.equals(temp)){
            search(pop());
            System.out.print("현재위치 : " + temp + " ");
            System.out.print("stack : " + Arrays.toString(stack) + "\n");
            System.out.println(log);
        }
    }
    static void search(String str) throws OverflowIntStackException {
        String [] temp = str.split(",");
        int x = Integer.parseInt(temp[0]);
        int y = Integer.parseInt(temp[1]);
        for(int i = x-1;i<=x+1;i+=2){
            valid(i,y);
        }
        for(int j = y-1;j<=y+1;j+=2){
            valid(x,j);
        }
    }
    static void valid(int x, int y) throws OverflowIntStackException {
        String tmp = x + "," + y;
        if(x <0 || y <0) { }
        else if(x > 7 || y > 7) { }
        else if (map[x][y] == -1){ }
        else if (Arrays.asList(stack).contains(tmp)){ }
        else{
            if(!log.contains(tmp)) {
                temp = tmp;
                push(tmp);
            }
        }

    }
    
    
    static void push(String str) throws OverflowIntStackException{
        if(cnt >= stack.length-1)
            throw new OverflowIntStackException();
        stack[cnt++] = str;
    }
    static String pop() throws OverflowIntStackException{
        if(cnt <= 0)
            throw new OverflowIntStackException();
        String n = stack[cnt-1];
        log.add(n);
        stack[cnt--] = null;
        return stack[cnt];
    }
}