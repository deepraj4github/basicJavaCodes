package love_babbar_recurrsions;
import java.util.Scanner;
public class PrintPermutations {
	
	private static String swap(String s,int i, int j) {
		char temp = s.charAt(i);
		char[] carr = s.toCharArray();
		carr[i] = carr[j];
		carr[j] = temp;
		return String.valueOf(carr);
		
		
	}
	
	private static void findPermutations(String s, int sI,int eI){
        if(sI>=eI){
           System.out.println(s);
           return;
		}
        
        for(int i=0;i<s.length();i++) {
        	s = swap(s, sI, i);
        	findPermutations(s, sI+1,eI);
        	s = swap(s, sI, i);	
        }
	}
    public static void findPermutations(String s) {
        findPermutations(s,0,s.length()-1);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		findPermutations(s);

	}

}
