package love_babbar_recurrsions;

import java.util.Scanner;

public class FibonacciSeries {
	private static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		System.out.println(fibonacci(n));

	}

}
