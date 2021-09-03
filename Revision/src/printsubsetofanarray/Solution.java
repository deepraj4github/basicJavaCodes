package printsubsetofanarray;
import java.util.Scanner;
public class Solution {
	
	public static void printSubsets(int sI, int input[], int outputSoFar[]) {
		if(sI>=input.length) {
			for(int i=0;i<outputSoFar.length;i++) {
				System.out.print(outputSoFar[i] + " ");
			}
			System.out.println();
			return;
		}
		
		int newOutput[] = new int[outputSoFar.length + 1];
		int k=0;
		for(int i=0;i<outputSoFar.length;i++) {
			newOutput[k] = outputSoFar[i];
			k++;
		}
		
		newOutput[k] = input[sI];
		printSubsets(sI+1, input, newOutput);
		
		printSubsets(sI+1, input, outputSoFar);
	}
	
	public static void printSubsets(int input[]) {
		int outputSoFar[] = new int[0];
		printSubsets(0, input, outputSoFar);
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
		printSubsets(input);
	}
	

}
