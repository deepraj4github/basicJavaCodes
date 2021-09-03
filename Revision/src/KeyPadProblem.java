import java.util.Scanner;
public class KeyPadProblem {
	
	 private static String[] getOptions(int num) {
			String option="";
			if(num==2) {
				option= "abc";
			}
			else if(num==3) {
				option= "def";
			}
			else if(num==4) {
				option= "ghi";
			}
			else if(num==5) {
				option= "jkl";
			}
			else if(num==6) {
				option= "mno";
			}
			else if(num==7) {
				option= "pqrs";
			}
			else if(num==8) {
				option= "tuv";
			}
			else {
				option= "wxyz";
			}
			String options[] = option.split("");
			return options;
		}
	
	public static String[] keypad(int n){
		if(n==0) {
			String ans[]= {""};
			return ans;
		}
		int r=n%10;
		String options[] = getOptions(r);
		String smallAns[] = keypad(n/10);
		String ans[] = new String[smallAns.length*options.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			String a = smallAns[i];
			for(int j=0;j<options.length;j++) {
				String result="";
				String sa = options[j];
				result = a+sa;
				ans[k]=result;
				k++;
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = KeyPadProblem.keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
