package love_babbar_recurrsions;

import java.util.Scanner;

public class SprintSpelling {
	
	public static String spell(int n) {
		switch(n) {
		case 0:
			return "Zero";
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";
		default:
			return "";
			
		}
	}
	
	public static String sprintSpelling(int n) {
		if(n==0) {
			return "";
		}
		String ans="";
		int r = n%10;
		String smallAns = sprintSpelling(n/10);
		String spelling = spell(r);
		ans = smallAns+" "+spelling  ;
		return ans.trim();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		String ans = sprintSpelling(n);
		System.out.println(ans);

	}

}
