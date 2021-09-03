import java.util.Scanner;
public class MergeSort {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	////////////////////////////
	public static void mergeArrays(int[] input, int sI, int eI) {
		int mid = (sI+eI)/2;
		int i=sI;
		int j=mid+1;
		int k=0;
		int[] arr = new int[eI-sI+1];
		while(i<=mid && j<=eI) {
			if(input[i]<input[j]) {
				arr[k]=input[i];
				k++;
				i++;
			}
			else {
				arr[k]=input[j];
				k++;
				j++;
			}
		}
		while(i<=mid) {
			arr[k]=input[i];
			i++;
			k++;
		}
		while(j<=eI) {
			arr[k]=input[j];
			j++;
			k++;
		}
		for(int l=0;l<arr.length;l++) {
			input[sI+l]=arr[l];
		}
		
		
	}
	
	public static void mergeSort(int[] input,int sI, int eI){
		// Write your code here
		int mid = (sI+eI)/2;
		mergeSort(input, sI, mid);
		mergeSort(input, mid+1, eI);
		mergeArrays(input, sI, eI);
	}
	
	public static void mergeSort(int[] input){
		// Write your code here
		mergeSort(input, 0, input.length-1);
		
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		MergeSort.mergeSort(input);
		printArray(input);

	}

}
