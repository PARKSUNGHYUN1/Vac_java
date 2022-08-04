package Day_20;

import java.util.Arrays;
import java.util.Comparator;

class A{
	public void Avg(int...value) {
		int a =0;
		for(int i=0; i<value.length; i++) {
			a += value[i];
		}
		System.out.println((double)a/value.length);
	}
}

class Ar{
	int arraySum(int[] array) {
		int sum=0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
}

public class List {
	public static void main(String[] args) {
		A a = new A();
		Ar aa = new Ar();
		a.Avg(1,2,3,5,6);
		int []arr ;
		System.out.println(aa.arraySum(new int[] {1,2,3}));
	}	
}