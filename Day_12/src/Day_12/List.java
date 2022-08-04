package Day_12;

import java.util.*;

public class List {
	public static void main(String[] args) {
		String[] array = new String[] {"가", "나", "다", "라", "마", "바", "사"};
		System.out.println(array.length);
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);
		
		ArrayList<String> alist = new ArrayList<>();
		System.out.println(alist.size());
		alist.add("가");
		alist.add("나");
		
		
		
		alist.add("다");
		alist.add("라");
		alist.add("마");
		alist.add("바");
		alist.add("사");
		System.out.println(alist.size());
		alist.remove("다");
		alist.remove("바");
		System.out.println(alist.size());
		System.out.println(alist);
	}
}
