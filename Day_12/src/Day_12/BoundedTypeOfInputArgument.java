package Day_12;
import java.util.*;


public class BoundedTypeOfInputArgument {
	public static void main(String[] args) {
		Vector<Integer> aList1 = new Vector<Integer>();
		aList1.add(1);
		aList1.add(2);
		aList1.add(3);
		
		System.out.println(aList1.toString());
		
		aList1.add(1, 6);
		System.out.println(aList1.toString());
		
		ArrayList<Integer> aList2 = new ArrayList<Integer>();
		aList2.add(1);
		aList2.add(3);
		System.out.println(aList2.toString());
		
		aList2.addAll(aList1);
		System.out.println(aList2.toString());
		
		aList2.set(1, 9);
		System.out.println(aList2.toString());
	}
}
