import java.util.Scanner;
public class QuickSort {
	
static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void swap(int[] input,int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
	
	public static int partition(int[] input,int sI, int eI) {
		int pivot = input[sI];
		int count=0;
		for(int i=sI+1;i<=eI;i++){
			if(input[i]<=pivot) {
				count++;
			}
		}
		int pivotPos = sI + count;
		swap(input, sI, pivotPos);
		int i=sI;
		int j=eI;
		while(i<pivotPos && j>pivotPos) {
			if(input[i]<=pivot) {
				i++;
			}
			else if(input[j]>pivot) {
				j--;
			}
			else {
				swap(input, i, j);
				i++;
				j--;
			}
		}
		
		return pivotPos;
	}
	
	public static void quickSort(int[] input,int sI, int eI) {
		if(sI>=eI) {
			return;
		}
		int pivotPos = partition(input, sI, eI);
		quickSort(input, sI, pivotPos-1);
		quickSort(input, pivotPos+1, eI);
		
	}
	
	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length-1);
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		QuickSort.quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

}
