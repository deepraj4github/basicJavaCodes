package love_babbar_recurrsions;

import java.util.Scanner;

public class SortedOrUnsorted {
	
	public static boolean isSorted(int[] arr, int sI,int eI) {
		if(sI>eI) {
			return true;
		}
		boolean b=true;
		if(arr[sI]>=arr[sI-1]) {
			b = isSorted(arr, sI+1, eI);
		}
		else {
			return false;
		}
		return b;
		
	}
	
	public static boolean isSorted(int[] arr) {
		boolean b = isSorted(arr, 1,arr.length-1);
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		int[] arr =  new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(isSorted(arr));

	}

}
