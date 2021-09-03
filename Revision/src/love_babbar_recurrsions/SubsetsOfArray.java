package love_babbar_recurrsions;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetsOfArray {
	
	private static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	private static void printSubset(int[] arr, ArrayList<Integer> outputarr, int sI) {
		if(sI>=arr.length) {
			System.out.println(outputarr);
			return;
		}
		printSubset(arr, outputarr, sI+1);

		ArrayList<Integer> ansout = new ArrayList<Integer>();
		for(Integer i:outputarr) {
			ansout.add(i);
		}
		ansout.add(arr[sI]);
		printSubset(arr, ansout, sI+1);
		
	}
	public static void printSubSet(int[] arr){
		ArrayList<Integer> outputarr = new ArrayList<Integer>();
		printSubset(arr,outputarr, 0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		int[] arr =  new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		printSubSet(arr);

	}

}
