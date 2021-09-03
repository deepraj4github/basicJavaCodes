package love_babbar_recurrsions;
import java.util.Scanner;


public class Counting {
	
	private static void count(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		count(n-1);
	}
	private static void countfromback(int n) {
		if(n==0) {
			return;
		}
		countfromback(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		//count(n);
		countfromback(n);

	}

}
