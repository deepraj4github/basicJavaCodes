package love_babbar_recurrsions;

import java.util.Scanner;

public class Power {
	
	public static int power(int n) {
		if(n==0) {
			return 1;
		}
		int chhota_answer = power(n/2);
		if(n%2!=0) {
			return 2*chhota_answer*chhota_answer;
		}
		else {
			return chhota_answer*chhota_answer;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		System.out.println(power(n));
	}

}
