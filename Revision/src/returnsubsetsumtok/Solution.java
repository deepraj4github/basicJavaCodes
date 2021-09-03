package returnsubsetsumtok;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	private static ArrayList<ArrayList<Integer>> subsets(ArrayList<ArrayList<Integer>> subset, int input[], ArrayList<Integer> output,int sI, int k){
		// Base Condition
				if (sI == input.length) {
					int sum=0;
					for(Integer i:output) {
						sum=sum+i;
					}
					if(sum==k) {
						subset.add(output);
					}
					
					return subset;
				}
				
				// Not Including Value which is at Index
				
				subsets(subset, input, new ArrayList<>(output), sI + 1,k);

				// Including Value which is at Index
				output.add(input[sI]);
				subsets(subset, input, new ArrayList<>(output), sI + 1,k);
				return subset;
		
	}
	
	public static ArrayList<ArrayList<Integer>> arraysubsets(int input[],int k){
		ArrayList<ArrayList<Integer>> subset = new ArrayList<>();
		ArrayList<Integer> output = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = subsets(subset,input,output, 0,k);
		return result;
	}
	
	public static int[][] subsetsSumK(int input[], int k){
		ArrayList<ArrayList<Integer>> result = arraysubsets(input, k);
		int[][] ans = new int[result.size()][];
		for(int i=0;i<result.size();i++) {
			ans[i] = new int[result.get(i).size()];
			for(int j=0;j<result.get(i).size();j++) {
				ans[i][j] = result.get(i).get(j);
			}
		}
		return ans;
	}
	
//	public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
//	{
//		int input[] = new int[arr.size()];
//		int j=0;
//		for(Integer i: arr) {
//			input[j] =i;
//			j++;
//		}
//        return arraysubsets(input, k);
//    }

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter array size: ");
		int n = sc.nextInt();
		System.out.println("enter elements: ");
		//ArrayList<Integer> input = new ArrayList<Integer>();
		int[] input = new int[n];
		for(int i=0;i<n;i++) {
			input[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		sc.close();
		int[][] result = subsetsSumK(input, k);
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j] +" ");
			}
			System.out.println();
		}
		
		
	}

}
