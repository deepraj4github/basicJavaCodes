package printallcodes;

import java.util.Scanner;

public class Solution {
	
	public static String numberToCharacter(String num) {
		int n = Integer.parseInt(num);
		int zero=48;
		if(n>=1 && n<=26) {
			n = zero +zero+n;
		}
		int i=n;
		return (char)i+"";
	}
	
	public static void printAllpossibleCodes(String input, String output) {
		
		//base case
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		String s = input.charAt(0)+"";
		String stc = numberToCharacter(s);
		// single digit call
		printAllpossibleCodes(input.substring(1), output + stc);
		
		
		String ss="";
		if(input.length()>=2) {
			ss = input.substring(0, 2);
			String sstc = numberToCharacter(ss);
			int x = Integer.parseInt(ss);
			if(x<=26) {
				//double digit call
				printAllpossibleCodes(input.substring(2), output +sstc );
			}
		}
		
		
	}
	
	public static void printAllpossibleCodes(String input) {
		String output="";
		printAllpossibleCodes(input, output);
		
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter String: ");
		String s = sc.nextLine();
		sc.close();
		printAllpossibleCodes(s);

	}

}
