package returnsubsetofanarray;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	private static ArrayList<ArrayList<Integer>> subsets(ArrayList<ArrayList<Integer>> subset, int input[], ArrayList<Integer> output,int sI){
		// Base Condition
				if (sI == input.length) {
					subset.add(output);
					return subset;
				}
				
				// Not Including Value which is at Index
				subsets(subset, input, new ArrayList<>(output), sI + 1);

				// Including Value which is at Index
				output.add(input[sI]);
				subsets(subset, input, new ArrayList<>(output), sI + 1);
				return subset;
		
	}
	
	public static ArrayList<ArrayList<Integer>> arraysubsets(int input[]){
		ArrayList<ArrayList<Integer>> subset = new ArrayList<>();
		ArrayList<Integer> output = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = subsets(subset,input,output, 0);
		return result;
	}
	
	public static int[][] subsets(int input[]){
		ArrayList<ArrayList<Integer>> result = arraysubsets(input);
		int[][] array = new int[result.size()][];
		for (int i = 0; i < result.size(); i++) {
		    ArrayList<Integer> row = result.get(i);
		    // Perform equivalent `toArray` operation
		    int[] copy = new int[row.size()];
		    for (int j = 0; j < row.size(); j++) {
		        // Manually loop and set individually
		        copy[j] = row.get(j);
		    }

		    array[i] = copy;
		}
		return array;
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
		sc.close();
		
		int[][] result = subsets(input);
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j] +" ");
			}
			System.out.println();
		}

	}

}
