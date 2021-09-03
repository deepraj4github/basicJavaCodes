package returnpermutations;

import java.util.Scanner;

public class Solution {
	
	private static void FindPermutations(String s,int sI, String output) {
		 //bas case
		 if(s.length()==0) {
			System.out.println(output);
			return;
		 }
		 for(int i=0;i<s.length();i++) {
			 String currentChar = s.charAt(i) +"";
			 String remainingString = s.substring(0, i) + s.substring(i+1);
			 String newOutput = output + currentChar;
			FindPermutations(remainingString, sI, newOutput);
			 
		 }
	 }
	
	public static void FindPermutations(String str) {
		String output="";
		FindPermutations(str, 0, output);
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter String: ");
		String s = sc.nextLine();
		sc.close();
		FindPermutations(s);

	}

}
