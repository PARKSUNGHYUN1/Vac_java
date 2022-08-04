package Day_11;

import java.util.Collections;

public class Sort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//버블정렬
	static void bubbleSort(int[] a) {
		int n = a.length;
		int change = 0; //교환 횟수
		int compare = 0; //비교 횟수
		
		for (int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				if(a[j-1]>a[j]) {
					swap(a, j-1, j);
					change++;
				}
				compare++;
			}
		}
		System.out.printf("비교:%d 교환:%d \n",compare,change);
	}
	
	//삽입정렬
	static void insertionSort(int[] a) {
		int n = a.length;
		int cnt = 0; //교환 횟수
		int compare = 0; //비교 횟수
		
		for (int i = 1; i < n; i++) {
			int j;
			int temp = a[i];
			for (j = i; j > 0 && a[j - 1] > temp; j--) {
				a[j] = a[j - 1];
				compare++;
			}
			a[j] = temp;
			cnt++;
		}
		System.out.printf("비교:%d 교환:%d \n",compare,cnt);
	}
		
	//선택정렬
	public static void selectionSort(int[] a) {
		int n = a.length;
		int cnt = 0; //교환 횟수
		int compare = 0; //비교 횟수
		
		for(int i=0; i<n-1; i++) {
			int minidx = i;
			for(int j=i+1; j<n; j++) {
				if(a[j]<a[minidx]) {
					minidx=j;
					compare++;
				}
			}
			swap(a, i, minidx);
			cnt++;
		}
		System.out.printf("비교:%d 교환:%d \n",compare,cnt);
	}
	
	//셸 정렬
	public static void shellSort(int[] a) {

		int n = a.length;
		for(int h = n/2; h>0; h/=2) { //4,2,1
			for(int i = h; i<n; i++) { 
				int j;
				int temp = a[i];
				for(j=i-h;j>= 0 && a[j]>temp; j-=h) {
					a[j+h] = a[j];
				}
				a[j+h] = temp;
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		Sort a = new Sort();
		System.out.println("arr원본");
		int[] arr = {6,4,3,7,1,9,8};
		for(int i : arr) {System.out.print(i+" ");}
		System.out.println("\n==========");
		
		System.out.println("\n버블정렬");
		bubbleSort(arr);
		for(int i : arr) {System.out.print(i+" ");}
		System.out.println();
		
		System.out.println("\n선택정렬");
		int[] arr0 = {6,4,3,7,1,9,8};
		selectionSort(arr0);
		for(int i : arr0) {System.out.print(i+" ");}
		System.out.println();
		
		System.out.println("\n삽입정렬");
		int[] arr1 = {6,4,3,7,1,9,8};
		insertionSort(arr1);
		for(int i : arr1) {System.out.print(i+" ");}
		System.out.println();
		
		System.out.println("\n셸정렬");
		int[] arr2 = {6,4,3,7,1,9,8};
		shellSort(arr2);
		for(int i : arr2) {System.out.print(i+" ");}
		System.out.println();
	}
}