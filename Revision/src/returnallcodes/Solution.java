package returnallcodes;

import java.util.Scanner;
import java.util.ArrayList;

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
	
	private static ArrayList<String> getCode(String input, String output) {
		
		//base case
				if(input.length()==0) {
					ArrayList<String> ans = new ArrayList<String>();
					ans.add(output);
					return ans;
				}
				ArrayList<String> ans = new ArrayList<String>();
				
				String s = input.charAt(0)+"";
				String stc = numberToCharacter(s);
				// single digit call
				ArrayList<String> smallAns = getCode(input.substring(1), output + stc);
				ans.addAll(smallAns);
				
				String ss="";
				if(input.length()>=2) {
					ss = input.substring(0, 2);
					String sstc = numberToCharacter(ss);
					int x = Integer.parseInt(ss);
					if(x<=26) {
						//double digit call
						ArrayList<String> smallAnswer = getCode(input.substring(2), output +sstc );
						ans.addAll(smallAnswer);
					}
				}
				return ans;
		
	}
	
	public static String[] getCode(String input) {
		String output="";
		ArrayList<String> result = getCode(input, output);
		String[] res = result.toArray(new String[0]);
		return res;
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter String: ");
		String s = sc.nextLine();
		sc.close();
		String[] result =getCode(s);
		for(String str: result) {
			System.out.println(str);
		}

	}

}
