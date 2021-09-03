package checckab;
import java.util.Scanner;
public class Solution {
	
	public static boolean checkAB(String input,String ce) {
		if(input.length()==0) {
			return true;
		}
		if(ce.equals("a")) {
			if(!input.startsWith("a") && !input.startsWith("bb")) {
				return false;
			}
		}
		if(ce.equals("bb")) {
			if(!input.startsWith("a")) {
				return false;
			}
		}
		boolean b=true;
		if(input.startsWith("bb")) {
			b=checkAB(input.substring(2), "bb");
		}
		else {
			b=checkAB(input.substring(1), "a");
		}
		return b;
		
	}
	
	public static boolean checkAB(String input) {
		boolean b=true;
		if(!input.startsWith("a")) {
			return false;
		}
		else {
			b=checkAB(input.substring(1), "a");
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println(checkAB(s));
	}

}
