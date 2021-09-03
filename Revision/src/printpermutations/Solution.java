package printpermutations;
import java.util.Scanner;
import java.util.ArrayList;
public class Solution {

	 private static ArrayList<String> FindPermutations(String s,int sI, String output) {
		 //bas case
		 if(s.length()==0) {
			ArrayList<String> ans = new ArrayList<String>();
			ans.add(output);
			return ans;
		 }
		 ArrayList<String> ans = new ArrayList<String>();
		 for(int i=0;i<s.length();i++) {
			 String currentChar = s.charAt(i) +"";
			 String remainingString = s.substring(0, i) + s.substring(i+1);
			 String newOutput = output + currentChar;
			 ArrayList<String> smallAns = FindPermutations(remainingString, sI, newOutput);
			 ans.addAll(smallAns);
			 
		 }
		 return ans;
	 }
	
	 private static ArrayList<String> FindPermutations(String s,int sI) {
	        // Write your code here.
		 String output="";
		 ArrayList<String> list = FindPermutations(s, 0, output);
		 return list;
		 
	    }
	    
	    public static ArrayList<String> FindPermutations(String STR) {
	        ArrayList<String> list = FindPermutations(STR,0);
	        return list;
	    }

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter String: ");
		String s = sc.nextLine();
		ArrayList<String> list = FindPermutations(s);
		for(String str: list){
			System.out.println(str);
		}

	}

}
