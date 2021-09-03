package returnsubsetofanarraym2;

public class Solution {
	
	public static int[][] subsets(int input[],int start)
	{
	    if(input.length <=   start) {
	        int arr[][] = new int[1][0];

	        return arr;
	    }

	    int[][] arr = subsets(input,start+1);
	    int[][] smallArr = new int[2*arr.length][];

	    int k = 0;
		


	        for (int i = 0; i < arr.length; i++) {
	            smallArr[i] = new int[arr[i].length];
	            for (int j = 0; j < arr[i].length; j++) {
	                smallArr[i][j] = arr[i][j];

	            }
	            k++;
	        }




	        for (int i = 0; i < arr.length; i++) {
	            smallArr[k+i] = new int[arr[i].length+1];
	            smallArr[k+i][0] = input[start];
	            for (int j = 1; j <= arr[i].length; j++) {

	                smallArr[i+k][j] = arr[i][j-1];
	            }

	        }


	    return smallArr;

	}

	
	public static int[][] subsets(int input[]) {
	    return subsets(input,0);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


