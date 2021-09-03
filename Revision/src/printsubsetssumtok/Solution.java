package printsubsetssumtok;

import java.util.Scanner;

public class Solution {
	
	public static void printSubsetsSumTok(int sI, int input[], int outputSoFar[], int l) {
		if(sI>=input.length) {
			int sum=0;
			for(int i=0;i<outputSoFar.length;i++) {
				sum=sum+outputSoFar[i];
			}
			if(sum==l) {
				for(int i=0;i<outputSoFar.length;i++) {
					System.out.print(outputSoFar[i] + " ");
				}
				System.out.println();
			}
			return;
		}
		
		int newOutput[] = new int[outputSoFar.length + 1];
		int k=0;
		for(int i=0;i<outputSoFar.length;i++) {
			newOutput[k] = outputSoFar[i];
			k++;
		}
		
		newOutput[k] = input[sI];
		printSubsetsSumTok(sI+1, input, newOutput,l);
		
		printSubsetsSumTok(sI+1, input, outputSoFar,l);
	}
	
	public static void printSubsetsSumTok(int[] input, int k) {
		int outputSoFar[] = new int[0];
		printSubsetsSumTok(0, input, outputSoFar, k);
		
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter array size: ");
		int n = sc.nextInt();
		System.out.println("enter elements: ");
		int input[] = new int[n];
		for(int i=0;i<input.length;i++) {
			input[i] = sc.nextInt();
		} 
		System.out.println("enter k: ");
		int k = sc.nextInt();
		printSubsetsSumTok(input, k);

	}

}
